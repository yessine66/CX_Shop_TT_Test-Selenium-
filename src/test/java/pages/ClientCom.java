package pages;

import java.security.SecureRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public abstract class ClientCom {
	WebDriver driver=null;
	
	
	static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom rnd = new SecureRandom();
	

	By buttonHome = By.linkText("Accueil");
		By client = By.linkText("Clients");
		By CreationclientC=By.linkText("Créer un client");
		By clientC=By.linkText("Client commercial");
		By CreationclientP=By.linkText("Créer un client");
		By clientP=By.linkText("Client privé");
		By NomS = By.name("ADR_NAME");
		By Nom = By.name("ADR_LNAME");
		By Prenom = By.name("ADR_FNAME");
		By NFiscale =By.name("ADR_TAXNO");
		By FiltreTaxBtn=By.name("FilterButtonTax");
		By Rue = By.name ("ADR_STREET");
		By Gouvernerat = By.name("ADR_STATE"); 
		By Localite= By.name("ADR_CITY");
		By adresse=By.name("ADR_EMAIL"); 
		By Nrue=By.name("ADR_STREETNO"); 
		By Pays=By.name("COUNTRY_ID"); 
		By codePostal =By.name("ADR_ZIP");
		By cin = By.name("ADR_DRIVELICENCE");
		By nationalite = By.name("ADR_NATIONALITY");
		By Npiece = By.name("ADR_SOCIALSENO");
		By siatuationF =By.name("MAS_CODE");
		By okFBtn = By.name("OK_Button");
		By validerF =By.name("contactFormValidateAddress");
	
		By okBtn =By.name("SuOkButton");
		By nextBtn =By.name("SuNextStepButton");		
		By finishBtn = By.name("SuFinishButton");
		//By NvClientC = By.xpath("/html/body/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/form/table[2]/tbody/tr[4]/td/input[1]");
		By NvClientC= By.name("NewCustomer_Button");
		By grpClient= By.name("PRG_CODE");
		By filtreGrpClient = By.name("enableGroupSelection");
		By cycleFact = By.name("CS_BILLCYCLE");
		By Devise = By.name("TB_CURRENCY_ID");
		By ModeP = By.name("CPA_pm");  
By ok=By.name("OK_Button");

static int averageTimeSec=1500;
static int maxTimeSec=0;
		
		
		
		public ClientCom(WebDriver driver) {
			this.driver=driver;
		}
		
		


		String randomString(int len){
		   StringBuilder sb = new StringBuilder(len);
		   for(int i = 0; i < len; i++)
		      sb.append(AB.charAt(rnd.nextInt(AB.length())));
		   return sb.toString();
		}
		
		
		public void creationClientcom() throws InterruptedException {
			
			driver.findElement(clientC).click();
			Thread.sleep(averageTimeSec);
			 driver.findElement(NFiscale).sendKeys("0000059W");
			 Thread.sleep(averageTimeSec);
			 driver.findElement( FiltreTaxBtn).click();
			 Thread.sleep(averageTimeSec);
			Select dropdown1 = new Select(driver.findElement(By.name("LNG_CODE")));
			dropdown1.selectByVisibleText("Francais");
			Thread.sleep(averageTimeSec);
			driver.findElement(NomS).clear();
			
			driver.findElement(NomS).sendKeys(randomString(8));
			Thread.sleep(averageTimeSec);
			driver.findElement(Nom).clear();
			Thread.sleep(averageTimeSec);
		    driver.findElement(Nom).sendKeys(randomString(8));
		    Thread.sleep(averageTimeSec);
		    driver.findElement(Prenom).clear();
		    Thread.sleep(averageTimeSec);
		    driver.findElement(Prenom).sendKeys(randomString(8));
		    Thread.sleep(averageTimeSec);
		    driver.findElement(Rue).clear();
		    Thread.sleep(averageTimeSec);
		    driver.findElement(Rue).sendKeys("abcd");
		    Thread.sleep(averageTimeSec);
		    Select dropdown3 = new Select(driver.findElement(Gouvernerat));
		  
			dropdown3.selectByVisibleText("ARIANA");
		
			Select dropdown4 = new Select(driver.findElement(Localite));
		
			dropdown4.selectByVisibleText("MNIHLA");
			Thread.sleep(averageTimeSec);
			driver.findElement(adresse).sendKeys("adresse@test.com");
			Thread.sleep(averageTimeSec);
			driver.findElement(Nrue).sendKeys("adresse");
			Thread.sleep(averageTimeSec);
			Select dropdown5 = new Select(driver.findElement(Pays));
			
			dropdown5.selectByVisibleText("Tunisie");
			Thread.sleep(averageTimeSec);
			Select dropdown6 = new Select(driver.findElement(codePostal));
		
			dropdown6.selectByVisibleText("2094");
			 driver.findElement(validerF).click();
			 Thread.sleep(averageTimeSec);
			 driver.findElement( okBtn).click();
			 Thread.sleep(averageTimeSec);
			driver.findElement(nextBtn).click();
		
	
		driver.findElement(nextBtn).click();
	
	driver.findElement(nextBtn).click();
	driver.findElement(finishBtn).click();
	
	}
		public void creationClientcomExistent() throws InterruptedException {
			
			driver.findElement(clientC).click();
			Thread.sleep(averageTimeSec);
			System.out.println("homeee clien com2");
			 driver.findElement(NFiscale).sendKeys("0000059W");
			 Thread.sleep(averageTimeSec);
			 driver.findElement( FiltreTaxBtn).click();
			 Thread.sleep(averageTimeSec);
			Select dropdown1 = new Select(driver.findElement(By.name("LNG_CODE")));
			dropdown1.selectByVisibleText("Francais");
			driver.findElement(NomS).clear();
			Thread.sleep(averageTimeSec);
			driver.findElement(NomS).sendKeys("test");
			driver.findElement(Nom).clear();
			Thread.sleep(averageTimeSec);
		    driver.findElement(Nom).sendKeys("test");
		    driver.findElement(Prenom).clear();
		    Thread.sleep(averageTimeSec);
		    driver.findElement(Prenom).sendKeys("mmm");
		    
		    driver.findElement(Rue).clear();
		    driver.findElement(Rue).sendKeys("abcd");
		    Thread.sleep(averageTimeSec);
		    Select dropdown3 = new Select(driver.findElement(Gouvernerat));
			dropdown3.selectByVisibleText("ARIANA");
			Thread.sleep(averageTimeSec);
			Select dropdown4 = new Select(driver.findElement(Localite));
			dropdown4.selectByVisibleText("MNIHLA");
			Thread.sleep(averageTimeSec);
			driver.findElement(adresse).sendKeys("adresse@test.com");
		
			driver.findElement(Nrue).sendKeys("adresse");
			Select dropdown5 = new Select(driver.findElement(Pays));
			dropdown5.selectByVisibleText("Tunisie");
			Select dropdown6 = new Select(driver.findElement(codePostal));
			dropdown6.selectByVisibleText("2094");
			 driver.findElement(validerF).click();
			 Thread.sleep(averageTimeSec);
			 driver.findElement( okBtn).click();
			 Thread.sleep(averageTimeSec);
			driver.findElement(nextBtn).click();
			Thread.sleep(1500);
			Thread.sleep(averageTimeSec);
			driver.findElement(NvClientC).click();
			System.out.println("2");
			Select dropdown11 = new Select(driver.findElement(grpClient));
				dropdown11.selectByVisibleText("Consumer");
				Thread.sleep(averageTimeSec);
				driver.findElement(filtreGrpClient).click();
				Select dropdown22 = new Select(driver.findElement(cycleFact));
				dropdown22.selectByVisibleText("GSM Prepaye1");
				Thread.sleep(averageTimeSec);
				Select dropdown33 = new Select(driver.findElement(Devise));
				dropdown33.selectByVisibleText("TND");
				driver.findElement(nextBtn).click();
				Thread.sleep(1500);
				Select dropdown44 = new Select(driver.findElement(ModeP));
				dropdown44.selectByVisibleText("Espece");
				driver.findElement(nextBtn).click();
				Thread.sleep(averageTimeSec);
				driver.findElement(finishBtn).click();
				
			
		}
		
}
