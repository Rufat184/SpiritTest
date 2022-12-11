package HomePage;

import Elements.HomePageElements;
import Pages.SetUp;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FSJSLTOTilesPresence extends SetUp {
    HomePageElements MyElements;

    @Test
    public void LandingOnHome() throws InterruptedException {
        App().Pages().myHomePage().LandingOnHomePage();
    }

    @Test(dependsOnMethods = {"LandingOnHome"}, alwaysRun = true)
    public void freeSpiritTileIsDisplayed() {
        MyElements = new HomePageElements(driver);
        List<WebElement> myTiles = MyElements.FreeSpiritTiles;
        for (int i = 0; i < myTiles.size(); i++) {
            System.out.println(myTiles.get(i).getText());
            Assert.assertTrue(myTiles.get(0).isDisplayed(), "Free Spirit Tile Should be Displayed");
        }
    }

    @Test(dependsOnMethods = {"LandingOnHome"}, alwaysRun = true)
    public void joinSpiritSaversClubTileIsDisplayed() {
        MyElements = new HomePageElements(driver);
        List<WebElement> myTiles = MyElements.FreeSpiritTiles;
        for (int i = 0; i < myTiles.size(); i++) {
            System.out.println(myTiles.get(i).getText());
            Assert.assertTrue(myTiles.get(2).isDisplayed(), "Limited Time Only Tile Should be Displayed");
        }
    }
    @Test(dependsOnMethods = {"LandingOnHome"}, alwaysRun = true)
    public void limitedTimeOnlyTileIsDisplayed() {
        MyElements = new HomePageElements(driver);
        List<WebElement> myTiles = MyElements.FreeSpiritTiles;
        for (int i = 0; i < myTiles.size(); i++) {
            System.out.println(myTiles.get(i).getText());
            Assert.assertTrue(myTiles.get(2).isDisplayed(), "Limited Time Only Tile Should be Displayed");
        }
    }
}

