import Elements.HomePageElements;
import Library.AppLib;
import Pages.SetUp;
import org.testng.annotations.Test;
import Library.DataProviderTest;

public class HomePageTest extends SetUp {
    HomePageElements MyElements;
    @Test
    public void LandingOnHomePage() throws InterruptedException {
            MyElements = new HomePageElements(driver);
            MyElements.Access.click();
            MyElements.AcceptLink.click();
            Thread.sleep(3000);
            MyElements.AcceptButton.click();
            //MyElements.CloseLimitedTimeOffer.click();
            App().Pages().myHomePage().StartApp();
    }

    @Test(dependsOnMethods = {"LandingOnHomePage"}, alwaysRun = true)
    public void ClickOnSignInLinkHeader(){
        MyElements.HeaderSignInLink.click();
    }

    @Test(dataProvider = "dataProvider2", dataProviderClass = DataProviderTest.class, dependsOnMethods = {"LandingOnHomePage"}, alwaysRun = true)
    public void MembersCredentials(String userName, String userPassword) throws InterruptedException {
        MyElements.HeaderSignInLink.click();
        MyElements.HomePageUserName.sendKeys(userName);
        MyElements.HomePageUserPassword.sendKeys(userPassword);
        MyElements.HeaderSignInCTA.click();
        Thread.sleep(5000);
        MyElements.HeaderLoggedInUser.click();
        MyElements.HeaderSignOutCTA.click();
    }
}
