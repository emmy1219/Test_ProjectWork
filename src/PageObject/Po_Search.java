package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.sql.Driver;

public class Po_Search {

    WebDriver driver;

    public Po_Search(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(how = How.NAME, using = "searchQuery")
    private WebElement Searchbx_search;
    @FindBy(how = How.CLASS_NAME, using = "js-suggest-search__item--navigable js-suggest-search__product-item--navigable suggestion-product__link")
    private WebElement btn_search;
    // Mettods
    public void setSearchbx_search(String org) {
        Searchbx_search.sendKeys(org);


    }

    public void clickbuttonSearch(){
        btn_search.click();

    }

}