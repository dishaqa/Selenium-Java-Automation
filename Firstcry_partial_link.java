package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcry_partial_link 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		
		WebElement link=	driver.findElement(By.partialLinkText("GIRL"));
		link.click();
		driver.close();
	

	}

}
