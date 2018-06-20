package dataUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static Object fetchProperty(String key) throws IOException{
		
	FileInputStream file=new FileInputStream("./config/config.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key);
	
	} 
	
	public static String fetchLocator(String key) throws IOException{
		FileInputStream file=new FileInputStream("./config/Elements.properties");
		Properties property =new Properties();
		property.load(file);
		return property.get(key).toString();
	}




}