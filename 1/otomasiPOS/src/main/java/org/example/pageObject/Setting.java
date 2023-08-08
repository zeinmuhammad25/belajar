package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Setting {
    private static WebDriver driver;

    public Setting(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void buttonSetting() throws InterruptedException {
        Thread.sleep(2000);
        String xpath = "//span[contains(.,'Setting')]";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void buttonPengaturanToko() throws InterruptedException {
        String xpath = "//a[.='Pengaturan Toko']";
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void inputPengaturanToko(String namaToko, String alamatToko, String noHp, String namaPemilik) throws InterruptedException {
        String xpath1 = "//input[@name='namatoko']";
        String xpath2 = "//input[@name='alamat']";
        String xpath3 = "//input[@name='kontak']";
        String xpath4 = "//input[@name='pemilik']";

        driver.findElement(By.xpath(xpath1)).clear();
        driver.findElement(By.xpath(xpath2)).clear();
        driver.findElement(By.xpath(xpath3)).clear();
        driver.findElement(By.xpath(xpath4)).clear();

        driver.findElement(By.xpath(xpath1)).sendKeys(namaToko);
        driver.findElement(By.xpath(xpath2)).sendKeys(alamatToko);
        driver.findElement(By.xpath(xpath3)).sendKeys(noHp);
        driver.findElement(By.xpath(xpath4)).sendKeys(namaPemilik);
    }

    public void buttonUpdateData() throws InterruptedException {
        String xpath = "//button[@id='tombol-simpan']";
        Thread.sleep(1000);
        driver.findElement(By.xpath(xpath)).click();
    }
}
