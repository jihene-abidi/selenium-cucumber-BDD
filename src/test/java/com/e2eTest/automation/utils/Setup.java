package com.e2eTest.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.logging.log4j.Logger;

/**
 * Utility class for initializing and managing the {@link WebDriver} instance
 * before executing Cucumber scenarios.
 *
 * This class uses the {@code @Before} annotation to automatically start a
 * browser before each scenario. The browser is dynamically selected based on
 * the system property {@code -Dbrowser}.
 *
 * Supported browsers: - chrome (default) - firefox - edge
 * 
 * If no parameter is provided, Chrome will be used by default.
 * 
 * A logger is also available to track scenario status and driver
 * initialization.
 */

public class Setup {
	private static WebDriver driver;
	private static final Logger LOGGER = (Logger) LogManager.getLogger(Setup.class.getCanonicalName());

	@Before
	public void setWebDriver(Scenario scenario) {

		LOGGER.info("Scenario: " + scenario.getName() + " - Started");
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}

		switch (browser) {
		case "chrome":
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.addArguments("disable-infobars");
			chromeoptions.addArguments("disable-extensions");
			driver = new ChromeDriver(chromeoptions);
			break;
		case "firefox":
			FirefoxOptions fireforxOptions = new FirefoxOptions();
			fireforxOptions.addArguments("--start-maximized");
			fireforxOptions.addArguments("disable-infobars");
			fireforxOptions.addArguments("disable-extensions");
			fireforxOptions.setCapability("platform", Platform.WIN11);
			break;

		case "edge":
			driver = new EdgeDriver();

		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported");

		}
	}

	/* Getter */
	public static WebDriver getDriver() {
		return driver;
	}

	public static Logger getLogger() {
		return LOGGER;

	}

}
