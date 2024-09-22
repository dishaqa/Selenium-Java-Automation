package Selenium_Prastic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_Amazon_isdisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3716989618113146105&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061768&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		d1.manage().window().maximize();
		WebElement w1 =d1.findElement(By.name("field-keywords"));
		if (w1.isDisplayed()&&w1.isEnabled())
		{
		w1.sendKeys("shoe"+Keys.ENTER);
		}
	}

}
