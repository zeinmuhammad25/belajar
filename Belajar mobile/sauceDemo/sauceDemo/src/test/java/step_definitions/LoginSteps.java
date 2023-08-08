package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;



public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website sauce demo")
    public void verifyDisplay(){
        LoginPage loginPage = new LoginPage(webDriver);
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(loginPage.isDisplayed());
    }
    @When("User input \"(.*)\" as userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText) throws InterruptedException {
        LoginPage loginpage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginpage.getErrorText());
        Thread.sleep(3000);
    }


}
