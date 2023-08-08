package step_definitions;

import com.zein.pageObject.InventoriPage;
import com.zein.pageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User sort product list by \"(.*)\"")
    public void selectProductCart(String sortProduct) throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Thread.sleep(3000);
        inventoriPage.sortProduct(sortProduct);
    }




















//    @Given("User open POS web")
//    public void LoginPage(String userId, String password) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        Assert.assertTrue(inventoriPage.loginPage());
//    }
//
//    @When("User input \"(.*)\" as userId and \"(.*)\" as password")
//    public void inputCredential(String userId, String password) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.inputCredential(userId, password);
//    }
//
//    @And("User click button master")
//    public void clickButtonMaster(String userId, String password) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.buttonMaster();
//    }
//
//    @And("User click button kategori")
//    public void clickButtonKategori(String userId, String password) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.buttonKategori();
//    }
//
//    @When("User input \"(.*)\" as a new kategori")
//    public void inputNewKategori(String kategori) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.inputKategoriBaru(kategori);
//    }
//
//    @And("User click button insert data")
//    public void clickInsertData(String userId, String password) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.clickInsertData();
//    }
//
//    @Then("User already see a new category")
//    public void newKategori(String a) {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        assertEquals("Kategori1", inventoriPage.getKategoriBaru());
//    }
//    @And("User delete new category")
//    public void deleteKategori() {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.hapusKategori();
//    }





//    @When("User pick item \"(.*)\" and checkout to cart")
//    public void putInventoryItem(String namaProduk) throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        InventoriPage.pilihItem(namaProduk);
//        Thread.sleep(1000);
//        InventoriPage.clickAddToChart();
//        InventoriPage.clickBackToProduct();
//        Thread.sleep(1000);
//    }
//
//    @Then("User will see a basket that has been filled with items that have been checkout")
//    public void clickItemCartAndCheckout() throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        InventoriPage.clickIconCart();
//        Thread.sleep(500);
//        InventoriPage.clickButtonCheckOut();
//    }
//
//    @And("User input \"(.*)\" as first name \"(.*)\" as last name and \"(.*)\" as postal code")
//    public void inputCheckOutInformation(String firstName, String lastName, String postalCode) throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.inputCheckOutInformation(firstName, lastName, postalCode);
//    }
//
//    @Then("User will See Checkout Information Payment")
//    public void getTextValuePayment() throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        InventoriPage.getPaymentInformation();
//    }
//
//    @Then("User will get information on the successful payment")
//    public void paymentSuccess() throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        InventoriPage.paymentSuccess();
//    }
//
//    @Then("User sort product list by \"(.*)\"")
//    public void selectProductContainer (String sortProductList) throws InterruptedException {
//        InventoriPage inventoryPage = new InventoriPage(webDriver);
//        Thread.sleep(3000);
//        inventoryPage.selectProductContainer(sortProductList);
//    }

}