package Selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate_method {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
