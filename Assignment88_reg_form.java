package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment88_reg_form {

	public static void main(String[] args)
	{
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://grotechminds.com/registeration-form/");
		d1.manage().window().maximize();
		WebElement e1 =d1.findElement(By.id("gender"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Female");
		
		WebElement e2= d1.findElement(By.name("state"));
		Select s2 = new Select(e2);
		s2.selectByValue("gujarat");
		
	}

}
