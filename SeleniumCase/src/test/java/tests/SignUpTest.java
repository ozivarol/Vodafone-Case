package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObjects;
import pages.SearchPageObjects;


public class SignUpTest extends BaseTest {


    @Test
    public void simpleSignUpTest() throws InterruptedException {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.clickLoginButton();
        loginPageObjects.setTextIntoNickNameTextBox("example43430");
        loginPageObjects.setTextIntoPasswordTextBox("11641956Aa");

        loginPageObjects.clickSubmitButton();
    }
    @Test
    public void simpleSearchTest() throws  InterruptedException{
        SearchPageObjects searchPageObjects = new SearchPageObjects(driver);
        searchPageObjects.setTextIntoItemTextBox("Dota2");
        searchPageObjects.clickSearchButton();
        searchPageObjects.clickItem();


    }
}
