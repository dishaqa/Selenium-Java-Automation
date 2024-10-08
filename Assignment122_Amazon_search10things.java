package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment122_Amazon_search10things
{
	WebDriver driver;
	@Test(dataProvider="inputs")
	public void AmazonSearch(String input)
	{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=16993244715227889515&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061768&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
	w1.sendKeys(input+Keys.ENTER);
	}
	@DataProvider(name="inputs")
	public Object[][] data2()
	{
		return new Object[][] {{"Shoes"},{"games"},{"Hairshampoo"},{"football"},{"Glasses"},{"cofee"},{"laptops"},{"JBL"}};
	}
}
