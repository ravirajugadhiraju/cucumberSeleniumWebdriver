package Pageobjects;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import cucumber.cucumberSep1920.base;

public class HomePage {
	
	public WebDriver driver;
	
	By search=By.cssSelector("input[type='search']");
	By productname=By.cssSelector("h4[class=product-name]");
	By increment=By.cssSelector("a.increment");
	By cartBtn= By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cartBag=By.cssSelector("img[alt=\"Cart\"]");
	By procCheck=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

	By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	
	public int tableValue()
	{
		String str="";
		int z=0,y=0;
		//List list  = (List) driver.findElements(By.xpath("//table[@class=\"cartTable\"]//thead/tr"));
		int rowsize = driver.findElements(By.xpath("//table[@class=\"cartTable\"]//tbody/tr")).size();
			
	     int colsise = driver.findElements(By.xpath("//table[@class=\"cartTable\"]//tbody/tr/td[1]")).size();    
			for(int i=0;i<rowsize;i++)
				
			{
				for (int j=0;j<colsise;j++)
				{
				
				 WebElement str1 = driver.findElements(By.xpath("//table[@class=\"cartTable\"]//tbody/tr/td[5]")).get(j);
				       str=    str1.getText();
						 z = Integer.parseInt(str) ;
						 System.out.println("value"+str);
						 y=z+y;
				}
				
			}  
			
		
		return y;
	}
	
	
	
	public  HomePage(WebDriver driver)
	
	{
		 this.driver=driver;
		
	}
	
	
	public WebElement searchBox()
	{
		
		return driver.findElement(search);
	    	
	}
	
	public WebElement proName()
	{
		return driver.findElement(productname);
	}
	
	
	public WebElement increMent() 
	
	{
		return driver.findElement(increment);
	}
	
	public WebElement addCart() 
	{
		
		return driver.findElement(cartBtn);
	}
	

	public WebElement addCartBag() 
	{
		
		return driver.findElement(cartBag);
	}
	
	public WebElement proCheckout() 
	{
		
		return driver.findElement(procCheck);
	}
	
	
	public WebElement placOrder() 
	{
		
		return driver.findElement(placeOrder);
	}
	
	
}
