package manger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    BoardHelper board;
     UserHelper user;

//    public ApplicationManager(WebDriver wd) {
//        this.wd = wd;
//    }

    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/");

        user =new UserHelper(wd);
        board = new BoardHelper(wd);

    }

    public void stop() {
        wd.close();
        wd.quit();
    }

    public BoardHelper getBoard() {

        return board;
    }

    public UserHelper getUser() {

        return user;
    }
}
