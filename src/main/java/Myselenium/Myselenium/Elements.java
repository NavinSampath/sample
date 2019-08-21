package Myselenium.Myselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements extends Basejava

{
	public static WebDriver driver ;

	public Elements(WebDriver driver)
	{
	 this.driver = openbrowser();
	
	}
	
	By signin = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email_create']");
	By create = By.xpath("//form[@id='create-account_form']//span[1]");
	By Mr = By.xpath("//input[@id='id_gender1']");
	By Mrs =  By.xpath("//input[@id='id_gender2']");
	By fname = By.xpath("//input[@id='customer_firstname']");
	By lname = By.xpath("//input[@id='customer_lastname']");
	By mail = By.xpath("//input[@id='email']");
	By Password = By.xpath("//input[@id='passwd']");
	By nletter = By.xpath("//input[@id='newsletter']");
	By firstname = By.xpath("//input[@id='firstname']");
	By lastname = By.xpath("//input[@id='lastname']");
	By company = By.xpath("//input[@id='company']");
	By addr = By.xpath("//input[@id='address1']");
	By city = By.xpath("//input[@id='city']");
	By state = By.xpath("//select[@id='id_state']");
	By Zip = By.xpath("//input[@id='postcode']");
	By country = By.xpath("//select[@id='id_country']");
	By phone = By.xpath("//input[@id='phone_mobile']");
	By alt = By.xpath("//input[@id='alias']");
	By reg = By.xpath("//span[contains(text(),'Register')]");
	
	public WebElement homepage()
	{
		return driver.findElement(signin);
	
	}
	public WebElement create()
	{
		return driver.findElement(create);
	
	}
	public WebElement email()
	{
		return driver.findElement(email);
	
	}
	public WebElement Mr()
	{
		return driver.findElement(Mr);
	
	}
	public WebElement Mrs()
	{
		return driver.findElement(Mrs);
	
	}
	public WebElement fname()
	{
		return driver.findElement(fname);
	
	}
	public WebElement lname()
	{
		return driver.findElement(lname);
	
	}
	public WebElement mail()
	{
		return driver.findElement(mail);
	
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	
	}
	public WebElement nletter()
	{
		return driver.findElement(nletter);
	
	}
	public WebElement firstname()
	{
		return driver.findElement(firstname);
	
	}
	public WebElement lastname()
	{
		return driver.findElement(lastname);
	
	}
	public WebElement company()
	{
		return driver.findElement(company);
	
	}
	public WebElement addr()
	{
		return driver.findElement(addr);
	
	}
	public WebElement city()
	{
		return driver.findElement(city);
	
	}
	public WebElement state()
	{
		return driver.findElement(state);
	
	}
	public WebElement Zip()
	{
		return driver.findElement(Zip);
	
	}
	
	public WebElement country()
	{
		return driver.findElement(country);
	
	}
	public WebElement phone()
	{
		return driver.findElement(phone);
	
	}
	public WebElement alt()
	{
		return driver.findElement(alt);
	
	}
	public WebElement reg()
	{
		return driver.findElement(reg);
	
	}
	
}
