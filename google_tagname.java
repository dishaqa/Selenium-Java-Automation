package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		
		WebElement e1=	d1.findElement(By.tagName("//input[5]"));
		e1.sendKeys("football");
	}

}
