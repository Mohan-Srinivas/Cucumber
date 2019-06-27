package Pack;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import cucumber.api.java.en.When;

public class StepIP
{
	@Given("user enters passwors as {string}")
	public void user_enters_passwors_as(String string) 
	{
	   
		System.out.println(string);
	}

	@And("user enter confirm password as {string}")
	public void user_enter_confirm_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
			
	}

	@Then("the password is changed")
	public void the_password_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Changed");
		
	}
	@Given("Click the signout button")
	public void click_the_signout_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("Click the signout");
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page()
	{
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("user is navigated to the home page");
	}
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