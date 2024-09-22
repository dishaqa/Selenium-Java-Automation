package Selenium_package;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GrowtechMind_registration_page 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("fname"));
		name.sendKeys("Disha");
		
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("Chauahn");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Chauhan");
		
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("gfhfhfhf");
		
		WebElement Female = driver.findElement(By.id("Female"));
		Female.click();
		
		WebElement paddress = driver.findElement(By.id("Present-Address"));
		paddress.sendKeys("c-1 ABCTDKKJJJJJJ");
		
		WebElement peraddress = driver.findElement(By.id("Permanent-Address"));
		peraddress.sendKeys("c-11111 ABCTDKKJJJJJJ");
		
		WebElement Skills = driver.findElement(By.id("Skills"));
		//Skills.click();
		//Skills.sendKeys(Keys.ARROW_DOWN);
		//Skills.sendKeys(Keys.ARROW_DOWN);
		//Skills.sendKeys(Select.class)
		//Skills
		

	}

}
