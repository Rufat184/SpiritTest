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
    @FindBy (xpath="//*[@id='t133-wrapper']/div[1]/svg/path[1]") public WebElement CloseLimitedTimeOffer;
    @FindBy (xpath="//div[@class='ot-sdk-row']") public WebElement AcceptCookiesRow;
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-login']") public WebElement HeaderSignInLink;
    @FindBy(id = "ngb-popover-3") public WebElement SignInWindow;
    @FindBy(id = "home-page-username") public WebElement HomePageUserName;
    @FindBy(id = "home-page-password") public WebElement HomePageUserPassword;
    @FindBy(xpath = "//button[@data-qa='home-page.login-input-new-signUp-button']") public WebElement HeaderSignInCTA;
    @FindBy(xpath = "(//a[@role='button'][normalize-space()='Sign Out'])[3]") public WebElement HeaderSignOutCTA;
    @FindBy(xpath = "//a[@data-qa='header-logged-in-display-name']") public WebElement HeaderLoggedInUser;
    @FindBy(xpath = "(//span[@class='d-lg-block d-none font-weight-bold'][normalize-space()])[5]") public WebElement MemberType;
    @FindBy(xpath = "//p[contains(text(),'Area')]") public List <WebElement> MacCitiesOrigin;
    @FindBy(xpath = "//app-station-picker-dropdown[@class='stationPickerDestDropdown ng-tns-c142-3']//div[@class='container pb-2 ng-star-inserted']//p[contains(text(),'Area')]") public List <WebElement> MacCitiesDestination;
    @FindBy(xpath = "//label[@for='flight-OriginStationCode']") public WebElement OriginField;
    @FindBy(xpath = "//label[@for='flight-DestinationStationCode']") public WebElement DestinationField;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
