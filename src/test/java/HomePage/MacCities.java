package HomePage;

import Elements.HomePageElements;
import Pages.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MacCities extends SetUp {
    HomePageElements MyElements;

    @Test
    public void LandingOnHome() throws InterruptedException {
        App().Pages().myHomePage().LandingOnHomePage();
        App().Pages().myHomePage().StartApp();
    }
    //Mac Cities Presence for Origin Field
    @Test(dependsOnMethods = {"LandingOnHome"}, alwaysRun = true)
    public void macCitiesPresenceOrigin() throws InterruptedException {
        String [] myMacCitiesExpected = {"Boston Area", "Cleveland Area", "Los Angeles Area", "Miami Area", "New York City Area", "Philadelphia Area",
                "Pittsburgh Area"};
        MyElements = new HomePageElements(driver);
        MyElements.OriginField.click();
        Thread.sleep(1000);
        List<WebElement> macCitiesList = MyElements.MacCitiesOrigin;
        Assert.assertEquals(myMacCitiesExpected.length, macCitiesList.size());
        //Check cities
        for (int i = 0; i < macCitiesList.size(); i++) {
            System.out.println(macCitiesList.get(i).getText());
            for (int j = 0; j < myMacCitiesExpected.length; j++) {
                System.out.println(myMacCitiesExpected[j]);
                Assert.assertEquals(macCitiesList.get(i).getText(), myMacCitiesExpected[i]);
            }
        }

    }
    //Mac Cities Presence for Destination Field
    @Test(dependsOnMethods = {"LandingOnHome"}, alwaysRun = true)
    public void macCitiesPresenceDestination() throws InterruptedException {
        String [] myMacCitiesExpected = {"Boston Area", "Cleveland Area", "Los Angeles Area", "Miami Area", "New York City Area", "Philadelphia Area",
                "Pittsburgh Area"};
        MyElements = new HomePageElements(driver);
        MyElements.DestinationField.click();
        Thread.sleep(1000);
        List<WebElement> macCitiesList = MyElements.MacCitiesDestination;
        Assert.assertEquals(myMacCitiesExpected.length, macCitiesList.size());
        //Check cities
        for (int i = 0; i < macCitiesList.size(); i++) {
            System.out.println(macCitiesList.get(i).getText());
            for (int j = 0; j < myMacCitiesExpected.length; j++) {
                System.out.println(myMacCitiesExpected[j]);
                Assert.assertEquals(macCitiesList.get(i).getText(), myMacCitiesExpected[i]);
            }
        }
    }
}
