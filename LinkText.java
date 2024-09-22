package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText 
{
public static void main(String[] args)
{

	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.google.com/");
	
	WebElement e1=		driver.findElement(By.linkText("gmail"));
	e1.click();
	
	
}
}
