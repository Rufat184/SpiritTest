package Pages;

import Elements.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends SetUp {

    HomePageElements MyElements;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        MyElements = new HomePageElements(driver);
    }

    public void StartApp (){
        System.out.println("APPLICATION STARTED");
    }
}