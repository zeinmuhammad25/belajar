package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {




    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
//    public WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);

    @When("User sort product list by {string}")
    public void selectProductSort(String sort){
        cartPage.selectProductFilter(sort);
    }

    @And("User click item {string}")
    public void click1Product(String namProduct){
        cartPage.pickProduct(namProduct);
    }

    @And("User click card badge")
    public void clickBadge(){
        cartPage.clickCart();
    }

    @Then("Verify price")
    public void verifyPrice() throws InterruptedException {
        Thread.sleep(3000);

        Assert.assertEquals(CartPage.inventoryProductPrice,CartPage.cartProductPrice);

        Thread.sleep(3000);
    }

}
