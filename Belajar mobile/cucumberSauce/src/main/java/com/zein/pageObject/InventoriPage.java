package com.zein.pageObject;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoriPage {
    private static WebDriver driver;

    public InventoriPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-backpack']")
    private static WebElement clickButtonIndex1;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private static WebElement productSort;

    public void clickBasketIndex1() {
        clickButtonIndex1.click();
    }


    public void sortProduct(String sortProduct){
        productSort.click();

        Select a = new Select(productSort);
        a.selectByVisibleText(sortProduct);
    }

    public static  void getTextItem (String nameProduct){
        String xpath = "//*[contains(text(),'" +nameProduct+ "')]";

        driver.findElement(By.xpath(xpath)).getText();
        driver.findElement(By.xpath(xpath)).click();

    }



















//    public boolean loginPage(){
//        String xpath = "//h2[@class='form-login-heading']";
//        driver.findElement(By.xpath(xpath)).isDisplayed();
//        return true;
//    }
//
//    public void inputCredential(String userId, String password){
//        String xpath = "//input[@name='user']";
//        String xpath2 = "//input[@name='pass']";
//        String xpath4 = "//button[@name='proses']";
//        driver.findElement(By.xpath(xpath)).sendKeys(userId);
//        driver.findElement(By.xpath(xpath2)).sendKeys(password);
//        driver.findElement(By.xpath(xpath4)).click();
//    }
//
//    public void buttonMaster(){
//        String xpath = "//span[contains(.,'Master')]";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public void buttonKategori(){
//        String xpath = "//a[.='Kategori']";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public void inputKategoriBaru(String kategori){
//        String xpath = "//input[@name='kategori']";
//        driver.findElement(By.xpath(xpath)).sendKeys(kategori);
//    }
//
//    public void clickInsertData(){
//        String xpath = "//button[@id='tombol-simpan']";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public String getKategoriBaru(){
//        String xpath = "//tr[@class='odd']/td[2]";
//        String a = driver.findElement(By.xpath(xpath)).getText();
//        System.out.println(a);
//        return a;
//    }
//
//    public void hapusKategori(){
//        String xpath = "//button[@class='btn btn-danger']";
//        driver.findElement(By.xpath(xpath)).click();
//    }






















//    @FindBy(xpath= "//select[@class='product_sort_container']")
//    private static WebElement clickContainer;
//
//    public static void pilihItem(String namaProduk) {
//        String xpath = "//div[.="+ namaProduk+"]";
//        String xpath2 = "//*[contains(text(),'"+ namaProduk+"')]";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public static void clickAddToChart() {
//        String xpath = "//*[contains(text(),'Add to cart')]";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public static void clickBackToProduct() {
//        String xpath = "//button[@id='back-to-products']";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public static void clickIconCart(){
//        String xpath = "//a[@class='shopping_cart_link']";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//
//    public static void clickButtonCheckOut(){
//        String xpath = "//*[contains(text(),'Checkout')]";
//        driver.findElement(By.xpath(xpath)).click();
//
//    }
//
//
//    public static void inputCheckOutInformation(String firstName, String lastName, String postalCode ){
//        String xpath = "//input[@id='first-name']";
//        String xpath2 = "//input[@id='last-name']";
//        String xpath3 = "//input[@id='postal-code']";
//        String xpath4 = "//input[@id='continue']";
//        driver.findElement(By.xpath(xpath)).sendKeys(firstName);
//        driver.findElement(By.xpath(xpath2)).sendKeys(lastName);
//        driver.findElement(By.xpath(xpath3)).sendKeys(postalCode);
//        driver.findElement(By.xpath(xpath4)).click();
//    }
//
//    public static void getPaymentInformation(){
//        String xpath = "//div[@class='summary_value_label'][1]";
//        String xpath2 = "//div[@class='summary_value_label'][2]";
//        String xpath3 = "//div[@class='summary_subtotal_label']";
//        String xpath4 = "//div[@class='summary_tax_label']";
//        String xpath5 = "//div[@class='summary_total_label']";
//        String xpath6 = "//button[@id='finish']";
//
//        String a = driver.findElement(By.xpath(xpath)).getText();
//        String b = driver.findElement(By.xpath(xpath2)).getText();
//        String c = driver.findElement(By.xpath(xpath3)).getText();
//        String d = driver.findElement(By.xpath(xpath4)).getText();
//        String e = driver.findElement(By.xpath(xpath5)).getText();
//        System.out.println(a + b+ c +d +e);
//        driver.findElement(By.xpath(xpath6)).click();
//    }
//
//    public static void paymentSuccess(){
//        String xpath = "//*[@class='complete-header']";
//        String xpath2 = "//*[@class='complete-text']";
//        String xpath3 = "//*[contains(text(),'Back Home')]";
//
//        String a = driver.findElement(By.xpath(xpath)).getText();
//        String b = driver.findElement(By.xpath(xpath2)).getText();
//        System.out.println(a + b);
//        driver.findElement(By.xpath(xpath3)).click();
//    }
//
//
//    @FindBy(xpath = "//div[@class='app_logo']")
//    private WebElement logo;
//
//    @FindBy(xpath = "//div[@class='inventory_item_name']")
//    private List<WebElement> itemsName;
//
//    @FindBy(xpath = "//select[@class='product_sort_container']")
//    private WebElement productSort;
//
//    public boolean isDisplayed(){
//        logo.isDisplayed();
//        return true;
//    }
//
//    public void selectDropdownProductByLabel(String label){
//        Select selectDropdownProduct = new Select(productSort);
//        selectDropdownProduct.selectByVisibleText(label);
//    }
//
//    public void selectProductContainer(String sortProductList) {
//        clickContainer.click();
//        Select a = new Select(clickContainer);
//        a.selectByVisibleText(sortProductList);
//    }


}
