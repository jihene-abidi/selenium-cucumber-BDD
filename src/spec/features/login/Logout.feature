@logout @smokeTest
Feature: Je souhaite tester la page logout de l'application Demo Web Shop

  Background:
    Given Je me connecte sur le site Demo Web Shop
    When Je clique sur le bouton log in
    And Je saisie une adresse mail
    And Je saisie un mot de passe
    And Je clique sur le bouton login

  @logout
  Scenario: Je souhaite tester la page logout
    When Je clique sur le bouton logout
    Then Je me redirige vers la page login "Log in"