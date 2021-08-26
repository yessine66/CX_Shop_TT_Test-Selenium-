package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ClonageClient {
	WebDriver driver=null;
	
	By btnCloner =By.name("Clone_Button");
	By btnChanger=By.name("ChangeBillCycle_Button");
	By btnListe = By.name("REQ_NEW_BILLCYCLE");
	static int averageTimeSec=0;
	static int maxTimeSec=0;
	
	
	
	
	
	
	public  ClonageClient (WebDriver driver) {
		this.driver=driver;
	}
	public void ClonageC() throws InterruptedException
	{
		driver.findElement(btnCloner).click();
		Thread.sleep(averageTimeSec);
		driver.findElement(btnChanger).click();
		Thread.sleep(averageTimeSec);
		
		Select dropdown1 = new Select(driver.findElement(btnListe));
		dropdown1.selectByVisibleText("ECARTE");
		Thread.sleep(averageTimeSec);
		driver.findElement(btnCloner).click();
		
		
		
		
		
	}
	
}
