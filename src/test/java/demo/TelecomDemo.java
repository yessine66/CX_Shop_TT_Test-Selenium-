package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import pages.TelecomObject;
import pages.rechercheClientCXShop;
import pages.ClientPrv;
import pages.ClientCom;
import pages.rechercheClientCXShop;
import pages.ClonageClient;




public class TelecomDemo {
	
	static WebDriver driver = null;
	static TelecomObject telecom=null;
	static ClientPrv telecome=null;
	static ClientCom com=null;
	static rechercheClientCXShop rech = null;
	static ClonageClient clonage=null;
	
	static int averageTimeSec=1500;
	static int maxTimeSec=3000;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	/*****************/
	static rechercheClientCXShop rechC = null;
	/********************/
	
	
	
	
	
	By buttonHome = By.linkText("Accueil");

	By buttonHomeClient = By.linkText("Clients");
	By buttonHomeRechercheClient = By.linkText("Rechercher un client");

	
	
	
	
	
	
	@BeforeSuite
	public void setUpSuite() {
		
        // start reporters
         htmlReporter = new ExtentHtmlReporter("TelecomReport.html");
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}
	
	
	@BeforeTest
	public void setUpTest() {
		

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		 //driver = new FirefoxDriver();
		 
		
		//tabdil language mta3 browser
		
		 FirefoxProfile profile = new FirefoxProfile();
		//setting the locale french : ‘fr’
		profile.setPreference("intl.accept_languages","fr");
		driver = new FirefoxDriver(profile);
		 
		 driver.get("http://172.20.38.12:20940/custcare_shop_stage/webresources/Login.jsp");
		 telecom = new TelecomObject(driver);
		 telecome = new ClientPrv(driver);
			com = new ClientCom(driver) {
			};

			rech = new rechercheClientCXShop(driver); 
			clonage= new ClonageClient(driver);
			/*****************/
			rechC= new rechercheClientCXShop(driver);
			/*****************/

}
	
	
	


	@Test(priority = 0)
	public void Login() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Login ", "---Testing Login [login : MONDHER  | Password : SY ]");
	//	System.out.println("\nd5alna f fonction test login");
		
		
		telecom.setTextUsername("MONDHER");
		test.pass("Saisir Username");
		Thread.sleep(averageTimeSec);
		
		telecom.setTextPassword("SY");
		test.pass("Saisir Password");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonLogin();
		test.pass("clicked button login");
		Thread.sleep(maxTimeSec);
	}
	

@Test(priority = 1)
	public void clientPriveNonExistent() throws InterruptedException {
	
	
		
		ExtentTest test = extent.createTest("Test de creation clien privé non existant  ", "---Testing creation clien privé non existant ");
	//	System.out.println("\n ajout client privee");
	//	System.out.println("\n ajout client privee non existent");
		telecome.creationClientprive1 ();
		Thread.sleep(averageTimeSec);
		telecome.creationClientpriveNonExistent ();


	Thread.sleep(maxTimeSec);
	}
@Test(priority = 2)
public void clientPriveExistent() throws InterruptedException {
	
	ExtentTest test = extent.createTest("Test de creation client privé  existant  ", "---Testing creation client privé  existant ");
	
	//System.out.println("\n ajout client privee");
	//System.out.println("\n ajout client privee existent");
	telecome.creationClientprive2 ();
	Thread.sleep(averageTimeSec);
	telecome.creationClientpriveDupl ();
	Thread.sleep(maxTimeSec);
	
}

	@Test(priority = 3)
	public void clientComnNonExistent() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test de creation clien commercial non existant  ", "---Testing creation clien commercial non existant ");
		
		
		//	System.out.println("\n ajout client commercial non existent");
		
		com.creationClientcom();
		
		Thread.sleep(maxTimeSec);
		
	}
	@Test(priority = 4)
	public void clientComExistent() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test de creation clien commercial  existant  ", "---Testing creation clien commercial  existant ");
		
		//System.out.println("\n ajout client commercial existent");
		com.creationClientcomExistent();
		//telecom.creationClientpriveDupl ();
		//Thread.sleep(4000);
		
	}
	
	/***************************/
	@Test(priority = 5)
	public void rechercheCL() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test de Recherche Client ", "---Testing recherche client t ");
	
		
		//rechC.rechHome();
		Thread.sleep(4000);
		driver.findElement(buttonHome).click();
		Thread.sleep(4000);
		driver.findElement(buttonHomeRechercheClient).click();
		System.out.println("\n recherche par cin");
		rechC.rechClientCIN("08415632");	
		Thread.sleep(averageTimeSec);
		System.out.println("\n recherche par passeport");
		rechC.rechClientPASSEPORT("X5856552");	
		Thread.sleep(maxTimeSec);
		System.out.println("\n recherche par organisme");
		rechC.rechClientORGANISME("ID257767");
		Thread.sleep(maxTimeSec);
	}
	/******************************/







	
	@Test(priority = 6)
	public void VersRechercheContrat() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Acces vers la page de recherche contrat ", "---Acceder vers page de recherche contrat ");
		//System.out.println("\nd5alna f fonction li t'hez lel recherche");

		telecom.clickButtonContratClient();
		test.pass("clicked button Contrat Client ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat ");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
		
	}
	
	@Test(priority = 10)
	public void RechercheContratAvecCodeContart() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test recherche contrat avec code contrat ", "---Test recherche contrat avec code contrat [code contrat : CONTR0022888870] ");
		//System.out.println("\nd5alna f fonction li t'hez lel recherche");

		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.setCodeContratRechercheContrat("CONTR0022888870");
		test.pass("Saisir code contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheContra();
		test.pass("clicked button Rechercher ");
		Thread.sleep(averageTimeSec);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHome();
		test.pass("clicked button Home ");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
	}
	
/*	@Test(priority = 11)
	public void RechercheContratAvecNumClient() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test recherche contrat avec n°Client ", "---Test recherche contrat avec n°Client [n°Client : 1.101231] ");
		//System.out.println("\nd5alna f fonction li t'hez lel recherche");

		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat "); 
		Thread.sleep(averageTimeSec);
		
		telecom.setNumClientRechercheContrat("1.101231");
		test.pass("Saisir n°Client ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheContra();
		test.pass("clicked button Rechercher ");
		Thread.sleep(averageTimeSec);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHome();
		test.pass("clicked button Home ");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
	}

*/
	
	
	/*
	@Test(priority = 12)
	public void RechercheContratAvecNom() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test recherche contrat avec nom client ", "---Test recherche contrat avec nom client [nom : testMaha] ");
		//System.out.println("\nd5alna f fonction li t'hez lel recherche");

		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.setNomClientRechercheContrat("testMaha");
		test.pass("Saisir Nom ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheContra();
		test.pass("clicked button Rechercher ");
		Thread.sleep(averageTimeSec);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHome();
		test.pass("clicked button Home ");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
	}
*/

	@Test(priority = 13)
	public void RechercheContratAvecNumRessource() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test recherche contrat avec type ressource et numero ", "---Test recherche contrat avec type ressource et numero [Type Ressource : Numéros d'appel    Numero Ressource : 21679761214] ");
		//System.out.println("\nd5alna f fonction li taaml recherche b num ressource");

		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.selectTypeDeRessourceRechercheContrats("Numéros d'appel");
		test.pass("Choix de type de ressource");
		Thread.sleep(averageTimeSec);
		
		telecom.setTextFieldNumRessourceRecherContrat("21679761214");
		test.pass("Saisir numero ressource");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheContra();
		test.pass("clicked button Rechercher ");
		Thread.sleep(averageTimeSec);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHome();
		test.pass("clicked button Home ");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
	}
	

	/*
	@Test(priority = 14)
	public void RechercheContratAvecStatutPlanTarifaire() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test recherche contrat avec statut contrat et plan tarifaire ", "---Test recherche contrat avec statut contrat et plan tarifaire [statut contrat : Actif    plan tarifaire: FIX-Ahla] ");
		//System.out.println("\nd5alna f fonction li t'hez lel recherche bel statu wplan tarifaire");

		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.selectStatuContratRechercheContrat("Actif");
		test.pass("Choix Statu Contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.selectPlanTarifaireRechercheContrat("FIX-Ahla");
		test.pass("Choix plan tarifaire ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheContra();
		test.pass("clicked button Rechercher ");
		Thread.sleep(averageTimeSec);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHome();
		test.pass("clicked button Home ");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
	}
	*/
	@Test(priority = 15)
	public void GoToRandomClient() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Choix d'un client  ", "---Choisir client  [nom: testMaha  id:1.1115877925 CIN:05523546] Pour tester Ajout d'un contrat");
		//System.out.println("\nd5alna f fonction li bech nemchiw beha client njarbou alih ajout mta contrat");
		
		telecom.clickButtonHome();
		test.pass("clicked Home button");
		Thread.sleep(averageTimeSec);
		
		//telecom.clickButtonHomeClient();
		//test.pass("clicked  Clients button");
		//Thread.sleep(averageTimeSec);
		
		telecom.clickButtonHomeRechercheClient();
		test.pass("clicked Rechercher Un Client button");
		Thread.sleep(averageTimeSec);
		
		
		/*
		
		telecom.setTextFieldNomClientRecherche("testMaha");
		test.pass("Saisir testMaha nom de client à trouver ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheClient();
		test.pass("clicked Rechercher button");
		Thread.sleep(averageTimeSec);
		
		
		telecom.clickButtonExempleClient();
		test.pass("clicked exemple ID client");
		Thread.sleep(averageTimeSec);
*/
		 driver.findElement(By.name("ADR_DRIVELICENCE")).click();
		 Thread.sleep(1000);
		    new Select(driver.findElement(By.name("ADR_DRIVELICENCE"))).selectByVisibleText("CIN");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//option[@value='2']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("ADR_SOCIALSENO")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("ADR_SOCIALSENO")).clear();
		    Thread.sleep(1000);
		    driver.findElement(By.name("ADR_SOCIALSENO")).sendKeys("05523546");
		    Thread.sleep(1000);
		    driver.findElement(By.name("Search_Button")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("1.1115976154")).click();
		    Thread.sleep(1000);
		
		    
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority = 16)
	public void CreationContratSousClientDefinirLesAttributDeContartDeBase() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Definition des attributs de base de controle pour creer un contrat ", "---Definition des aatributs de base de contrat []");
		//System.out.println("\nd5alna f fonction li bech ndefiniw feha les attributs de contrat de base  ");
		
		telecom.clickButtonCreerContratSousClient();
		test.pass("clicked button Creer");
		Thread.sleep(averageTimeSec);
	/*	
		telecom.selectDomaineContrat("GSM");
		test.pass("choisir le domaine GSM");
		Thread.sleep(averageTimeSec);
		*/
		telecom.selectSousDomaineContrat("GSM");
		test.pass("choisir le sous domaine GSM");
		Thread.sleep(averageTimeSec);		

		telecom.selectReseauContrat("TUNTT");
		test.pass("choisir le reseau TUNTT");
		Thread.sleep(averageTimeSec);	
		
		Thread.sleep(maxTimeSec);
	}
	
	
	@Test(priority = 17)
	public void CreationContratSousClientSelectionPlanTarifaireServices() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Selection plan tarifaire et les services ", "---Selection plan tarifaire et les services [plan tarifaire :PRE - AHLA]");
		//	System.out.println("\nd5alna f fonction li bech taaml selection plan tarifaire w les services");
		
		telecom.clickButtonEtapeSuivant2CreationContrat();
		test.pass("Button Etape suivance clicked");
		Thread.sleep(averageTimeSec);
		
		telecom.selectPlanTarifaire("PRE - AHLA");
		test.pass("selection du plan tarifaire");
		Thread.sleep(averageTimeSec);
		
		
		Thread.sleep(maxTimeSec);
		
	}
	

	@Test(priority = 18)
	public void CreationContratSousClientAffecterRessource() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Affecter une ressource  ", "---Affecter une ressource[*:generer un numero automatiquement");
		//	System.out.println("\nd5alna f fonction li bech nzidou feha num");
		
		telecom.clickButtonEtapeSuivant3CreationContrat();
		test.pass("Button Etape suivance clicked");
		Thread.sleep(averageTimeSec);
		
		telecom.setTextFieldSimCreationContrat("*");
		test.pass("Saisir SIM");
		Thread.sleep(averageTimeSec);		
		
		
		Thread.sleep(maxTimeSec);
		
	}
	
	@Test(priority = 19)
	public void CreationContratSousClientConfigurationService() throws InterruptedException {
		ExtentTest test = extent.createTest("Test Selection Configuration des services ", "---Configuration des services []");
		//System.out.println("\nd5alna f fonction li bech taaml selection plan tarifaire w les services");
		
		telecom.clickButtonEtapeSuivant4CreationContrat();
		test.pass("Button Etape suivance clicked");
		Thread.sleep(averageTimeSec);		

		telecom.clickButtonCreationContratRedevancesMensuelles();
		test.pass("Button Choix du Redevances mensuelles");
		Thread.sleep(averageTimeSec);	
		
		telecom.clickButtonCreationContratRedevancesMensuellesAffectation();
		test.pass("Button Affecter clicked");
		Thread.sleep(averageTimeSec);	
		
		telecom.setTextFieldCreationContratRedevanceMensuelleMSISDN("*");
		test.pass("Saisir MSISDN");
		Thread.sleep(averageTimeSec);	
		
		telecom.clickButtonCreationContratRedevancesMensuellesMSIDSNOK();
		test.pass("Button OK clicked");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonCreationContratRedevancesMensuellesAffecterMSIDSNFermer();
		test.pass("Button Fermer clicked");
		Thread.sleep(averageTimeSec);
		
	
		Thread.sleep(maxTimeSec);
		
		
	}
	
	
	@Test(priority = 20)
	public void ConfirmationCreationDuContratSousClient() throws InterruptedException {
		ExtentTest test = extent.createTest("Test Selection Configuration des services ", "---Configuration des services []");
		//	System.out.println("\nd5alna f fonction li bech taaml selection plan tarifaire w les services");
		
		telecom.clickButtonEtapeSuivant5CreationContrat();
		test.pass("Button Etape suivance clicked");
		Thread.sleep(averageTimeSec);
		
		telecom.selectStatutContrat("Actif");
		test.pass("Choix du statut du contrat [Actif]");
		Thread.sleep(averageTimeSec);
		
		telecom.selectRaisonStatutContrat("Activation");
		test.pass("Choix du raison de  statut du contrat [Activation]");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonConfirmationCreationContrat5();
		test.pass("button Terminer clicked");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
		
	}

	
	
	/*
	 * FATMA
	 * ************************************************************************
	 * ***********************************************************************
	 * ***********************************************************************
	 */
	@Test(priority = 21)
	public void StatutAffectationService() throws InterruptedException {
		
		

		
		ExtentTest test = extent.createTest("Test changement status et affectation ", "---Test status avec code contrat [code contrat : CONTR0023076401] ");
		System.out.println("\nd5alna f fonction li t'hez lel recherche");
		telecom.clickButtonHome();
		test.pass("clicked Home button");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonContratClient();
		telecom.clickButtonContratClient();
		test.pass("clicked button Contrat Client ");
		Thread.sleep(0);
		
		telecom.clickButtonHomeRechercheContrat();
		test.pass("clicked button Rechercher un contrat ");
		Thread.sleep(0);
		
		
	
		
		telecom.setCodeContratRechercheContrat("CONTR0023076401");
		test.pass("Saisir code contrat ");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonRechercheContra();
		test.pass("clicked button Rechercher ");
		Thread.sleep(averageTimeSec);
		

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(0);
		
		telecom.ClickInspectContratPourService();
		test.pass("clicked contrat");
		Thread.sleep(0);
		
		telecom.ChoisirMiseEnAttente();
		test.pass("Clicked Mise en Attente ");
		Thread.sleep(0);
		
		telecom.ClickChangerStatus();
		test.pass("Clicked CHANGER STATUS");
		Thread.sleep(0);


		telecom.ComboActifS();
		Thread.sleep(1500);
		
		telecom.ChoisirStatusActifS();
		Thread.sleep(1500);
		
		test.pass("Statut Désactivé choisi");
		Thread.sleep(0);
		telecom.BoutonClickFilterStatusS();
		test.pass("Filtre selon mode Désactivé ");
		Thread.sleep(0);
		Thread.sleep(0);
		
		telecom.ChoisirInputS();
		Thread.sleep(0);
		telecom.ComboRaisonS("Desactivation Roaming DATA");
		test.pass("Statut Desactivation Roaming DATA choisi");
		Thread.sleep(0);
		telecom.ChoisirInput2S();
		Thread.sleep(0);
		telecom.BoutonOKStatusS();
		test.pass("Button OK Clicked");
		Thread.sleep(0);
		
		telecom.ChoisirMiseEnAttente();
		test.pass("Clicked Mise en Attente ");
		Thread.sleep(0);
		
		telecom.BoutonAffecterS();
		test.pass("Button Affecter Clicked");
		
		telecom.ChoixInput1AffS();
		Thread.sleep(0);
		telecom.ChoixInput2AffS();
		Thread.sleep(0);
		telecom.ChoixInput3AffS();
		Thread.sleep(1000);
		telecom.ComboActifS();
		telecom.ChoisirStatusAttenteS();
		test.pass("Statut en attente choisi");
		Thread.sleep(0);
		
		telecom.BoutonFinishAffectationS();
		test.pass("Button Finish Clicked");
		Thread.sleep(0);
		
		telecom.ChoisirMiseEnAttente();
		test.pass("Clicked Mise en Attente ");
		Thread.sleep(0);
		
		telecom.ClickSignalDappel();
		test.pass("Clicked Signal d'appel ");
		Thread.sleep(0);
		
		telecom.LinkChangerStatusS();
		Thread.sleep(0);
		telecom.NewValueStatusS();
		telecom.ChoisirStatusActifS();
		test.pass("Statut Désactivé choisi");
		Thread.sleep(0);
		telecom.ComboRaisonS("Desactivation Roaming DATA");
		test.pass("Statut Desactivation Roaming DATA choisi");
		Thread.sleep(0);
		
		telecom.BoutonOKStatusS();
		test.pass("Button OK Clicked");
		Thread.sleep(0);
		
		telecom.ChoisirMiseEnAttente();
		test.pass("Clicked Mise en Attente ");
		Thread.sleep(0);
		
		telecom.BoutonAffecterS();
		test.pass("Button Affecter Clicked");
		
		telecom.ChoixInput1AffS();
		Thread.sleep(0);
		telecom.ChoixInput2AffS();
		Thread.sleep(0);
		telecom.ChoixInput3AffS();
		Thread.sleep(0);
		telecom.ComboActifS();
		telecom.ChoisirStatusAttenteS();
		test.pass("Statut en attente choisi");
		Thread.sleep(0);
		
		telecom.BoutonFinishAffectationS();
		test.pass("Button Finish Clicked");
		Thread.sleep(0);
		
		telecom.ChoisirMiseEnAttente();
		test.pass("Clicked Mise en Attente ");
		Thread.sleep(0);
		telecom.ChoisirMiseEnAttente();
		
		/* services paramétrés
		
				telecom.BoutonAffecterS();
				test.pass("Button Affecter Clicked");
				telecom.ChoixInput4AffS();
				Thread.sleep(1500);
				telecom.ChoixInput5AffS();
				Thread.sleep(3000);
				telecom.AhbebcomLink();
				//We keep this thread svp
				Thread.sleep(5000);
				telecom.Numero1Link();
				Thread.sleep(1500);
				telecom.NumParamService("21698332075");
				Thread.sleep(1500);
				telecom.BoutonOKStatusS();
				Thread.sleep(1500);
				telecom.BoutonCloseAffect();
				Thread.sleep(1500);
				telecom.AccesAhbebcomVueEns();
				Thread.sleep(1500);
				telecom.BoutonFinishAffectationS();
				Thread.sleep(3000);
				telecom.AccesAhbebcomVueEns2();
				Thread.sleep(1500);
				telecom.AhbebcomLink();
				Thread.sleep(1500);
				telecom.Numero1Link();
				Thread.sleep(1500);
				driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
				Thread.sleep(1500);
				telecom.LinkChangerStatusS();
				Thread.sleep(1500);
				telecom.ComboRaisonS("Desactivation Roaming DATA");
				test.pass("Statut Desactivation Roaming DATA choisi");
				Thread.sleep(1500);
				telecom.ChoisirInput2S();
				Thread.sleep(1500);
				telecom.BoutonOKStatusS();
				test.pass("Button OK Clicked");
				Thread.sleep(3000);
				
		*/
		
	} 
	
	@Test(priority = 22)
	public void FactureClient() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test Facturation d'un client  ", "---Choisir client  [nom: testMaha  id:1.1115877925] Pour tester Facturation d'un client");		
		telecom.clickButtonHome();
		test.pass("clicked Home button");
		Thread.sleep(0);
		
		
		telecom.clickButtonHomeClientF();
		test.pass("clicked  Clients button");
		Thread.sleep(0);
		
		
		telecom.clickButtonHomeClientF();
		test.pass("clicked  Clients button");
		Thread.sleep(0);
		
		telecom.clickButtonHomeRechercheClientF();
		test.pass("clicked Rechercher Un Client button");
		Thread.sleep(0);
		
		System.out.println("\n recherche par CIN");
		rechC.rechClientCIN("03932437");	

		
		telecom.clickButtonRechercheClientF();
		test.pass("clicked Rechercher button");
		Thread.sleep(0);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(0);
		
		
		telecom.FacturationPourClient();
		test.pass("clicked ID client");
		Thread.sleep(0);
		
		telecom.SelectFacturationNode();
		Thread.sleep(0);
		
		telecom.ListEnsembleFinance();
		test.pass("clicked Vue d'ensemble des finances");
		Thread.sleep(0);
		
		
	
		
		
		
		telecom.clickButtonRechercheClientF();
		test.pass("clicked search ");
		Thread.sleep(0);
		
		telecom.ClickResultatFacture();
		test.pass("clicked resultat: une facture ");
		Thread.sleep(0);
		
		telecom.RelatedFacture();
		Thread.sleep(0);

		telecom.CloseButtonFacture();
		Thread.sleep(0);
		
		telecom.clickButtonHomeF();
		Thread.sleep(0);
		

		
		
		Thread.sleep(0);
		

	
	
	
	
	
	}
	
	
	
	
	
	@Test(priority = 25)
	public void LogOutc() throws InterruptedException {

		
		ExtentTest test = extent.createTest("Test LogOut ", "---Testing LogOut");
		//System.out.println("\nd5alna f fonction test logOut");
		
		telecom.clickButtonLogOut();
		test.pass("clicked button logOut");
		Thread.sleep(averageTimeSec);
		
		telecom.clickButtonYesLogOut();
		test.pass("clicked button Yes logOut");
		Thread.sleep(averageTimeSec);
		
		Thread.sleep(maxTimeSec);
		
		
	}
	
	
	
	
	
	
	
	@AfterTest
	public void tearDownTest() {
		
		try {
			Thread.sleep(maxTimeSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close browser
		driver.close();
		//driver.quit();
		System.out.println(" \n\n success ");
		
	
		
	}
	
	
	
	@AfterSuite
	public void tearDownSuite() {
		
		//driver.close();
		
        // calling flush writes everything to the log file
        extent.flush();
		
	}

}
