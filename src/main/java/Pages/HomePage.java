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
import static org.hamcrest.CoreMatchers.is;
import static org.testng.Assert.assertFalse;

public class HomePage {
    WebDriver driver;
    HomePageElements MyElements;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        MyElements = new HomePageElements(driver);
    }

    public void StartApp (){
        System.out.println("APPLICATION STARTED");
    }
    //Bypass certificates
    public void LandingOnHomePage(){
        try{
            MyElements = new HomePageElements(driver);
//            MyElements.Access.click();
//            MyElements.AcceptLink.click();
            Thread.sleep(3000);
            MyElements.AcceptButton.click();
        }catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
    }

    public void OriginField(String departureCity){
        MyElements.OriginField.sendKeys(departureCity);
        List<WebElement> departure = MyElements.SortedOriginFieldList;
        for (WebElement option : departure) {
            if (option.getText().equalsIgnoreCase(departureCity)) {
                System.out.println(option.getText());
                option.click();
                System.out.println("Departure CITY IS FOUND and selected");
                break;
            }
            Assert.assertFalse(departure.isEmpty());
        }
        System.out.println("Departure City is " + MyElements.OriginField.getText());
    }

    public void ToField(String destinationCity){
        MyElements.DestinationField.sendKeys(destinationCity);
        List<WebElement> destination = MyElements.SortedOriginFieldList;
        for (WebElement option : destination) {
            if (option.getText().equalsIgnoreCase(destinationCity)) {
                System.out.println(option.getText());
                option.click();
                System.out.println("Destination CITY IS FOUND and selected");
                break;
            }
        }
        System.out.println("Departure City is " + MyElements.DestinationField.getText());
    }
}
