package Library;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PagesLib {
    private WebDriver driver;
    private HomePage homepage;


    public PagesLib(WebDriver driver) {
        this.driver = driver;
        homepage = new HomePage(this.driver);
    }

    public HomePage myHomePage(){
        return homepage;
    }
}
