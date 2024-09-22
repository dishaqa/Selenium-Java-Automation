package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment76_mytra_menscorner {

	public static void main(String[] args)
	{
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.myntra.com/");
		d1.manage().window().maximize();
		
		WebElement w1 =d1.findElement(By.linkText("Men"));
		w1.click();
		

	}

}
