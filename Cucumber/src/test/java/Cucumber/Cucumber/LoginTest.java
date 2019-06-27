package Cucumber.Cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest 
{
	@Given("User enters username")
	 public void user_enters_username()
	{
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Entered the username");
	}

	@When("User enters password")
	public void user_enters_password() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Password is entered");
	}

	@And("Click on login button")
    public void click_on_login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Button Clicked");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("You are in Home");
	}
}



