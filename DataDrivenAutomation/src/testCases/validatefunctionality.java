package testCases;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDrivenpages.LoginPage;
import datagenerator.DataGen;
import driverInstance.baseDriver;

public class validatefunctionality extends baseDriver {

	@Test(dataProvider="Static",dataProviderClass=DataGen.class)
	public void loginfunc(String UN,String pwd) throws Exception {
		LoginPage login=new LoginPage(driver);
		login.username(UN);
		login.password(pwd);
		login.clickSignIn(); 
	
	}
	
	
	
}
	
