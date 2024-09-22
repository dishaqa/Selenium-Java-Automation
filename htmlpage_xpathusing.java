package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class htmlpage_xpathusing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/Disha%20Chauhan/Desktop/screen%20of%20automation/learningHTML1.html");
		WebElement e1=		driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("disha");
		WebElement e2=		driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("disha");
		WebElement e3=		driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("abcd123");
	
		WebElement e4=		driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		e4.sendKeys("Disha");
		WebElement e5=		driver.findElement(By.xpath("(/html/body/form/input)[2]"));
		e5.sendKeys("Chauhan");
		

	}

}
