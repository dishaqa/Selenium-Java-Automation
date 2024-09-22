package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_login {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
	  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fcomputers-and-accessories%2Fb%2F%3Fie%3DUTF8%26node%3D976392031%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email"));
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("dishachauhan@gmail.com");
		
		WebElement cnt_button = driver.findElement(By.id("continue"));
		cnt_button.click();
		
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys("fsdfdf");
		
		WebElement cnt2 = driver.findElement(By.id("signInSubmit"));
		cnt2.click();

	}

}
