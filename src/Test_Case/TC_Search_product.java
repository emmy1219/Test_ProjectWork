package Test_Case;

import Utill.BrowserMg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_Search_product  {
    String url = "https://www.ratioform.at";
     @Test
     public void Tc_search(){
         System.setProperty("webdriver.gecko.driver","C://Users//PC//geckodriver//geckodriver.exe");
        WebDriver driver = BrowserMg.getDriver();
        driver.get(url);
        driver.findElement(By.name("searchQuery")).sendKeys("wellpapp");
         driver.findElement(By.className("js-suggest-search__item--navigable js-suggest-search__product-item--navigable suggestion-product__link")).click();
    }


}
