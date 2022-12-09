package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElements {
    WebDriver driver;
    @FindBy (id="details-button") public WebElement Access;
    @FindBy (id="proceed-link") public WebElement AcceptLink;
    @FindBy (id="onetrust-accept-btn-handler") public WebElement AcceptButton;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
