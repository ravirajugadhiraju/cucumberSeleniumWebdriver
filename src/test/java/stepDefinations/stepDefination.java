package stepDefinations;



import java.awt.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	@Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("user_is_on_landing_page()");
    }

	@When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
		
	}
	
	
	
	 @When("^user login with following details$")
	    public void user_login_with_following_details(DataTable data) throws Throwable {
	        
		 java.util.List<String> obj =  data.asList()  ;
	 // System.out.println( ((java.util.List<java.util.List<String>>) obj).get(0).get(0));
	  //System.out.println( ((java.util.List<java.util.List<String>>) obj).get(0).get(1));
	  //System.out.println( ((java.util.List<java.util.List<String>>) obj).get(0).get(2));
	  //System.out.println( ((java.util.List<java.util.List<String>>) obj).get(0).get(3));
	  //System.out.println( ((java.util.List<java.util.List<String>>) obj).get(0).get(4));
	 
	 
	 }

	 
	 
	 
	 
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("home_page_is_populated");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
        
    }


	
    @When("^user login into application1 with (.+) and (.+)$")
    public void user_login_into_application1_with_and(String usr, String pwd) throws Throwable {
    	
    	
    	System.out.println(usr);
    	System.out.println(pwd);
       
    }
    
    @Given("^login verfication$")
    public void login_verfication() throws Throwable {
        System.out.println("Background login verificaiton");
    }

    @When("^web verficaiton$")
    public void web_verficaiton() throws Throwable {
    	 System.out.println("web login verificaiton");
    }

    @Then("^Background complete$")
    public void background_complete() throws Throwable {
    	System.out.println("Background complete");
    }
	
}
