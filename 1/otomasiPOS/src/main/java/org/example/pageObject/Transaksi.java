package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Transaksi {
    private static WebDriver driver;

    public Transaksi(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void buttonTransaksi() throws InterruptedException {
        Thread.sleep(2000);
        String xpath = "//span[contains(.,'Transaksi')]";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void buttonTransakasiJual() throws InterruptedException {
        String xpath = "//a[.='Transaksi Jual']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void buttonReset() throws InterruptedException {
        String xpath = "//b[.='RESET KERANJANG']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void inputCariBarang(String namaBarang){
        String xpath = "//input[@id='cari']";
        String xpath2 = "//h4[contains(.,'Hasil Pencarian')]";
        driver.findElement(By.xpath(xpath)).sendKeys(namaBarang);
        driver.findElement(By.xpath(xpath2)).click();
    }

    public void bottonShopingCart(String nama) throws InterruptedException {
        String xpath = "//*[text()='" +nama+ "']/ancestor::tr//i[@class='fa fa-shopping-cart']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void inputHargaBayar(String harga){
        String xpath = "//input[@name='bayar']";

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(harga);
    }

    public void buttonBayar() throws InterruptedException {
        String xpath = "//button[@class='btn btn-success']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

}
