package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver  = Hooks.webDriver;
    }

    @When("User input \"(.*)\" as userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Given("User open the website sauce demo")
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Then("User see error \"(.*)\" on login page")
    public void verifyErrorText(String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.verifyErrorText());
    }

    @And("user click 2 item \"(.*)\" and \"(.*)\"")
    public void cart2(String basket){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+basket+"']" +
                "/ancestor::div[@class='inventory_item_label']/following-sibling::div/button"));
    }

    @And("user click 3 item \"(.*)\" and \"(.*)\" and \"(.*)\"")
    public void cart3(String basket){
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+basket+"']" +
                "/ancestor::div[@class='inventory_item_label']/following-sibling::div/button"));
    }

}
