package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_86_96_google_tagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.co.in/");
		d1.manage().window().maximize();
		
		WebElement e1=	d1.findElement(By.xpath("//textarea[@name='q']")); 
		e1.sendKeys("INDIA");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		
		e1.sendKeys(Keys.ENTER);

	}

}
