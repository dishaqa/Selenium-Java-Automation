package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_94_doubleclick {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.co.in/");
		d1.manage().window().maximize();
		
		WebElement e1=	d1.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(d1);
		//a1.contextClick().perform();
		a1.doubleClick(e1).perform();
		

	}

}
