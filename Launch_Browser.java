package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	
	System.out.println(driver.getWindowHandle());
	
	driver.manage().window().maximize();
	
	//driver.getTitle("https://www.google.com");
	
	//driver.findElement(By.name(null))
	
	
	driver.close();
	}

}
