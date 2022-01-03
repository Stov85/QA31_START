import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class PhoneBookTests {

    WebDriver wd;

    @BeforeMethod
    public void openSite(){
    wd= new ChromeDriver();
    wd.manage().window().maximize();
   //d.get(); //without history
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//with history
    }
    @Test
    public void phoneBookStart(){
        WebElement element = wd.findElement(By.tagName("a"));
        element.click();
        element.clear();
        element.sendKeys("hello");
        List <WebElement> list= wd.findElements(By.tagName("a"));

        WebElement elid = wd.findElement(By.id("root"));
        WebElement elClass = wd.findElement(By.className("container"));
        WebElement elLink = wd.findElement(By.linkText("HOME"));
        WebElement lLink2 =wd.findElement(By.partialLinkText("HOM"));
    }

    @Test
    public  void filFormLogin(){
        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("qwerty123@gmail.com");

        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Qwerty123$");

        WebElement buttonLogin = wd.findElement(By.tagName("button"));
        buttonLogin.click();
        // ASSER : Ex (present "sign out") = Ac("sign out")
    }

    @Test
    public void fillRegistrationTest(){
        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("qwerty1234567890@gmail.com");

        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Qwerty123456789$");

        List <WebElement> list1 = wd.findElements(By.tagName("button"));
        WebElement buttonRegistration = list1.get(1);

        buttonRegistration.click();
    }

    @AfterMethod
    public void close(){
         //  wd.quit(); //all tab
        // wd.close(); //focus wd
    }
}
