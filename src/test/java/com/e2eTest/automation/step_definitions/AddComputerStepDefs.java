package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AddComputerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AddComputerStepDefs {

    AddComputerPage addComputerPage = new AddComputerPage();


    @When("Je clique sur le menu {string}")
    public void jeCliqueSurLeMenu(String menu) {
        addComputerPage.clickOnComputersMenu();
    }


    @When("Je clique sur la catégorie {string}")
    public void jeCliqueSurLaCategorie(String categorie) {
        addComputerPage.clickOnDesktopsCategory();
    }


    @When("Je clique sur le bouton {string}")
    public void jeCliqueSurLeBoutonDuPremierOrdinateur(String button) {
        addComputerPage.clickOnAddToCart();
    }


    @Then("Un message de succès s'affiche indiquant que le produit a été ajouté au panier")
    public void verifySuccessMessage() {

    }
}