package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoriPage {

    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement basketItem1;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement displayLandingPage;

    public void clickBasket1(){
        basketItem1.click();
    }
    public void selectProductContainer(String sortProductList){
        Select b = new Select (selectContainer);
        b.selectByVisibleText(sortProductList);
    }
    public boolean displayLandingPage(){
        return displayLandingPage.isDisplayed();
    }




    public void clickItemCart(String item){
        String xpath = "//div[.='"+ item +"']/ancestor::div[@class='inventory_item_label']" +
                "/following-sibling::div[@class='pricebar']/button";
        driver.findElement(By.xpath(xpath)).click();
    }


}
