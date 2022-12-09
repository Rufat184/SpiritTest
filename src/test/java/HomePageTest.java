import Elements.HomePageElements;
import Library.AppLib;
import Pages.SetUp;
import org.testng.annotations.Test;

public class HomePageTest extends SetUp {
    HomePageElements MyElements;
    @Test
    public void myFirst() throws InterruptedException {
        MyElements = new HomePageElements(driver);
        MyElements.Access.click();
        MyElements.AcceptLink.click();
        Thread.sleep(2000);
        MyElements.AcceptButton.click();
        App().Pages().myHomePage().StartApp();
    }
}
