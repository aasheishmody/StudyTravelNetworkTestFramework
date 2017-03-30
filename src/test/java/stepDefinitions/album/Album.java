package stepDefinitions.album;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class Album extends Page {

    private final LandingPage landingPage;
    private final MyAlbumsPage myAlbumsPage;
    private final NetworkFeedPage networkFeedPage;
    private final AddPhotosPage addPhotosPage;


    public Album() {
        landingPage = PageFactory.initElements(getDriver(), LandingPage.class);
        myAlbumsPage = PageFactory.initElements(getDriver(), MyAlbumsPage.class);
        networkFeedPage = PageFactory.initElements(getDriver(), NetworkFeedPage.class);
        addPhotosPage = PageFactory.initElements(getDriver(), AddPhotosPage.class);
    }

    @Given("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'My Photos' section in the sidebar menu$")
    public void iClickOnTheMyPhotosSectionInTheSidebarMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'My Albums' page is displayed$")
    public void theMyAlbumsPageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I navigate to the 'My Albums' page$")
    public void iNavigateToTheMyAlbumsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'Add album' button$")
    public void iClickOnTheAddAlbumButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'New Album' popup window is displayed$")
    public void theNewAlbumPopupWindowIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I navigate to the 'New Album' popup window$")
    public void iNavigateToTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'Close Window' icon on the 'New Album' popup window$")
    public void iClickOnTheCloseWindowIconOnTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'New Album' popup window is closed$")
    public void theNewAlbumPopupWindowIsClosed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'Cancel' button on the 'New Album' popup window$")
    public void iClickOnTheCancelButtonOnTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following album name in the 'Album Name' textbox of the 'New Album' popup window$")
    public void iEnterTheFollowingAlbumNameInTheAlbumNameTextboxOfTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following description in the 'Description' textbox of the 'New Album' popup window$")
    public void iEnterTheFollowingDescriptionInTheDescriptionTextboxOfTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the following 'Permissions' radio button of the 'New Album' popup window$")
    public void iClickOnTheFollowingPermissionsRadioButtonOfTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'Create Album' button of the 'New Album' popup window$")
    public void iClickOnTheCreateAlbumButtonOfTheNewAlbumPopupWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the following album is successfully created on the 'My Albums' page$")
    public void theFollowingAlbumIsSuccessfullyCreatedOnTheMyAlbumsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the following album on the 'My Albums' page$")
    public void iClickOnTheFollowingAlbumOnTheMyAlbumsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'Add Photos' page is displayed$")
    public void theAddPhotosPageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I navigate to the 'Add Photos' page$")
    public void iNavigateToTheAddPhotosPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I upload a picture on the 'Add Photos' page$")
    public void iUploadAPictureOnTheAddPhotosPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following description in the 'Description' textbox of the 'Add Photos' page$")
    public void iEnterTheFollowingDescriptionInTheDescriptionTextboxOfTheAddPhotosPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select the following tag in the 'Tags' dropdown menu of the 'Add Photos' page$")
    public void iSelectTheFollowingTagInTheTagsDropdownMenuOfTheAddPhotosPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the 'Save Photos' button on the 'Add Photos' page$")
    public void iClickOnTheSavePhotosButtonOnTheAddPhotosPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the pictures are displayed in the album$")
    public void thePicturesAreDisplayedInTheAlbum() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
