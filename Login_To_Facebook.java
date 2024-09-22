package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_Facebook {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement email1 = driver.findElement(By.name("email"));
		WebElement email1 = driver.findElement(By.xpath("(//input)[3]"));
		email1.sendKeys("dishachauhan@gmail.com");
		
		//WebElement pwd = driver.findElement(By.id("pass"));
		WebElement pwd = driver.findElement(By.xpath("(//input)[4]"));
		pwd.sendKeys("fsdfsdfsdf");
		
		//WebElement sub = driver.findElement(By.name("login"));
		//WebElement sub = driver.findElement(By.xpath("//button"));
		WebElement sub = driver.findElement(By.xpath("//a[@id='u_0_0_Wi']"));
		//a[@id='u_0_0_Wi']
		

		sub.click();

	}

}
