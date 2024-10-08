package ScreenShot_1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment106_takescreen_with_date 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("field-keywords"));
		e1.sendKeys("ball");
		Thread.sleep(4000);
		List<WebElement> li=	driver.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		int count=		li.size();
		
		li.get(count-7).click();
		
		Date d1 = new Date();
		long date1 = d1.getTime();
		System.out.println(date1);
		
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Disha Chauhan\\Pictures\\Screenshots\\AB44\\test "+ new Assignment106_takescreen_with_date().getClass()+date1+".png");
		FileHandler.copy(source, destination);
		driver.quit();
		driver.close();
	}

}

