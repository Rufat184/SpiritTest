package HomePage;

import Elements.HomePageElements;
import Pages.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        MyElements = new HomePageElements(driver);
        MyElements.OriginField.click();
        Thread.sleep(1000);
        List<WebElement> macCitiesList = MyElements.MacCitiesOrigin;
        System.out.println(macCitiesList.size());
        for (WebElement cities: macCitiesList) {
            System.out.println(cities.getText());
        }
    }
    //Mac Cities Presence for Destination Field
    @Test(dependsOnMethods = {"LandingOnHome"}, alwaysRun = true)
    public void macCitiesPresenceDestination() throws InterruptedException {
        MyElements = new HomePageElements(driver);
        MyElements.DestinationField.click();
        Thread.sleep(1000);
        List<WebElement> macCitiesList = MyElements.MacCitiesDestination;
        System.out.println(macCitiesList.size());
        for (WebElement cities: macCitiesList) {
            System.out.println(cities.getText());
        }
    }
}
