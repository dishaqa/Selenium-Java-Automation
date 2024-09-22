package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_83
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13855826054774730651&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061768&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("football"+Keys.ENTER);

	}

}
