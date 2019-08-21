package Myselenium.Myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basejava {
	
	public static WebDriver driver ;
	
	public WebDriver openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\new code\\New folder\\Myselenium\\src\\main\\java\\Myselenium\\Myselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		return driver;
	}
	
	
	

}
