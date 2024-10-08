package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_multidimension 
{

		WebDriver driver;
		@Test(dataProvider="data1")
		public void multidimention(String username, String password)
		{
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fcomputers-and-accessories%2Fb%2F%3Fie%3DUTF8%26node%3D976392031%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email"));
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys(username);
		
		WebElement cnt_button = driver.findElement(By.id("continue"));
		cnt_button.click();
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		
		WebElement cnt2 = driver.findElement(By.id("signInSubmit"));
		cnt2.click();
		}


	@DataProvider(name ="data1")
	public Object[][] method1()
	{
	Object[][] d1= new Object[4][2];
	d1[0][0]= "9408332623"; //valid mobile number
	d1[0][1]="test@123"; //valid password
	
	d1[1][0]= "test@gmail.com"; //valid mobile number
	d1[1][1]="test@1234"; //valid password
	
	d1[2][0]= "9408332623554"; //Invalid mobile number
	d1[2][1]="ggterte"; //valid password
	
	d1[3][0]= "testdfdsf@gmail.com"; //valid mobile number
	d1[3][1]="test@1234fd"; //valid password
	
	
	return d1;
	
	
	
	}
}
		

