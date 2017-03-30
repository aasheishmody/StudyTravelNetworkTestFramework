package stepDefinitions.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class Login extends Page {

    private final LandingPage landingPage;
    private final MyAlbumsPage myAlbumsPage;
    private final NetworkFeedPage networkFeedPage;
    private final AddPhotosPage addPhotosPage;


    public Login() {
        landingPage = PageFactory.initElements(getDriver(), LandingPage.class);
        myAlbumsPage = PageFactory.initElements(getDriver(), MyAlbumsPage.class);
        networkFeedPage = PageFactory.initElements(getDriver(), NetworkFeedPage.class);
        addPhotosPage = PageFactory.initElements(getDriver(), AddPhotosPage.class);
    }

    @Given("^I am on the 'Landing' page$")
    public void iAmOnTheLandingPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'Login' button$")
    public void iClickOnTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following registered email in the 'Email' textbox$")
    public void iEnterTheFollowingRegisteredEmailInTheEmailTextbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following valid password in the 'Email' textbox$")
    public void iEnterTheFollowingValidPasswordInTheEmailTextbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the 'Sign in' button$")
    public void iClickOnTheSignInButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'Network Feed' page is displayed$")
    public void theNetworkFeedPageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following unregistered email in the 'Email' textbox$")
    public void iEnterTheFollowingUnregisteredEmailInTheEmailTextbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the login is unsuccessful$")
    public void theLoginIsUnsuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the following invalid password in the 'Email' textbox$")
    public void iEnterTheFollowingInvalidPasswordInTheEmailTextbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the 'Close Window' icon of the 'Login' prompt$")
    public void iClickOnTheCloseWindowIconOfTheLoginPrompt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'Login' prompt is not displayed$")
    public void theLoginPromptIsNotDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the 'Landing' page is displayed$")
    public void theLandingPageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
