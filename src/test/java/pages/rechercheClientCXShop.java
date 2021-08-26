package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class rechercheClientCXShop {
WebDriver driver=null;

	
By buttonHome = By.linkText("Accueil");

By buttonHomeClient = By.linkText("Clients");
By buttonHomeRechercheClient = By.linkText("Rechercher un client");
static int averageTimeSec=1000;
static int maxTimeSec=3000;
By LD_recherche = By.name("ADR_DRIVELICENCE");
By textF_recherche =By.name("ADR_SOCIALSENO");  	
By btnRech = By.name("Search_Button");
public rechercheClientCXShop(WebDriver driver) {
this.driver=driver;
}

public void rechHome() throws InterruptedException {
	
	driver.findElement(buttonHome).click();
	driver.findElement(buttonHomeClient).click();
	driver.findElement(buttonHomeRechercheClient).click();
}

public void rechClientCIN(String inputCIN) throws InterruptedException {
	
	Thread.sleep(averageTimeSec);
	Select dropdown1 = new Select(driver.findElement(LD_recherche));
	dropdown1.selectByVisibleText("CIN");
	Thread.sleep(averageTimeSec);
	driver.findElement(textF_recherche).sendKeys(inputCIN);
	driver.findElement(btnRech).click();
}
public void rechClientPASSEPORT(String inputPASSEPORT) throws InterruptedException {
	Thread.sleep(averageTimeSec);
	Select dropdown1 = new Select(driver.findElement(LD_recherche));
	dropdown1.selectByVisibleText("Passeport");
	Thread.sleep(averageTimeSec);
	driver.findElement(textF_recherche).clear();
	driver.findElement(textF_recherche).sendKeys(inputPASSEPORT);
	driver.findElement(btnRech).click();
	
}
public void rechClientORGANISME(String inputORGANISME) throws InterruptedException {
	
	Thread.sleep(averageTimeSec);
	Select dropdown1 = new Select(driver.findElement(LD_recherche));
	dropdown1.selectByVisibleText("Organisme");
	Thread.sleep(averageTimeSec);
	driver.findElement(textF_recherche).clear();
	driver.findElement(textF_recherche).sendKeys(inputORGANISME);
	driver.findElement(btnRech).click();
	
}
















}
