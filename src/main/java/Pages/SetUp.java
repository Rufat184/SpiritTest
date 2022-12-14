package Pages;

import Library.AppLib;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class SetUp {
    public WebDriver driver;
    private AppLib app;
    @Parameters({"Browser", "driverPathChrome", "driverPathFirefox"})
    @BeforeTest(alwaysRun = true)
    public void WebDr(@Optional("Chrome")String Browser, @Optional("/Users/rufatdadashov/eclipse-workspace/JavaSelenium1/Drivers/chromedriver") String exeC,
                      @Optional("/Users/rufatdadashov/eclipse-workspace/JavaSelenium1/Drivers/geckodriver") String exeF) {
        if (Browser.equals("Chrome")){
            //System.setProperty("webdriver.chrome.driver", exeC);
            ChromeOptions handlingSSL = new ChromeOptions();
            handlingSSL.setAcceptInsecureCerts(true);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(handlingSSL);
            app = new AppLib(driver);
            App().Flow().navigateToUrl("https://qa01.nk.spirit.com/");
        } else if (Browser.equals("Firefox")){
            //System.setProperty("webdriver.gecko.driver", exeF);
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setAcceptInsecureCerts(true);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(firefoxOptions);
            App().Flow().navigateToUrl("https://qa01.nk.spirit.com/");
        } else if (Browser.equals("Safari")){
            //System.setProperty("webdriver.gecko.driver", exeF);
            WebDriver driver = new SafariDriver();
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");
            WebDriverManager.safaridriver().setup();
            //driver = new SafariDriver();
            App().Flow().navigateToUrl("https://qa01.nk.spirit.com/");
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public AppLib App(){
        return app;
    }

//    @AfterTest
//    public void CloseB(){
//        driver.close();
//    }
}
