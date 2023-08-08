package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    public static WebDriver webDriver;



    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilter;

    public void selectProductFilter(String sort){
        Select a = new Select(selectFilter);
        a.selectByVisibleText(sort);
    }

    public void pickProduct(String namaProduct){
        webDriver.findElement(By.xpath("//div[text()='"+ namaProduct +"']//ancestor::div[@class='inventory_item']/div[2]/div[2]/button")).click();
    }

    public void clickCart(){
        webDriver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
    }

    public static String inventoryProductPrice;
    public static String cartProductPrice;

    public static void textPriceInventory(){
        inventoryProductPrice = webDriver.findElement(By.xpath("//*[contains(text(),'Bike Light')]//ancestor::div[@class='inventory_item']//div[@class='inventory_item_price']")).getText();
    }
    public static void textPriceCart(){
        cartProductPrice = webDriver.findElement(By.xpath("//*[contains(text(),'Bike Light')]//ancestor::div[@class='cart_item']//div[@class='inventory_item_price']")).getText();
    }
}
