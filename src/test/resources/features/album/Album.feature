@album
Feature: Album

  As a user
  I want to add pictures to albums
  So that I can share it with people on the Study Travel Network website

  Background:
    Given I am logged in

  Scenario: 'My Albums' page is displayed
    And I click on the 'My Photos' section in the sidebar menu
    Then the 'My Albums' page is displayed

  Scenario: 'New Album' popup window is displayed
    And I navigate to the 'My Albums' page
    And I click on the 'Add album' button
    Then the 'New Album' popup window is displayed

  Scenario: 'New Album' popup window can be closed through the 'Close Window' icon
    And I navigate to the 'New Album' popup window
    And I click on the 'Close Window' icon on the 'New Album' popup window
    Then the 'New Album' popup window is closed

  Scenario: 'New Album' popup window can be closed through the 'Cancel' button
    And I navigate to the 'New Album' popup window
    And I click on the 'Cancel' button on the 'New Album' popup window
    Then the 'New Album' popup window is closed

  Scenario: New Album can be successfully created
    And I navigate to the 'New Album' popup window
    And I enter the following album name in the 'Album Name' textbox of the 'New Album' popup window
      | Test Album |
    And I enter the following description in the 'Description' textbox of the 'New Album' popup window
      | Testing the Album |
    And I click on the following 'Permissions' radio button of the 'New Album' popup window
      | This album is open to anybody |
    And I click on the 'Create Album' button of the 'New Album' popup window
    Then the following album is successfully created on the 'My Albums' page
      | Test Album |

  Scenario: 'Add Photos' page is displayed
    And I navigate to the 'My Albums' page
    And I click on the following album on the 'My Albums' page
      | Test Album |
    Then the 'Add Photos' page is displayed

  #mechanism of uploading photos has been skipped in the slide show and hence no test has been added to check the functionality
  Scenario: 'Add Photos' page is displayed
    And I navigate to the 'Add Photos' page
    And I upload a picture on the 'Add Photos' page
    And I enter the following description in the 'Description' textbox of the 'Add Photos' page
      | Testing the adding of pictures in an album |
    And I select the following tag in the 'Tags' dropdown menu of the 'Add Photos' page
      | test |
    When I click on the 'Save Photos' button on the 'Add Photos' page
    Then the pictures are displayed in the album


  #Automation test frameworks do not usually have separate tests for checking the contents of the pages as they
  #are already checked while testing the respective functionalities.