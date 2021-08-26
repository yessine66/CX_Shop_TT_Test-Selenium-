package pages;

import java.security.SecureRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClientPrv {
WebDriver driver=null;
	
static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
static SecureRandom rnd = new SecureRandom();

	By username = By.name("j_username");
	By password = By.name("j_password");
	By buttonLogin = By.name("Submit");
	By buttonLogOut = By.linkText("Déconnexion");
	By buttonYesLogOut = By.name("YesButton");
	By buttonToLogin = By.linkText("Connexion");
	By client = By.linkText("Clients");
	By CreationclientP=By.linkText("Créer un client");
	By clientP=By.linkText("Client privé");
	By Nom = By.name("ADR_LNAME");
	By Prenom = By.name("ADR_FNAME");
	By Rue = By.name ("ADR_STREET");
	By Gouvernerat = By.name("ADR_STATE"); 
	By Localite= By.name("ADR_CITY");
	By adresse=By.name("ADR_EMAIL"); 
	By sms=By.name("ADR_SMSNO");
	By Nrue=By.name("ADR_STREETNO"); 
	By Pays=By.name("COUNTRY_ID"); 
	By codePostal =By.name("ADR_ZIP");
	By cin = By.name("ADR_DRIVELICENCE");
	By nationalite = By.name("ADR_NATIONALITY");
	By Npiece = By.name("ADR_SOCIALSENO");
	By siatuationF =By.name("MAS_CODE");
	By nvClientPDupl = By.name("NewCustomer_Button");
	By grpClient= By.name("PRG_CODE");
	By filtreGrpClient = By.name("enableGroupSelection");
	By cycleFact = By.name("CS_BILLCYCLE");
	By Devise = By.name("TB_CURRENCY_ID");
	By nextBtn=By.name("SuNextStepButton");
	By okhBtn =By.name("SuOkButton");
	By finishBtn =By.name("SuFinishButton");
	By filtreD =By.name("enableCustomerStatusSelection");
	static int averageTimeSec=0;
	static int maxTimeSec=0;

	public ClientPrv(WebDriver driver) {
		this.driver=driver;
	}
	
	String randomString(int len){
		   StringBuilder sb = new StringBuilder(len);
		   for(int i = 0; i < len; i++)
		      sb.append(AB.charAt(rnd.nextInt(AB.length())));
		   return sb.toString();
		}
	
	
	
	public void setTextUsername(String input) {
		
		driver.findElement(username).sendKeys(input);
		
	}
	
	public void setTextPassword(String input) {
		
		driver.findElement(password).sendKeys(input);
		
	}

	
	public void clickButtonLogin() {
	
		driver.findElement(buttonLogin).click();
		
	}
	
	public void clickButtonLogOut() {
		driver.findElement(buttonLogOut).click();
	}
	
	public void clickButtonYesLogOut() {
		driver.findElement(buttonYesLogOut).click();
	}
	public void clickButtonToLogin() {
		driver.findElement(buttonToLogin).click();
	}
	public void creationClientprive1 () throws InterruptedException {
		driver.findElement(client).click();
		Thread.sleep(averageTimeSec);
		driver.findElement(CreationclientP).click();
		Thread.sleep(averageTimeSec);
		driver.findElement(clientP).click();
		Thread.sleep(averageTimeSec);
		Select dropdown1 = new Select(driver.findElement(By.name("LNG_CODE")));
		dropdown1.selectByVisibleText("Francais");
		Thread.sleep(averageTimeSec);
		Select dropdown2 = new Select(driver.findElement(By.name("TTL_ID")));
		dropdown2.selectByVisibleText("Mme.");
		Thread.sleep(averageTimeSec);
	    driver.findElement(Nom).sendKeys(randomString(8));
	    Thread.sleep(averageTimeSec);
	    driver.findElement(Prenom).sendKeys(randomString(8));
	    Thread.sleep(averageTimeSec);
	    driver.findElement(Rue).sendKeys("abcd");
	    Select dropdown3 = new Select(driver.findElement(Gouvernerat));
		dropdown3.selectByVisibleText("ARIANA");
		Thread.sleep(averageTimeSec);
		Select dropdown4 = new Select(driver.findElement(Localite));
		dropdown4.selectByVisibleText("MNIHLA");
		Thread.sleep(averageTimeSec);
		driver.findElement(adresse).sendKeys("adresse@test.com");
		driver.findElement(sms).sendKeys("21695913774");
		driver.findElement(Nrue).sendKeys("adresse");
		Select dropdown5 = new Select(driver.findElement(Pays));
		dropdown5.selectByVisibleText("Tunisie");
		Select dropdown6 = new Select(driver.findElement(codePostal));
		dropdown6.selectByVisibleText("2094");
		Select dropdown7 = new Select(driver.findElement(cin));
		dropdown7.selectByVisibleText("CIN");
		Select dropdown8 = new Select(driver.findElement(nationalite));
		dropdown8.selectByVisibleText("Tunisie");
		 driver.findElement(Npiece).sendKeys("25251419");
		 Select dropdown9 = new Select(driver.findElement(siatuationF));
		dropdown9.selectByVisibleText("Célibataire");
		WebElement radio1 = driver.findElement(By.name("contactFormGender"));
		driver.findElement(By.name("contactFormValidateAddress")).click();

		
		driver.findElement(okhBtn).click();
	

		driver.findElement(nextBtn).click();
		
	}
	public void creationClientprive2 () throws InterruptedException {
		
		
		
		System.out.println("creationClientprive2");
		
		//driver.findElement(client).click();
		//driver.findElement(CreationclientP).click();
		driver.findElement(clientP).click();
		Select dropdown1 = new Select(driver.findElement(By.name("LNG_CODE")));
		dropdown1.selectByVisibleText("Francais");
		Thread.sleep(averageTimeSec);
		Select dropdown2 = new Select(driver.findElement(By.name("TTL_ID")));
		dropdown2.selectByVisibleText("Mme.");
		Thread.sleep(averageTimeSec);
	    driver.findElement(Nom).sendKeys("alex");
	    Thread.sleep(averageTimeSec);
	    driver.findElement(Prenom).sendKeys("alex");
	    Thread.sleep(averageTimeSec);
	    driver.findElement(Rue).sendKeys("abcd");
	    Thread.sleep(averageTimeSec);
	    Select dropdown3 = new Select(driver.findElement(Gouvernerat));
		dropdown3.selectByVisibleText("ARIANA");
		Thread.sleep(averageTimeSec);
		Select dropdown4 = new Select(driver.findElement(Localite));
		dropdown4.selectByVisibleText("MNIHLA");
		driver.findElement(adresse).sendKeys("adresse@test.com");
		driver.findElement(sms).sendKeys("21695913774");
		Thread.sleep(averageTimeSec);
		driver.findElement(Nrue).sendKeys("adresse");
		Thread.sleep(averageTimeSec);
		Select dropdown5 = new Select(driver.findElement(Pays));
		dropdown5.selectByVisibleText("Tunisie");
		Select dropdown6 = new Select(driver.findElement(codePostal));
		dropdown6.selectByVisibleText("2094");
		Select dropdown7 = new Select(driver.findElement(cin));
		dropdown7.selectByVisibleText("CIN");
		Select dropdown8 = new Select(driver.findElement(nationalite));
		dropdown8.selectByVisibleText("Tunisie");
		 driver.findElement(Npiece).sendKeys("25251419");
		 Select dropdown9 = new Select(driver.findElement(siatuationF));
		dropdown9.selectByVisibleText("Célibataire");
		WebElement radio1 = driver.findElement(By.name("contactFormGender"));
		driver.findElement(By.name("contactFormValidateAddress")).click();

		
		driver.findElement(okhBtn).click();
	

		driver.findElement(nextBtn).click();
	
	}
	public void creationClientpriveDupl () 
	{
		System.out.println("creationClientpriveDupl");
		driver.findElement(nvClientPDupl).click();
		
		Select dropdown1 = new Select(driver.findElement(grpClient));
		dropdown1.selectByVisibleText("Consumer");
		//filtreGrpClient
		driver.findElement(filtreGrpClient).click();
		
		Select dropdown2 = new Select(driver.findElement(cycleFact));
		dropdown2.selectByVisibleText("GSM Prepaye1");
		
		Select dropdown3 = new Select(driver.findElement(Devise));
		dropdown3.selectByVisibleText("TND");
		
		//SuNextStepButton
		driver.findElement(nextBtn).click();
		driver.findElement(nextBtn).click();
		
		Select dropdown4 = new Select(driver.findElement(By.name("CS_STATUS")));
		dropdown4.selectByVisibleText("Actif");
		
		driver.findElement(filtreD).click();
		
		Select dropdown5 = new Select(driver.findElement(By.name("RS_CODE")));
		dropdown5.selectByVisibleText("Activation");
		//finishBtn
		driver.findElement(finishBtn).click();
		
	}
	public void creationClientpriveNonExistent () {
		driver.findElement(nextBtn).click();
		driver.findElement(nextBtn).click();
		driver.findElement(finishBtn).click();
	
		
	}
	
	
}
