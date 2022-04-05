import io.github.bonigarcia.wdm.WebDriverManager;
import manger.ApplicationManager;
import manger.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.init();

    }

    @AfterMethod
    public void tearDown() {

        app.stop();
    }




//    public void click(By locator) {
//
//        wd.findElement(locator).click();
//    }

    public boolean isLogged() {
        return wd.findElements(By.cssSelector("._2ft40Nx3NZII2i")).size() > 0;
    }

}
