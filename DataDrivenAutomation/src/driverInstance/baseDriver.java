package driverInstance;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

import dataUtility.Utility;


public class baseDriver {
	public static WebDriver driver;
	@BeforeMethod
	
	public void initiateDriverInstance() throws Exception {
	
	if(Utility.fetchProperty("browsername").toString().equalsIgnoreCase("chrome"))
	{	
		System.setProperty("webdriver.chrome.driver","G:\\softwares\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	else if(Utility.fetchProperty("browsername").toString().equalsIgnoreCase("chrome "))
	{	
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(Utility.fetchProperty("browsername").toString().equalsIgnoreCase("chrome "))
	{	
		System.setProperty("webdriver.ie.driver","./Driver/InternetExplorer.exe");
		driver=new InternetExplorerDriver();
	    
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(Utility.fetchProperty("url").toString());
	
	}
	
	
	
	}
