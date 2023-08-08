package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Master {
    private static WebDriver driver;

    public Master(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public boolean loginPage(){
        String xpath = "//h2[@class='form-login-heading']";
        driver.findElement(By.xpath(xpath)).isDisplayed();
        return true;
    }

    public void inputCredential(String userId, String password) throws InterruptedException {
        String xpath = "//input[@name='user']";
        String xpath2 = "//input[@name='pass']";
        String xpath4 = "//button[@name='proses']";
        driver.findElement(By.xpath(xpath)).sendKeys(userId);
        driver.findElement(By.xpath(xpath2)).sendKeys(password);
        driver.findElement(By.xpath(xpath4)).click();
    }

    public void buttonMaster() throws InterruptedException {
        Thread.sleep(2000);
        String xpath = "//span[contains(.,'Master')]";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void buttonKategori() throws InterruptedException {
        String xpath = "//a[.='Kategori']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void buttonBarang() throws InterruptedException {
        String xpath = "//a[.='Barang']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void inputKategoriBaru(String kategori){
        String xpath = "//input[@name='kategori']";
        driver.findElement(By.xpath(xpath)).sendKeys(kategori);
    }

    public void clickInsertDataKategori() throws InterruptedException {
        String xpath = "//button[@id='tombol-simpan']";
        Thread.sleep(2000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickInsertDataBarang(){
        String xpath = "//button[@class='btn btn-primary btn-md pull-right']/i[@class='fa fa-plus']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public String getKategoriBaru(){
        String xpath = "//tr[@class='odd']/td[2]";
        String a = driver.findElement(By.xpath(xpath)).getText();
        System.out.println(a);
        return a;

    }
    public void hapus(){
        String xpath = "//*[text()='Hapus']";
        driver.findElement(By.xpath(xpath)).click();
    }


// input tambah barang

    public void inputTambahBarang1(String kategori, String nama, String merkBarang, String hargaBeli) throws InterruptedException {
        String xpath = "//input[@name='nama']";
        String xpath1 = "//input[@name='merk']";
        String xpath2 = "//input[@name='beli']";

        String xpath3 = "//select[@name='kategori']";

        Select a =new Select(driver.findElement(By.xpath(xpath3)));
        a.selectByVisibleText(kategori);

        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath1)).clear();
        driver.findElement(By.xpath(xpath2)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(nama);
        driver.findElement(By.xpath(xpath1)).sendKeys(merkBarang);
        driver.findElement(By.xpath(xpath2)).sendKeys(hargaBeli);
    }

    public void inputTambahBarang2(String hargaJual, String satuan, String stok) throws InterruptedException {
        String xpath3 = "//input[@name='jual']";
        String xpath4 = "//select[@name='satuan']";
        String xpath5 = "//input[@name='stok']";

        String xpath6 = "//button[@class='btn btn-primary']";

        driver.findElement(By.xpath(xpath3)).sendKeys(hargaJual);

        Select a =new Select(driver.findElement(By.xpath(xpath4)));
        a.selectByVisibleText(satuan);

        driver.findElement(By.xpath(xpath5)).sendKeys(stok);
        driver.findElement(By.xpath(xpath6)).click();
    }

    public boolean verifyItem(){
        String xpath = "//tr[@class='odd']";
        driver.findElement(By.xpath(xpath)).isDisplayed();
        return true;
    }

    public void buttonDetail(String nama) throws InterruptedException {
        String xpath = "//td[.='" + nama+ "']/ancestor::tr//*[text()='Details']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

// input edit profil

    public void buttonuser() throws InterruptedException {
        String xpath = "//a[.='User']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void inputProfil1(String nama, String email, String telp) throws InterruptedException {
        String xpath = "//input[@name='nama']";
        String xpath1 = "//input[@name='email']";
        String xpath2 = "//input[@name='tlp']";

        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(nama);
        driver.findElement(By.xpath(xpath1)).clear();
        driver.findElement(By.xpath(xpath1)).sendKeys(email);
        driver.findElement(By.xpath(xpath2)).clear();
        driver.findElement(By.xpath(xpath2)).sendKeys(telp);
    }

    public void inputProfil2(String nik, String alamat) throws InterruptedException {
        String xpath1 = "//input[@name='nik']";
        String xpath2 = "//textarea[@name='alamat']";
        String xpath3 = "//button[@name='btn']";

        driver.findElement(By.xpath(xpath1)).clear();
        driver.findElement(By.xpath(xpath1)).sendKeys(nik);
        driver.findElement(By.xpath(xpath2)).clear();
        driver.findElement(By.xpath(xpath2)).sendKeys(alamat);

        driver.findElement(By.xpath(xpath3)).click();
    }

    public boolean alertSuccess(){
        String xpath = "//div[@class='alert alert-success']";
        driver.findElement(By.xpath(xpath)).isDisplayed();
        return true;
    }

    public String detailItem(){
        String xpath = "//tr[3]/td[2]";
        return driver.findElement(By.xpath(xpath)).getText();
    }


    public void inputEditBarang1(String kategori, String nama, String merkBarang, String hargaBeli) throws InterruptedException {
        String xpath3 = "//select[@name='kategori']";
        String xpath = "//input[@name='nama']";
        String xpath1 = "//input[@name='merk']";
        String xpath2 = "//input[@name='beli']";

        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath1)).clear();
        driver.findElement(By.xpath(xpath2)).clear();

        Select a =new Select(driver.findElement(By.xpath(xpath3)));
        a.selectByVisibleText(kategori);

        driver.findElement(By.xpath(xpath)).sendKeys(nama);
        driver.findElement(By.xpath(xpath1)).sendKeys(merkBarang);
        driver.findElement(By.xpath(xpath2)).sendKeys(hargaBeli);
    }

    public void inputEditBarang2(String hargaJual, String satuan, String stok) throws InterruptedException {
        String xpath3 = "//input[@name='jual']";
        String xpath4 = "//select[@name='satuan']";
        String xpath5 = "//input[@name='stok']";

        driver.findElement(By.xpath(xpath3)).clear();
        driver.findElement(By.xpath(xpath5)).clear();

        driver.findElement(By.xpath(xpath3)).sendKeys(hargaJual);
        Select a =new Select(driver.findElement(By.xpath(xpath4)));
        a.selectByVisibleText(satuan);
        driver.findElement(By.xpath(xpath5)).sendKeys(stok);
    }

    public void clickUpdateData() throws InterruptedException {
        String xpath = "//button[contains(.,'Update Data')]";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void buttonEdit(String nama) throws InterruptedException {
        String xpath = "//td[.='" + nama+ "']/ancestor::tr//*[text()='Edit']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

}
