package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment97_Amazon_hoevrover {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		WebElement e1 =d1.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(d1);
		a1.moveToElement(e1).perform();
		
		WebElement e2 =d1.findElement(By.xpath("//span[.='Sign in']"));
		e2.click();
		d1.close();
		
		
	

	}

}
