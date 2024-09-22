package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElement 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String Title1 = driver.getTitle();
		driver.findElement(By.name("q")).sendKeys("india");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.manage().window().maximize();

	}

}
 