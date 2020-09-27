package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.cucumberSep1920.base;
import junit.framework.Assert;

public class MyStepDefinitions {
	
	public WebDriver driver;
	public HomePage p;
	  
	
	 @Given("^user is on greencart landing page$")
	    public void user_is_on_greencart_landing_page() throws Throwable {
	        
		 driver=base.Intial();
         driver.get(base.URL);
		 Thread.sleep(3000);
	    }

	    @When("^user serarched for \"([^\"]*)\" vegetable$")
	    public void user_serarched_for_something_vegetable(String strArg1) throws Throwable {
	       	
	    	p= new HomePage(driver);
	    	p.searchBox().clear();
	    	p.searchBox().sendKeys(strArg1);
	    		Thread.sleep(3000);
	      System.out.println(p.proName().getText().contains(strArg1));
	    	        
	    }

	    @Then("^\"([^\"]*)\" results1 are displayed$")
	    public void something_results_are_displayed(String strArg1) throws Throwable {
	    	//Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	        p.increMent().click();
	        p.addCart().click();
	        
	    }

	    @Then("^add vestible to cart$")
	    
	    public void add_vestible_to_cart() throws Throwable {
	    	
	    	p.addCartBag().click();
	    	p.proCheckout().click();
	    	Thread.sleep(1000);
	    	
	    	Thread.sleep(3000);
	    	System.out.println("string value"+p.tableValue());
	       	
	    	
	    	p.placOrder().click();
	    }
	    
	    
	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable {
	        driver.close();
	    }
	    
	    
	    
	    @When("^user serarched for (.+) vegetable$")
	    public void user_serarched_for_vegetable(String veg) throws Throwable {
	    	
	    	p= new HomePage(driver);
	    	p.searchBox().clear();
	    	p.searchBox().sendKeys(veg);
	    		Thread.sleep(3000);
	      System.out.println(p.proName().getText().contains(veg));
	        
	    }

	    @Then("^(.+) results1 are displayed$")
	    public void results1_are_displayed(String veg) throws Throwable {
	    	
	    	 p.increMent().click();
		        p.addCart().click();
	        
	    }
	    
	    
}
