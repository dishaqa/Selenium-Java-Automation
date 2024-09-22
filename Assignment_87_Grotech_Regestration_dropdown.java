package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_87_Grotech_Regestration_dropdown {

	public static void main(String[] args) 
	{
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://grotechminds.com/registration/");
		d1.manage().window().maximize();
		WebElement e1 =d1.findElement(By.id("Skills"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Technical Skills");
		
		WebElement e2= d1.findElement(By.name("technicalskills c-s"));
		Select s2 = new Select(e2);
		s2.selectByValue("Selenium");
		
		WebElement e3= d1.findElement(By.name("Country"));
		Select s3 = new Select(e3);
		s3.selectByValue("India");
		
		WebElement e4= d1.findElement(By.name("Relegion"));
		Select s4 = new Select(e4);
		s4.selectByValue("Hindu");		
		
		

	}

}
