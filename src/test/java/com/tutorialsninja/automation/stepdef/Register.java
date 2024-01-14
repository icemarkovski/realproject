package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	@Given("^User launch application$")
	public void user_launch_application()  {
		
		Base.driver.get();
	    
	System.out.println();
		
	}

	@And("^navigate to register page$")
	public void navigate_to_register_page()  {
		
	   
	}

	@When("^User provide all the below valid details$")
	public void user_provide_all_the_below_valid_details(DataTable dataTable) {
		
	   
	}

	@And("^Select privacy policy$")
	public void select_privacy_policy() {
		
	   
	}

	@And("^Click on Contiune button$")
	public void click_on_Contiune_button()  {
	   
	}

	@Then("^User account shoud successfully be created$")
	public void user_account_shoud_successfully_be_created(DataTable arg1)  {
		
	   
	}

}
