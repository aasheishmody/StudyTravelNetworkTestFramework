@logout
Feature: Logout

  As a user
  I want to logout of the study travel network website
  So that nobody else can access my personal details

  Background:
    Given I am logged in

  Scenario: Logout
    And I click on the 'Logout' link in the sidebar menu
    Then the 'Landing' page is displayed