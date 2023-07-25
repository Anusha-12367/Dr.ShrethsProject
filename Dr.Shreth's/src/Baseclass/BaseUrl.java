package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseUrl {
	
	public static WebDriver dr;
	@BeforeTest
	public void urlloading()
	{
		dr = new ChromeDriver();
		 dr.get("https://www.drsheths.com/");
		 dr.manage().window().maximize();
	}

}
