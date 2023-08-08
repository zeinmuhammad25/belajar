package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {

    public static WebDriver driver;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement vrfyLandingPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement basket1;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket2;

    public void clickBasket1(){
        basket1.click();
    }

    public void clickBasket2(){
        basket2.click();
    }

    public void sortProduct(String sort){
        Select a = new Select(selectContainer);
        a.selectByVisibleText(sort);
    }

    public boolean verifyLandingPage(){
        return vrfyLandingPage.isDisplayed();

    }
}
