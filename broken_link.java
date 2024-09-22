package Selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> l1 =  driver.findElements(By.tagName("a"));
		System.out.println( l1.size());
		
		for (int i=0; i<l1.size();i++)
		{
			WebElement e1 = l1.get(i);
			String url = e1.getAttribute("href");
			String text = e1.getText();
			System.out.println(url);
			System.out.println(text);
		}
	}

}
