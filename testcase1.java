package Retrylogic1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1
{
	WebDriver driver;
	@Test(retryAnalyzer=Retrylogic1.Iretry_Analyzer1.class)
	public void Amazon()
	{
			driver = new ChromeDriver();
		    driver.get("https://www.amazon.in/");
			WebElement e1=	driver.findElement(By.name("field-keywords1"));
			e1.sendKeys("shoes"+Keys.ENTER);
			
		
			
	}
}
