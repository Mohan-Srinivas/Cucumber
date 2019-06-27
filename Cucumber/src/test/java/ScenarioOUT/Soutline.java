package ScenarioOUT;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Soutline 
{
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@Then("Logged in")
	public void logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Vantan da veetuku ");
	}
	@Given("Want to create a Account")
	public void want_to_create_a_Account() 
	{
		System.out.println("Want to create a Account");
	}

	@When("I enter my Credentials")
	public void i_enter_my_Credentials(io.cucumber.datatable.DataTable dataTable) 
	{
	 	List <Map<String,String>> list=dataTable.asMaps(String.class,String.class);
	 	for(int i=0;i<list.size();i++)
	 	{
	 		System.out.println(list.get(i).get("name"));
	 		System.out.println(list.get(i).get("value"));
	 		System.out.println(list.get(i).get("age"));
	 	}
	 }

	@Then("I verified")
	public void i_verified() 
	{	
		System.out.println("Created the Account");
	
	}
}
