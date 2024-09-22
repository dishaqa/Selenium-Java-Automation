package Selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggession_amazon {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("field-keywords"));
		e1.sendKeys("shoes");
		Thread.sleep(4000);
		List<WebElement> li=	driver.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		int count=		li.size();
		
		li.get(count-7).click(); // forth option
		//li.get(count-9).click(); // second option
	}

}
