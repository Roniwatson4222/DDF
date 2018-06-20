package dataDrivenpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataUtility.Utility;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void username(String uname) throws Exception {
		driver.findElement(By.name(Utility.fetchLocator("UserName"))).sendKeys(uname);

	}
	
	public void password(String pass) throws Exception {
		driver.findElement(By.id(Utility.fetchLocator("pwd"))).sendKeys(pass);

	}
	
	public void clickSignIn() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocator("signin_xpath"))).click();
	}
	
	
	
}
