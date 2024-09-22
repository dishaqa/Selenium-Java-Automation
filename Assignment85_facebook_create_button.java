package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment85_facebook_create_button {

	public static void main(String[] args) 
	{
		
				
				ChromeDriver d1 = new ChromeDriver();
				d1.get("https://www.facebook.com/");
				d1.manage().window().maximize();
				
				//WebElement e1=	d1.findElement(By.xpath("(//a[.='Create new account'])")); // Tag name[.=link text
				WebElement e1=	d1.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				e1.click();
			
	}

}
