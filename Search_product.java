package Amazon_testcases;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Search_product extends Launch_and_Quit
{
	@Test
	public void login_searching() throws IOException
	{
		
		WebElement e1=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
		e1.sendKeys("table"+Keys.ENTER);
		
		WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[3]"));
		e2.click();
		
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Disha Chauhan\\Pictures\\Screenshots\\AB44\\"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
	}
}
