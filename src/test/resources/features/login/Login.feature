@login
Feature: Login

  As a user
  I want to login to the Study Travel network Website
  So that I use all its features

  Background:
    Given I am on the 'Landing' page


  Scenario: Successful Login
    And I click on the 'Login' button
    And I enter the following registered email in the 'Email' textbox
      |UserName                |
      |registered@studytravel.network|
    And I enter the following valid password in the 'Email' textbox
      |Password|
      |Test1234|
    When I click on the 'Sign in' button
    Then the 'Network Feed' page is displayed

  Scenario: UnSuccessful Login with unregistered email
    And I click on the 'Login' button
    And I enter the following unregistered email in the 'Email' textbox
      |UserName                |
      |unregistered@studytravel|
    And I enter the following valid password in the 'Email' textbox
      |Password|
      |Valid1234|
    When I click on the 'Sign in' button
    Then the login is unsuccessful

  #Additional tests can be added for error validation, fields validation, Keep me logged in functionality,
  #Forgot password functionality and the x icon to close the login prompt but the slide show does not provide for that
  Scenario: UnSuccessful Login with invalid password
    And I click on the 'Login' button
    And I enter the following registered email in the 'Email' textbox
      |UserName                |
      |registered@studytravel.network|
    And I enter the following invalid password in the 'Email' textbox
      |Password|
      |invalid1234|
    When I click on the 'Sign in' button
    Then the login is unsuccessful

  Scenario: UnSuccessful Login with no password
    And I click on the 'Login' button
    And I enter the following registered email in the 'Email' textbox
      |UserName                |
      |registered@studytravel.network|
    When I click on the 'Sign in' button
    Then the login is unsuccessful

  Scenario: UnSuccessful Login with no email
    And I click on the 'Login' button
    And I enter the following valid password in the 'Email' textbox
      |Password|
      |Valid1234|
    When I click on the 'Sign in' button
    Then the login is unsuccessful

  Scenario: Login prompt can be closed by clicking the 'Close Window' icon
    And I click on the 'Login' button
    And I click on the 'Close Window' icon of the 'Login' prompt
    Then the 'Login' prompt is not displayed