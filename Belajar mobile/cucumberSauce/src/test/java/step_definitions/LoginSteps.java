package step_definitions;

import com.zein.pageObject.InventoriPage;
import com.zein.pageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the web page")
    public void verifyLoginPage (){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as userName and \"(.*)\" as password")
    public void inputCredential (String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Then("User will see \"(.*)\" on login page")
    public void displayErrorMassage (String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        assertEquals(errorText, loginPage.getErrorMessage());
    }

    @Then("User already pick item")
    public void displayItem1 (){
        LoginPage loginPage = new LoginPage(webDriver);
        String a = "Sauce Labs Backpack";
        assertEquals(a, loginPage.getBarang1());
    }















//    @Given("user open the web page")
//    public void verifyLoginPageIsDisplayed() {
//        LoginPage loginPage = new LoginPage(webDriver);
//        Assert.assertTrue(loginPage.isDisplayed());
//    }
//
//
//    @Then("User is already on the landing page")
//    public void isDashboardIsDisplayed() {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        Assert.assertTrue(inventoriPage.isDisplayed());
//
//    }
//
//    @Then("User see error \"(.*)\" on login page")
//    public void verifyErorMassage(String errorText) {
//        LoginPage loginPage = new LoginPage(webDriver);
//        assertEquals(errorText,loginPage.getErrorMessage() );
//
//    }

}