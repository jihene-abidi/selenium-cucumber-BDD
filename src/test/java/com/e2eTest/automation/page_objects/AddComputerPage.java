package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.BasePage;


public class AddComputerPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Computers')]")
    private static WebElement computersMenu;

    @FindBy(xpath = "//a[@title='Show products in category Desktops']")
    private static WebElement categoryDesktop;

    @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
    private static WebElement addToCart;

    @FindBy(xpath = "//p[contains(@class,'content') and contains(text(),'The product has been added')]")
    private static WebElement successMessage;


    public AddComputerPage() {
        super(Setup.getDriver());
    }


    public void clickOnComputersMenu() {
        computersMenu.click();
    }

    public void clickOnDesktopsCategory() {
        categoryDesktop.click();
    }

    public void clickOnAddToCart() {
        addToCart.click();
    }



}