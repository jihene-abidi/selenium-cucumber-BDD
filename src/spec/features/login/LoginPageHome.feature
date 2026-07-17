@login
Feature: Je souhaite tester la page login de l'application Demo Web Shop
  ETQ utilisateur je souhaite tester la page login de l'application Demo Web Shop

  @login-validCredentials
  Scenario: Je souhaite tester la page login avec des données valides
    Given Je me connecte sur le site Demo Web Shop
    When Je clique sur le bouton log in
    And Je saisie une adresse mail
    And Je saisie un mot de passe
    And Je clique sur le bouton login
    Then Je me redirige vers la page home