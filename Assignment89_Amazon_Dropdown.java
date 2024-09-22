package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment89_Amazon_Dropdown {

	public static void main(String[] args) {
		// Launch Amazon and select Books from drop down
		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		WebElement e1 =d1.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		//s1.selectByVisibleText("Books");    // Select By visible text
		//s1.selectByValue("search-alias=stripbooks");    // select by values
		s1.selectByIndex(10); // by Index value
		
		

	}

}
