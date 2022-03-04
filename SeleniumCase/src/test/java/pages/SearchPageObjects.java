package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchPageObjects extends  BasePageObjects{
    public SearchPageObjects(WebDriver driver){

        this.driver=driver;
    }
    By search_item = By.xpath("//*[@id=\"store_nav_search_term\"]");
    By search_button = By.xpath("//*[@id=\"store_search_link\"]");
    By click_item = By.xpath("//*[@id=\"search_resultsRows\"]/a[1]");
    public void setTextIntoItemTextBox(String text) throws InterruptedException{

        driver.findElement(search_item).sendKeys(text);
        Thread.sleep(2000);
    }
    public  void clickSearchButton() throws InterruptedException {
        driver.findElement(search_button).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void  clickItem() throws InterruptedException{
        driver.findElement(click_item).click();
        Thread.sleep(2000);
    }
}
