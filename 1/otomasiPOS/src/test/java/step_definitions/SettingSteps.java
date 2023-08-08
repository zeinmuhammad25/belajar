package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.Master;
import org.example.pageObject.Setting;
import org.example.pageObject.Transaksi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingSteps {
    private WebDriver webDriver;

    public SettingSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click setting button")
    public void clickSetting() throws InterruptedException {
        Setting setting = new Setting(webDriver);
        Thread.sleep(2000);
        setting.buttonSetting();
    }

    @And("User click pengaturan toko button")
    public void clickPengaturanToko() throws InterruptedException {
        Setting setting = new Setting(webDriver);
        Thread.sleep(2000);
        setting.buttonPengaturanToko();
    }

    @When("User edit \"(.*)\" as nama toko and \"(.*)\" as alamat toko and \"(.*)\" as kontak and \"(.*)\" as nama pemilik")
    public void userEditPengaturan(String namaToko, String alamatToko, String hp, String pemilik) throws InterruptedException {
        Setting setting = new Setting(webDriver);
        Thread.sleep(5000);
        setting.inputPengaturanToko(namaToko, alamatToko, hp, pemilik);
    }



}