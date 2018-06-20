package validate;

import org.openqa.selenium.WebDriver;

public class Validatepage {
	
	static WebDriver driver;
	public static boolean validatepageUrl(String URL){
		boolean flag=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(URL));
		{
			flag=true;
			return flag;
		}
	}
    public static boolean validatePageTitle(String expTitle) {
    	boolean flag=false;
    	if (driver.getTitle().equalsIgnoreCase(expTitle));	{
    		flag=true;
    		return flag;
    	}
    }	
 

}
