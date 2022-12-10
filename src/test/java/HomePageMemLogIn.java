import Elements.HomePageElements;
import Pages.SetUp;
import org.testng.annotations.Test;
import Library.DataProviderTest;

import java.time.Duration;

public class HomePageMemLogIn extends SetUp {
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
    //Validate that all Members can to Log In
    @Test(dataProvider = "dataProvider2", dataProviderClass = DataProviderTest.class, dependsOnMethods = {"LandingOnHomePage"}, alwaysRun = true)
    public void MembersLogIn(String userName, String userPassword) throws InterruptedException {
        MyElements.HeaderSignInLink.click();
        MyElements.HomePageUserName.sendKeys(userName);
        MyElements.HomePageUserPassword.sendKeys(userPassword);
        MyElements.HeaderSignInCTA.click();
        Thread.sleep(8000);
        MyElements.HeaderLoggedInUser.click();
        String myMember = MyElements.MemberType.getText();
        //System.out.println(myMember);
        if (myMember.equals("FREE SPIRIT")){
            System.out.println("Welcome " + myMember);
            MyElements.HeaderSignOutCTA.click();
        } else if(myMember.equals("FREE SPIRIT SILVER")){
            System.out.println("Welcome " + myMember);
            MyElements.HeaderSignOutCTA.click();
        } else if(myMember.equals("FREE SPIRIT GOLD")){
            System.out.println("Welcome " + myMember);
            MyElements.HeaderSignOutCTA.click();
        }
    }
}

