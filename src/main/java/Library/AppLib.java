package Library;

import org.openqa.selenium.WebDriver;

public class AppLib {
    private WebDriver driver;
    private PagesLib page;
    private FlowLib flow;

    public AppLib(WebDriver driver){
        this.driver = driver;
        page = new PagesLib(this.driver);
        flow = new FlowLib(this.driver);
    }

    public PagesLib Pages(){
        return page;
    }

    public FlowLib Flow(){
        return flow;
    }

}
