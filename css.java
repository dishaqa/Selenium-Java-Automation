package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class css {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e2 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		Thread.sleep(3000);
		e2.sendKeys("shoe"+Keys.ENTER);

	}

}
