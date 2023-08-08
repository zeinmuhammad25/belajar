package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.pageObject.Master;
import org.example.pageObject.Transaksi;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static org.junit.Assert.assertEquals;

public class TansactionSteps {
    private WebDriver webDriver;

    public TansactionSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click transaksi button")
    public void clickButtonTransaksi() throws InterruptedException {
        Transaksi transaksi = new Transaksi(webDriver);
        Thread.sleep(2000);
        transaksi.buttonTransaksi();
    }

    @And("User click button transaksi harga jual")
    public void clickTransaksiJual() throws InterruptedException {
        Transaksi transaksi = new Transaksi(webDriver);
        Thread.sleep(2000);
        transaksi.buttonTransakasiJual();
        Thread.sleep(3000);
        transaksi.buttonReset();
    }

    @Then("User input cari barang \"(.*)\" for the item you are looking for")
    public void inputNewKategori(String namaBarang) throws InterruptedException {
        Transaksi transaksi = new Transaksi(webDriver);
        Thread.sleep(2000);
        transaksi.inputCariBarang(namaBarang);
    }

    @And("User click item \"(.*)\" as the item to be purchased")
    public void clickDetails(String namaItem) throws InterruptedException {
        Transaksi transaksi = new Transaksi(webDriver);
        Thread.sleep(2000);
        transaksi.bottonShopingCart(namaItem);
    }

    @Then("User input harga bayar as much \"(.*)\"")
    public void inputHargaBayar(String harga) throws InterruptedException {
        Transaksi transaksi = new Transaksi(webDriver);
        transaksi.inputHargaBayar(harga);
    }
    @And("User click button bayar")
    public void clickButtonBayar() throws InterruptedException {
        Transaksi transaksi = new Transaksi(webDriver);
        Actions builder = new Actions(webDriver);
        builder.moveToElement(webDriver.findElement(By.xpath("//button[@class='btn btn-success']")));
        Thread.sleep(10000);
        transaksi.buttonBayar();
    }




}