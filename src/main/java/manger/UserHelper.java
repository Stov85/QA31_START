package manger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UserHelper extends HelperBase{

    public UserHelper(WebDriver wd) {
        super();
    }

    public boolean isLoggedSuccess(){
        WebDriverWait wait= new WebDriverWait(wd,10);
        wait.until(ExpectedConditions.visibilityOf(wd.findElement(By.cssSelector("._9Bfh6AVH84yAZe"))));
        return wd.findElement (By.cssSelector("._9Bfh6AVH84yAZe")).isDisplayed();
    }
//._2ft40Nx3NZII2i
        public void submitLogin() {
            click(By.cssSelector("#login-submit"));
        }

        public void fillLoginForm() {
            type(By.cssSelector("#user"), "stanorlov85@gmail.com");
            click(By.cssSelector("#login"));
            type(By.cssSelector("#password"),"12345.com");
        }

        @Test
        public void loginTest2() {

            initLogin();
            type(By.cssSelector("#user"), "stanorlov85@gmail.com");
            click(By.cssSelector("#login"));
            click(By.cssSelector(".dlMUdg"));
            type(By.cssSelector("#password"),"12345.com");
            submitLogin();


        }
        public void initLogin() {
            click(By.cssSelector("[href='/login']"));
        }
        public void logout(){
            click(By.cssSelector("[data-test-id='header-member-menu-button'"));
            click(By.cssSelector("[data-test-id='header-member-menu-logout']"));
            click(By.cssSelector("[data-testid='logout-button']"));

        }

    public boolean isLogged(){
        return  wd.findElements(By.cssSelector("[data-test-id='header-member-menu-button'")).size()>0;
    }

    }
