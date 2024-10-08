package Amazon_testcases;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_and_Quit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
			driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fcomputers-and-accessories%2Fb%2F%3Fie%3DUTF8%26node%3D976392031%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			driver.findElement(By.id("ap_email"));
			WebElement un = driver.findElement(By.id("ap_email"));
			un.sendKeys("dishachauhan@gmail.com");
			
			WebElement cnt_button = driver.findElement(By.id("continue"));
			cnt_button.click();
			
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.sendKeys("12344");
			
			WebElement cnt2 = driver.findElement(By.id("signInSubmit"));
			cnt2.click();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		WebElement e3 =driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e3).perform();
		
		TakesScreenshot t2 = driver;
		File source1 = t2.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\Disha Chauhan\\Pictures\\Screenshots\\AB44\\"+Math.random()+".png");
		FileHandler.copy(source1, destination1);
		
		//WebElement e4 =driver.findElement(By.xpath("(//a[@id='nav-item-signout']"));
		//a1.moveToElement(e4).perform();
		//e4.click();
		//Thread.sleep(2000);
		//driver.quit();
		
		WebElement e4 =driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
		//WebElement e4 =driver.findElement(By.xpath("(//a[@class='nav-link nav-item'])[21]"));
		
		//a1.moveToElement(e4).perform();
		e4.click();
		//Thread.sleep(2000);
		//driver.quit();
	}

}
