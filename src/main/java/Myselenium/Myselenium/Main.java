package Myselenium.Myselenium;

import org.openqa.selenium.support.ui.Select;

public class Main extends Basejava {

	public static void main(String[] args) throws InterruptedException {
		
		Elements E = new Elements(driver);
		E.homepage().click();
		Thread.sleep(200);
		E.email().sendKeys("navinsampath2810@gmail.com");
		E.create().click();
		Thread.sleep(2000);
		E.Mr().click();
		E.fname().sendKeys("Navn");
		E.lname().sendKeys("sampath");
		E.Password().sendKeys("navin");
		Thread.sleep(2000);
		//E.email().clear();
		//E.email().sendKeys("navinsampath2810@gmail.com");
		//Thread.sleep(2000);
		E.nletter().click();
		E.firstname().sendKeys("navinsampath");
		E.lastname().sendKeys("sampath");
		E.company().sendKeys("Amazon");
		E.addr().sendKeys("TNHB qtrs sathuvachari");
		E.city().sendKeys("Tamilnadu");
		Select dropdown = new Select(E.state());
		dropdown.selectByIndex(1);;
		E.Zip().sendKeys("00000");
		Select dropdown1 = new Select(E.country());
		dropdown1.selectByIndex(1);;
		E.phone().sendKeys("9790299569");
		E.alt().sendKeys("Hai how r u ");
		E.reg().click();
		
		System.out.println("Completed");
	}

}
