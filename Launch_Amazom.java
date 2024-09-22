package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Amazom {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		e2.sendKeys("shoe"+Keys.ENTER);
		
		WebElement e1=		driver.findElement(By.linkText("Best Sellers")); //linked text
		e1.click(); 
		WebElement e3=		driver.findElement(By.partialLinkText("Deals")); // Partial link text
		e3.click();
	}

}
