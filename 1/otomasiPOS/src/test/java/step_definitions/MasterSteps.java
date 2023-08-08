package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.Master;
import org.example.pageObject.Transaksi;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static org.junit.Assert.assertEquals;

public class MasterSteps {
    private WebDriver webDriver;

    public MasterSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open POS web")
    public void LoginPage() throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(master.loginPage());
    }

    @When("User input \"(.*)\" as userId and \"(.*)\" as password")
    public void inputCredential(String userId, String password) throws InterruptedException, AWTException {
        Master master = new Master(webDriver);
        master.inputCredential(userId, password);
        Thread.sleep(3000);

        for(int i=0; i<3; i++){
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
//        for(int i=0; i<4; i++){
//            webDriver.findElement(By.tagName("h1")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
//        }
    }

    @And("User click button master")
    public void clickButtonMaster() throws InterruptedException {
        Master master = new Master(webDriver);
        master.buttonMaster();
    }

    @And("User click button kategori")
    public void clickButtonKategori() throws InterruptedException {
        Master master = new Master(webDriver);
        master.buttonKategori();
    }

    @When("User input \"(.*)\" as a new kategori")
    public void inputNewKategori(String kategori) {
        Master master = new Master(webDriver);
        master.inputKategoriBaru(kategori);
    }

    @And("User click button insert data")
    public void clickInsertData() throws InterruptedException {
        Master master = new Master(webDriver);
        master.clickInsertDataKategori();
    }

    @Then("User already see a new category")
    public void newKategori() {
        Master master = new Master(webDriver);
        String a = "Kategori1" ;
        assertEquals(a, master.getKategoriBaru());
    }
    @And("delete")
    public void delete() {
        Master master = new Master(webDriver);
        master.hapus();
    }
    @And("User click button barang")
    public void clickButtonBarang() throws InterruptedException {
        Master master = new Master(webDriver);
        master.buttonBarang();
    }

    @And("User click detail item \"(.*)\"")
    public void clickDetails(String namaItem) throws InterruptedException {
        Master master = new Master(webDriver);
        master.buttonDetail(namaItem);
    }

    @And("User insert data barang")
    public void clickTambahBarang() throws InterruptedException {
        Master master = new Master(webDriver);
        log.println("sudah sampai sini");
        Thread.sleep(5000);
        master.clickInsertDataBarang();
    }

    @When("User input \"(.*)\" as kategori barang and \"(.*)\" as nama barang and \"(.*)\" as merk barang \"(.*)\" as harga beli")
    public void userInputDataBarang1(String kategori, String nama, String merkBarang, String hargaBeli) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.inputTambahBarang1(kategori, nama, merkBarang, hargaBeli);
    }

    @When("User input \"(.*)\" as hargaJual and \"(.*)\" as satuan Barang \"(.*)\" as stok beli")
    public void userInputDataBarang2(String hargaJual, String satuan, String stok) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.inputTambahBarang2(hargaJual, satuan, stok);
        Thread.sleep(3000);
    }

    @Then("User already see new item in data barang page")
    public void verifyItem() throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        Assert.assertTrue(master.verifyItem());
    }

    @And("User click button user")
    public void buttonUser() throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.buttonuser();
    }

    @When("User input \"(.*)\" as nama and \"(.*)\" as email \"(.*)\" as telp")
    public void userInputProfil1(String nama, String email, String telp) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.inputProfil1(nama, email, telp);
        Thread.sleep(3000);
    }

    @When("User input \"(.*)\" as nik and \"(.*)\" as alamat")
    public void userInputProfil2(String nik, String alamat) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.inputProfil2(nik, alamat);
        Thread.sleep(3000);
    }

    @Then("User already see new update profile")
    public void verifyUpdateProfil() throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        Assert.assertTrue(master.alertSuccess());
    }

    @Then("User see detail item \"(.*)\"")
    public void errorText(String text) throws InterruptedException {
        Master master = new Master(webDriver);
        Assert.assertEquals(text, master.detailItem());
        Thread.sleep(2000);
    }

    @And("User click edit button item \"(.*)\"")
    public void editItem(String namaBarang) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(3000);
        master.buttonEdit(namaBarang);
    }

    @And("User click button update data")
    public void buttonUpdateData() throws InterruptedException {
        Master master = new Master(webDriver);
        master.clickUpdateData();
    }

    @Then("User already see new notify update success")
    public void verifyUpdateData() throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        Assert.assertTrue(master.alertSuccess());
    }


    @When("User edit \"(.*)\" as kategori barang and \"(.*)\" as nama barang and \"(.*)\" as merk barang \"(.*)\" as harga beli")
    public void userEditDataBarang1(String kategori, String nama, String merkBarang, String hargaBeli) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.inputEditBarang1(kategori, nama, merkBarang, hargaBeli);
    }
    @When("User edit \"(.*)\" as harga jual and \"(.*)\" as satuan and \"(.*)\" as stok")
    public void userEditDataBarang2(String hargaJual, String satuan, String stok) throws InterruptedException {
        Master master = new Master(webDriver);
        Thread.sleep(5000);
        master.inputEditBarang2(hargaJual, satuan, stok);
    }


}