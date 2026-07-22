package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LogoutPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.Validations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.gl.Logo;

public class LogoutSteps {

    LogoutPage logoutPage = new LogoutPage();
    ActionsUtils actionsUtils = new ActionsUtils();
    Validations validations = new Validations();

    @When("Je clique sur le bouton logout")
    public void jeCliqueSurLeBoutonLogout() {
        actionsUtils.click(LogoutPage.getLogoutButton());
    }
    @Then("Je me redirige vers la page login {string}")
    public void jeMeRedirigeVersLaPageLogin(String loginBtn) {
        validations.assertEquals(LogoutPage.getLoginButton(), loginBtn);
    }
}
