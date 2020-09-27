package cucumber.cucumberSep1920;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class base {

	
	public static WebDriver driver;
	
	public static Properties pro;
	
	public static String URL;
	
	public static WebDriver Intial() throws IOException
	{		
		
		pro=new Properties();
		
		
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\cucumber\\cucumberSep1920\\data.properties");
			pro.load(fis);
			URL= pro.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "C:\\seleneium\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		  return driver;
		  
		  
		  
	}
	
	
	
	
}
