package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    ConfigFileReader configFileReader=new ConfigFileReader();

    @Given("Je me connecte sur le site Demo Web Shop")
    public void jeMeConnecteSurLeSiteDemoWebShop() {
        LoginPage.openURL(configFileReader.getProperty("home.url"));
    }
    @When("Je clique sur le bouton log in")
    public void jeCliqueSurLeBoutonLogIn() {
        LoginPage.clickOnLoginBarMenu();
    }
    @When("Je saisie une adresse mail")
    public void jeSaisieUneAdresseMail() {
        LoginPage.fillInputEmail(configFileReader.getProperty("home.email"));
    }
    @When("Je saisie un mot de passe")
    public void jeSaisieUnMotDePasse() {
        LoginPage.fillInputPassword(configFileReader.getProperty("home.password"));
    }
    @When("Je clique sur le bouton login")
    public void jeCliqueSurLeBoutonLogin() {
        LoginPage.clickOnBtnLogin();
    }
    @Then("Je me redirige vers la page home {string}")
    public void jeMeRedirigeVersLaPageHome(String adressEmail) {
        Assert.assertTrue(LoginPage.isLogoutDisplayed());
    }
}
