package Selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Different_Browsers
{

	public static void main(String[] args) 
	
	{
		//------ open chrome driver------------
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		//--------------open firefox----------------
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");
		driver1.close();
		
		//----- open edge ----
		
		EdgeDriver driver2 = new EdgeDriver();
		driver2.get("https://www.google.com");
		driver2.close();

	}

}
