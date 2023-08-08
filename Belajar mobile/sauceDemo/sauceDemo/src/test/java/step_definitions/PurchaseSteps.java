package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.InventoriPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User pick item Sauce Labs Backpack")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(5000);
    }

    @And("User sort product list by name z to a")
    public void selectProductContainer() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String a = "Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(2000);
    }

    @Then("User already on landing page")
    public void verifyLandingPage() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayLandingPage());
    }

    @And("User click new item")
    public void clickItemCart() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String namaItem = "Sauce Labs Bike Light";
        inventoriPage.clickItemCart(namaItem);
        Thread.sleep(5000);
    }

}
