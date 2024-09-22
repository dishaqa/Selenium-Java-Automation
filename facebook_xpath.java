package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(//input)[3]"));
		username.sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("(//input)[4]"));
		pwd.sendKeys("dfsdfsd");
		
		WebElement login = driver.findElement(By.xpath(" (//button)[1]"));
		login.click();
		
				
				
	}

}
