package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		d1.manage().window().maximize();
		
		WebElement e1=	d1.findElement(By.xpath("(//span[.='Mobiles'])[2]")); // Tag name[.=link text
		
		e1.click();
	}

}
