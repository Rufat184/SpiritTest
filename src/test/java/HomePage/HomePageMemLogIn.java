package HomePage;

import Elements.HomePageElements;
import Pages.SetUp;
import org.testng.Assert;
import org.testng.annotations.Test;
import Library.DataProviderTest;

import java.time.Duration;

public class HomePageMemLogIn extends SetUp {
    HomePageElements MyElements;

    @Test
    public void LandingOnHomePage() throws InterruptedException {
            MyElements = new HomePageElements(driver);
            App().Pages().myHomePage().LandingOnHomePage();
            App().Pages().myHomePage().StartApp();
    }

    //Validate that all Members Base, Silver, Gold can to Log In
    @Test(dataProvider = "dataProvider2", dataProviderClass = DataProviderTest.class, dependsOnMethods = {"LandingOnHomePage"}, alwaysRun = true)
    public void MembersLogIn(String userName, String userPassword){
        try{
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
            } else if(myMember.equals("FREE SPIRIT SILVER")){
                System.out.println("Welcome " + myMember);
            } else if(myMember.equals("FREE SPIRIT GOLD")){
                System.out.println("Welcome " + myMember);
            }
            Assert.assertTrue(MyElements.MemberType.isDisplayed(), "Member should be logged In");
            MyElements.HeaderSignOutCTA.click();
        }catch (Exception e){
            System.out.println("Something went wrong " + e);
            driver.close();
        }
    }
}

