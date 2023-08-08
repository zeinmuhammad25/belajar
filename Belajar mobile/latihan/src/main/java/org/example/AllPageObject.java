package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPageObject {

    public static WebDriver webDriver;

    public AllPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement btnLogin;

    public  void setUserName(String usrName){
        userName.sendKeys(usrName);
    }

    public  void setPassword(String pssword){
        password.sendKeys(pssword);
    }

    public  void clickLogin(){
        btnLogin.click();
    }

    public void clickProduct(String item){
        webDriver.findElement(By.xpath("//*[contains(text(),'"+ item +"')]//ancestor::div[@class='inventory_item']//*[contains(text(),'Add to cart')]")).click();
    }

    public void clickCart(){
        webDriver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
    }
    public static  String inventoryProductPrice;
    public static  String cartProductPrice;

    public static String textInventory(){
        return inventoryProductPrice = webDriver.findElement(By.xpath("//*[contains(text(),'Backpack')]//ancestor::div[@class='inventory_item']//div[@class='inventory_item_price']")).getText();
    }

    public static String textCart(){
       return cartProductPrice = webDriver.findElement(By.xpath("//*[contains(text(),'Backpack')]//ancestor::div[@class='cart_item']//div[@class='inventory_item_price']")).getText();
    }



}
