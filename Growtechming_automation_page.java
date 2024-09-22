package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtechming_automation_page {
	
	public static void main(String[] args) 
	{
	
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://grotechminds.com/registeration-form/");
			driver.manage().window().maximize();
			
			WebElement fn = driver.findElement(By.name("firstName"));
			fn.sendKeys("Disha");
			
			WebElement ln = driver.findElement(By.name("lastName"));
			ln.sendKeys("chauhan");
			
			WebElement email1 = driver.findElement(By.name("email"));
			email1.sendKeys("disha@gmail.com");
			
			WebElement pnumber = driver.findElement(By.name("phone"));
			pnumber.sendKeys("1234567890");
			
			WebElement aadhaar = driver.findElement(By.name("aadhaar"));
			aadhaar.sendKeys("ABCD9009990");
			
			WebElement pan = driver.findElement(By.name("pan"));
			pan.sendKeys("ABPSC1234K");
			
			WebElement terms = driver.findElement(By.name("terms"));
			if (terms.isSelected())
			{
				System.out.println("checkbox is selected");
				
			}
			else
			{
				System.out.println("checkbox is not selected, so let's selct that ");
				terms.click();
			}
			
			WebElement Submit = driver.findElement(By.name("Submit"));
			Submit.click();
			
			
			
		
	}

}
