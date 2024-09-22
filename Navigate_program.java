package Selenium_Prastic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		d1.navigate().to("https://www.yahoo.com/");
		d1.navigate().back();
		Thread.sleep(2000);
		d1.navigate().refresh();
		Thread.sleep(2000);
		d1.navigate().forward();
		d1.close();
	}

}
