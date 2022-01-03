import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstLesson {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open ww
        //open login form
        // fill form
        //submit login form
    }

    @Test
    public void testStart(){

        //open form new contact
        //fill form
        //submit form

    }
    @Test
    public void testSecond(){
//open form new contact
        //fill form with wrong format
        //submit form
    }
    @AfterMethod
    public void postCondition(){
        //logout
    }
}
