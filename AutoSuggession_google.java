package Selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("bangalore");
		Thread.sleep(4000);
		List<WebElement> li=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=		li.size();
		li.get(count-5).click();
	}

}
