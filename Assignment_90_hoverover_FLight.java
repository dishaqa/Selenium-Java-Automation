package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_90_hoverover_FLight {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://grotechminds.com/automate-me/");
		d1.manage().window().maximize();
		WebElement e1 =d1.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__inner'])[3]"));
		Actions a1 = new Actions(d1);
		a1.moveToElement(e1).perform();
		
		WebElement e2 =d1.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[2]"));
		e2.click();
		//d1.close();

	}

}
