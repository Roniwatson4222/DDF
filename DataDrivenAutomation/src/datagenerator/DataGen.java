package datagenerator;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGen {
	
	@DataProvider(name="Static")
	public static Object [][] testDataGenerator() throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\Selenium Webdriver Tutorial Basics+Advanced+Interview Guide\\TestData.xlsx");
		
		XSSFWorkbook ExcelWbook= new XSSFWorkbook(file);
		XSSFSheet WSheet= ExcelWbook.getSheet("login");
		
		int NoOfData= WSheet.getPhysicalNumberOfRows();
		
		Object [][] data =new Object[NoOfData][2]; 
		for (int i=0;i<NoOfData;i++) {
			XSSFRow row=WSheet.getRow(i);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			data[i][0] = username.getStringCellValue();
			data[i][1] = password.getStringCellValue();
		}
		
		
		return data; 
		
	}
	
	
	

}
