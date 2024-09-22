package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_84_facebook_login_xpath 
{
	public static void main(String[] args) 
	{
		
		
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//input)[3]"));
		e1.sendKeys("d1@gmail.com");
		WebElement e2 = driver.findElement(By.xpath("(//input)[4]"));
		e2.sendKeys("1234");
		WebElement e3 = driver.findElement(By.xpath("(//button)[1]"));
		e3.click();
		
		
		
	}

	
}
