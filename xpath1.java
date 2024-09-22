package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Disha%20Chauhan/Desktop/screen%20of%20automation/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("manish");
		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("kumar");
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("abcd");
		
		
		
		WebElement e4 = driver.findElement(By.xpath("((/html/body/form)[2]/input[1])"));
		e4.click();
		
	}

}
