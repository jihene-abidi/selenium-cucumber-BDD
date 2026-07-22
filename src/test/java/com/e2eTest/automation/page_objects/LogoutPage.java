package com.e2eTest.automation.page_objects;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage extends BasePage {

    /*
     * Retrieve WebElement
     * */
    @FindBy(how = How.CSS, using = ".ico-logout")
    private static WebElement logoutButton;

    @FindBy(how = How.CSS, using = ".ico-login")
    private static WebElement loginButton;

    public LogoutPage() {
        super(Setup.getDriver());
    }

    public static WebElement getLogoutButton() {
        return logoutButton;

    }

    public static WebElement getLoginButton() {
        return loginButton;

    }


}
