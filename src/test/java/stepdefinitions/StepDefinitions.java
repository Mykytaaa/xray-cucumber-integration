package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private String username;
    private String password;
    private String message;

    @Given("user is on the page")
    public void openLoginPage()
    {
        System.out.println("Op");
    }

    @When("he enters login {string} and password {string}")
    public void a(String username, String password)
    {
        System.out.println(username + " " + password);
    }

    @Then("he should see the Youtube dashboard")
    public void b()
    {
        System.out.println("he sees the Youtube dashboard");
    }
}
