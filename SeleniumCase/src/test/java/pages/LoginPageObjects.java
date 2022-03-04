package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class LoginPageObjects extends BasePageObjects{
    public LoginPageObjects(WebDriver driver){

        this.driver=driver;
    }
    By login_button = By.xpath("//*[@id=\"global_action_menu\"]/a");
    By nick_name_text_box = By.id("input_username");
    By password_text_box = By.id("input_password");

    By submit_button = By.xpath("//*[@id=\"login_btn_signin\"]/button");
    public void clickLoginButton(){
        driver.findElement(login_button).click();
    }
    public void setTextIntoNickNameTextBox(String text) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(nick_name_text_box).sendKeys(text);
        Thread.sleep(2000);

    }
    public void setTextIntoPasswordTextBox(String text) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(password_text_box).sendKeys(text);
        Thread.sleep(2000);

    }

    public void clickSubmitButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(submit_button).click();
        Thread.sleep(2000);
    }







}
