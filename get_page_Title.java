package Selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class get_page_Title 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		//driver.close();

	}

}
