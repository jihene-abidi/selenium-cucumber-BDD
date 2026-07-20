Feature: Ajouter un ordinateur au panier

  Background:
    Given Je me connecte sur le site Demo Web Shop
    When Je clique sur le bouton log in
    And Je saisie une adresse mail
    And Je saisie un mot de passe
    And Je clique sur le bouton login

  @add-computer
  Scenario: Ajouter un ordinateur Desktop au panier
    When Je clique sur le menu "Computers"
    And Je clique sur la catégorie "Desktops"
    And Je clique sur le bouton "Add to cart"
    Then Un message de succès s'affiche indiquant que le produit a été ajouté au panier