package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment75_firstcry_1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.partialLinkText("BOY FASHION"));
		
		link.click();
		driver.close();
	}

}
