package stepDefinitions.logout;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class Logout extends Page {

    private final LandingPage landingPage;
    private final MyAlbumsPage myAlbumsPage;
    private final NetworkFeedPage networkFeedPage;
    private final AddPhotosPage addPhotosPage;

    public Logout() {
        landingPage = PageFactory.initElements(getDriver(), LandingPage.class);
        myAlbumsPage = PageFactory.initElements(getDriver(), MyAlbumsPage.class);
        networkFeedPage = PageFactory.initElements(getDriver(), NetworkFeedPage.class);
        addPhotosPage = PageFactory.initElements(getDriver(), AddPhotosPage.class);
    }

    @And("^I click on the 'Logout' link in the sidebar menu$")
    public void iClickOnTheLogoutLinkInTheSidebarMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
