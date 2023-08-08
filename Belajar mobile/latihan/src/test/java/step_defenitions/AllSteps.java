package step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AllPageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class AllSteps {

    private WebDriver driver = Hooks.driver;

    AllPageObject object = new AllPageObject(driver);

    @When("User input {string} as userName and {string} as a password")
    public void inputCredential(String username, String password){
        object.setUserName(username);
        object.setPassword(password);
        object.clickLogin();
    }

    @And("User click product {string}")
    public void clickProduct(String product){
        object.clickProduct(product);
    }

    @And("user click cart badge")
    public void clickCartbadge(){
        object.clickCart();
    }

    @Then("User verify price value")
    public void verifyPrice(){
        String a = AllPageObject.inventoryProductPrice;
        String b = AllPageObject.cartProductPrice;
        Assert.assertEquals(AllPageObject.inventoryProductPrice, AllPageObject.cartProductPrice);
        log.println(a);
        log.println(b);
    }


}
