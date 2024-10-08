package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_google1 {
	WebDriver driver;
	@Test(dataProvider = "inputs")
	public void method1(String input)
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement w1 = driver.findElement(By.name("q"));
		w1.sendKeys(input+Keys.ENTER);
		
	}
	@DataProvider(name="inputs")
	public Object[][] data1()
	{
		return new Object[][] {{"How to become Automation Architech"},{"How to wakeup at 4"},{"India"}};
				
	}
}
