package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TelecomObject {

	WebDriver driver=null;
	
	By username = By.name("j_username");
	By password = By.name("j_password");
	By buttonLogin = By.name("Submit");
	//By buttonLogOut = By.linkText("Déconnexion");
	By buttonLogOut = By.xpath("//a[3]");
	By buttonYesLogOut = By.name("YesButton");
	By buttonToLogin = By.linkText("Connexion");
	By buttonContratDeClient = By.linkText("Contrats de client");
	By buttonRechercherUnContrat = By.linkText("Rechercher un contrat");
	By CodeContrat = By.name("CO_ID_PUB");
	By buttonSubmitRechercheContrat = By.name("SuSubmitButton");
	By buttonHome = By.linkText("Accueil");
	By buttonContratClient =By.linkText("Contrats de client");
	By buttonHomeRechercheContrat = By.linkText("Rechercher un contrat");
	By textFieldCodeContratRechercheContrat = By.name("CO_ID_PUB");
	By textFieldNumClienRechercheContrat = By.name("CS_CODE");
	By textFieldNomClienRechercheContrat = By.name("ADR_LNAME");
	By selectTypeDeRessourceRechercheContrat = By.name("RESOURCE");
	By textFieldNumRessourceRecherContrat = By.name("RESOURCENO");
	By statuContratRechercheContrat = By.name("CO_STATUS");
	By planTarifaireRechercheContrat = By.name("RPCODE");
	By buttonRechercheContrat = By.name("SuSubmitButton");
	By buttonHomeClient = By.linkText("Clients");
	By buttonHomeRechercheClient = By.linkText("Rechercher un client");
	By buttonRechercheClient = By.name("Search_Button");
	By buttonExempleClient = By.linkText("1.1115976154");
	By buttonCreerContratSousClient = By.name("Add_Button");
	By domaineContrat = By.name("Market_ComboBox");
	By sousDomaineContrat = By.name("SubMarket_ComboBox");
	By reseauContrat = By.name("PLCODE");
	By buttonEtapeSuivant2CreationContrat = By.name("SuNextStepButton");
	By textFieldNomClientRecherche = By.name("ADR_LNAME");
	By planTarifaireContrat = By.name("Product_ComboBox");
	By buttonEtapeSuivant3CreationContrat = By.name("SuNextStepButton");
	By textFieldSimCreationContrat = By.name("DEVICE_NUMBER");
	By buttonEtapeSuivant4CreationContrat = By.name("SuNextStepButton");
	By buttonCreationContratRedevancesMensuelles = By.linkText("Redevances mensuelles");
	By buttonCreationContratRedevancesMensuellesAffecter = By.name("JSP_DIRECTORY_NUMBER_ADD_BUTTON"); 
	By textFieldCreationContratRedevanceMensuelleMSISDN = By.name("NUMBER");
	By buttonCreationContratRedevanceMensuelleMSISDNOK = By.name("SuOkButton");
	By buttonCreationContratRedevancesMensuellesAffecterMSIDSNFermer = By.name("JSP_CLOSE_BUTTON"); 
	By buttonEtapeSuivant5CreationContrat = By.name("SuNextStepButton");
	By statutContrat = By.name("Status_ComboBox");
	By raisonStatutContrat = By.name("REASON");
	By buttonConfirmationCreationContrat5 = By.name("Finish_Button");
	
	
	//FATMA **********************************************************************
	/*
	 * FATMA ****************************************************************
	 */

	By ActionBoutonCalendarAffectationS= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='dim'])[1]/following::td[39]");	
	By ContratPourService = By.linkText("CONTR0023075915");
	By ChangerStatutService= By.xpath("//tr[5]/td[2]/table/tbody/tr/td/nobr/a/img");
	By ChoisirStatusActifS=By.xpath("//option[@value='4']");
	By ChoisirStatusAttenteS=By.xpath("//option[@value='1']");
	By BoutonClickChangerS= By.name("JSP_CHANGE_SERVICE_STATUS_BUTTON");
	By BoutonClickFilterStatusS= By.name("Filter_Button_Key");
	By ChoisirInputS= By.xpath("//tr[8]/td/span/input");
	By ComboRaisonS=By.name("USER_REASON");
	By ComboActifS=By.name("COS_PENDING_STATUS");
	By ChoisirInput2S=By.xpath("//option[@value='24']");
	By BoutonCalendarS= By.id("EXECUTION_DATE_DateButton");
	By ActionBoutonCalendarS= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='dim'])[1]/following::td[22]");
	By BoutonOKStatusS= By.name("SuOkButton");
	By BoutonVerifStatutS=By.xpath("//tr[11]/td[2]/table/tbody/tr/td/nobr/a/img");
	By ChoisirServicePourAffectation= By.xpath("//tr[7]/td[2]/table/tbody/tr/td/nobr/a/img");
	By BoutonAffecterS= By.name("JSP_ASSIGN_SERVICE_BUTTON");
	By ChoixInput1AffS= By.xpath("//tr[5]/td/input");
	By ChoixInput2AffS= By.xpath("//table[4]/tbody/tr/td/input");
	By ChoixInput3AffS= By.xpath("//table[4]/tbody/tr/td/input[2]");
	By BoutonCalendarAffectationS= By.id("ValidFrom_Field_DateButton");
	By BoutonFinishAffectationS= By.name("SuFinishButton");
	By PathMouzikti = By.xpath("//tr[9]/td[2]/table/tbody/tr/td/nobr/a/img");
	By LinkMouzikti= By.linkText("MOUZIKTI");
	By LinkChangerStatusS= By.linkText("Changer de statut");
	By NewValueStatusS= By.name("NewStatus_Value_Key");
	By BoutonCloseStatusS= By.name("JSP_CLOSE_BUTTON");
	By FacturationPourClient= By.linkText("1.11174024");
	By SelectFacturationNode= By.xpath("//tr[@id='CustomerBillingNode']/td/a/img");
	By ListEnsembleFinance= By.linkText("Vue d'ensemble des finances");
	By RechercheCalendarFacturation= By.id("SearchFrom_Field_DateButton");
	By InputCalendarFacture= By.name("SearchFrom_Field");
	By Recherche29juin1= By.xpath("//input[@id='SearchFrom_Field']");
	By Recherche29juin2= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[2]/following::div[1]");
	By Recherche29juin3= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::div[1]");
	By Recherche29juin3_1= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::div[1]");
	By Recherche29juin4= By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='dim'])[1]/following::td[36]");
	By ClickResultatFacture= By.linkText("2019120000009452");
	By RelatedFacture = By.name("Related_Payments_Button");
	By CloseButtonFacture= By.name("Close_Button");

	//newfct fatma
	
	By InspectContratPourService= By.linkText("CONTR0023076401");
	By ChoisirMiseEnAttente= By.xpath("//tr[4]/td[2]/table/tbody/tr/td/nobr/a/img");
	By ClickChangerStatus= By.name("JSP_CHANGE_SERVICE_STATUS_BUTTON");
	By ClickSignalDappel= By.linkText("Signal d appel");
	
	//service paramétrés
		By ChoixInput4AffS= By.xpath("//tr[6]/td/input");
		By ChoixInput5AffS= By.xpath("//table[4]/tbody/tr/td/input");
		By AhbebcomLink= By.linkText("AhbebCom");
		By Numero1Link= By.linkText("Numero 1");
		By NumParamService= By.name("JSP_FIELD");
		By AccesAhbebcomVueEns= By.xpath("//table[4]/tbody/tr/td/input[2]");
		By AccesAhbebcomVueEns2= By.xpath("//tr[5]/td[2]/table/tbody/tr/td/nobr/a/img");
		By BoutonCloseAffect= By.name("JSP_CLOSE_BUTTON");
	
	public TelecomObject(WebDriver driver) {
		this.driver=driver;
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
	
	public void clickButtonHome() {
		driver.findElement(buttonHome).click();
	}
	
	public void clickButtonHomeRechercheContrat() {
		driver.findElement(buttonHomeRechercheContrat).click();
	}
	
	public void clickButtonContratClient() {
		driver.findElement(buttonContratClient).click();
	}
	
	public void setCodeContratRechercheContrat(String input) {
		driver.findElement(textFieldCodeContratRechercheContrat).sendKeys(input);
	}
	
	public void setNumClientRechercheContrat(String input) {
		driver.findElement(textFieldNumClienRechercheContrat).sendKeys(input);
	}
	
	public void setNomClientRechercheContrat(String input) {
		driver.findElement(textFieldNomClienRechercheContrat).sendKeys(input);
	}
	
	public void selectTypeDeRessourceRechercheContrats(String input/*Numéros d'appel*/) {
		Select Lista = new Select(driver.findElement(selectTypeDeRessourceRechercheContrat));
		//Lista.selectByVisibleText(input);	
		Lista.selectByIndex(1);
	}
	
	public void selectStatuContratRechercheContrat(String input/*Actif*/) {
		Select Lista = new Select(driver.findElement(statuContratRechercheContrat));
		Lista.selectByVisibleText(input);	
	}
	
	public void selectPlanTarifaireRechercheContrat(String input/*FIX-Ahla*/) {
		Select Lista = new Select(driver.findElement(planTarifaireRechercheContrat));
		Lista.selectByVisibleText(input);	
	}
	
	public void setTextFieldNumRessourceRecherContrat(String input ) {
		driver.findElement(textFieldNumRessourceRecherContrat).sendKeys(input);
	}
	
	public void clickButtonRechercheContra() {
		driver.findElement(buttonRechercheContrat).click();
	}
	
	public void clickButtonHomeClient() {
		driver.findElement(buttonHomeClient).click();
	}
	
	public void clickButtonHomeRechercheClient() {
		driver.findElement(buttonHomeRechercheClient).click();
	}
	
	public void clickButtonRechercheClient() {
		driver.findElement(buttonRechercheClient).click();
	}
	
	public void clickButtonExempleClient() {
		driver.findElement(buttonExempleClient).click();
	}
	
	public void clickButtonCreerContratSousClient() {
		driver.findElement(buttonCreerContratSousClient).click();
	}
	
	public void selectDomaineContrat(String input) {
		Select DomaineList = new Select(driver.findElement(domaineContrat));
		DomaineList.selectByVisibleText(input);	
	}
	
	public void selectSousDomaineContrat(String input) {
		Select sousDomaineList = new Select(driver.findElement(sousDomaineContrat));
		sousDomaineList.selectByVisibleText(input);	
	}
	
	public void selectReseauContrat(String input) {
		Select reseauList = new Select(driver.findElement(reseauContrat));
		reseauList.selectByVisibleText(input);	
	}	
	
	public void clickButtonEtapeSuivant2CreationContrat() {
		driver.findElement(buttonEtapeSuivant2CreationContrat).click();
	}
	
	public void setTextFieldNomClientRecherche(String input) {
		driver.findElement(textFieldNomClientRecherche).sendKeys(input);
	}
	
	public void selectPlanTarifaire(String input /*PRE - AHLA*/) {
		Select PlanTarifaireList = new Select(driver.findElement(planTarifaireContrat));
		PlanTarifaireList.selectByVisibleText(input);	
	}	
	
	public void clickButtonEtapeSuivant3CreationContrat() {
		driver.findElement(buttonEtapeSuivant3CreationContrat).click();
	}
	
	public void setTextFieldSimCreationContrat(String input) {
		driver.findElement(textFieldSimCreationContrat).sendKeys(input);
	}
	
	public void clickButtonEtapeSuivant4CreationContrat() {
		driver.findElement(buttonEtapeSuivant4CreationContrat).click();
	}
	
	public void clickButtonCreationContratRedevancesMensuelles() {
		driver.findElement(buttonCreationContratRedevancesMensuelles).click();
	}
	
	public void clickButtonCreationContratRedevancesMensuellesAffectation() {
		driver.findElement(buttonCreationContratRedevancesMensuellesAffecter).click();
	}
	
	public void setTextFieldCreationContratRedevanceMensuelleMSISDN(String input) {
		driver.findElement(textFieldCreationContratRedevanceMensuelleMSISDN).sendKeys(input);
	}
	
	public void clickButtonCreationContratRedevancesMensuellesMSIDSNOK() {
		driver.findElement(buttonCreationContratRedevanceMensuelleMSISDNOK).click();
	}
	
	public void clickButtonCreationContratRedevancesMensuellesAffecterMSIDSNFermer() {
		driver.findElement(buttonCreationContratRedevancesMensuellesAffecterMSIDSNFermer).click();
	}
	
	public void clickButtonEtapeSuivant5CreationContrat() {
		driver.findElement(buttonEtapeSuivant5CreationContrat).click();
	}
	
	public void selectStatutContrat(String input/*Actif*/) {
		Select StatutList = new Select(driver.findElement(statutContrat));
		StatutList.selectByVisibleText(input);	
	}
	
	public void selectRaisonStatutContrat(String input/*Activation*/) {
		Select RaisonStatutList = new Select(driver.findElement(raisonStatutContrat));
		RaisonStatutList.selectByVisibleText(input);	
	}
	
	public void clickButtonConfirmationCreationContrat5() {
		driver.findElement(buttonConfirmationCreationContrat5).click();
	}
	
	
	/*
	 * FATMA *************************************************************************
	 * **********************************************************************************
	 * **********************************************************************************
	 */
		// FATMA
	
	
	

	public void ContratPourService() {
		driver.findElement(ContratPourService).click();
	}
	
	public void ChangerStatutS() {
		driver.findElement(ChangerStatutService).click();
	}
	
	public void BoutonClickChangerS() {
		
		driver.findElement(BoutonClickChangerS).click();
	}
	
	public void ChoisirStatusActifS() {
		
		driver.findElement(ChoisirStatusActifS).click();
	}
	
	public void BoutonClickFilterStatusS() {
		
		driver.findElement(BoutonClickFilterStatusS).click();
	}
	
	public void ChoisirInputS() {
	
		driver.findElement(ChoisirInputS).click();
	}
	
	public void ComboRaisonS(String input) {
		Select ComboRaison = new Select(driver.findElement(ComboRaisonS));
		ComboRaison.selectByVisibleText(input);		
	}
	
	public void ComboActifS() {
		//Select ComboActif = new Select(driver.findElement(ComboActifS));
	//	ComboActif.selectByVisibleText(input);	
		driver.findElement(ComboActifS).click();
	}
	
	public void ChoisirInput2S() {
		
		driver.findElement(ChoisirInput2S).click();
	}
	
	public void BoutonCalendarS() {
		
		driver.findElement(BoutonCalendarS).click();
	}
	
	public void ActionBoutonCalendarS() {
		
		driver.findElement(ActionBoutonCalendarS).click();
	}
	
	public void BoutonOKStatusS() {
		
		driver.findElement(BoutonOKStatusS).click();
	}
	
	public void BoutonVerifStatutS() {
		
		driver.findElement(BoutonVerifStatutS).click();
	}

	public void ChoisirServicePourAffectation () {
		
		driver.findElement(ChoisirServicePourAffectation).click();

	}
	
	public void BoutonAffecterS () {
		
		driver.findElement(BoutonAffecterS).click();

	}
	
	public void ChoixInput1AffS () {
		
		driver.findElement(ChoixInput1AffS).click();

	}
	
	public void ChoixInput2AffS () {
		
		driver.findElement(ChoixInput2AffS).click();

	}
	
	public void ChoixInput3AffS () {
		
		driver.findElement(ChoixInput3AffS).click();

	}
	
	public void BoutonCalendarAffectationS () {
		
		driver.findElement(BoutonCalendarAffectationS).click();

	}
	
	public void ActionBoutonCalendarAffectationS () {
		
		driver.findElement(ActionBoutonCalendarAffectationS).click();

	}
	
	public void BoutonFinishAffectationS () {
		
		driver.findElement(BoutonFinishAffectationS).click();

	}
	
	public void PathMouzikti () {
		
		driver.findElement(PathMouzikti).click();

	}
	
	public void LinkMouzikti() {
		driver.findElement(LinkMouzikti).click();
		
	}
	
	public void LinkChangerStatusS() {
		driver.findElement(LinkChangerStatusS).click();
		
	}
	
	public void NewValueStatusS() {
		//	Select NewValue = new Select(driver.findElement(NewValueStatusS));
		//	NewValue.selectByVisibleText(input);	
			driver.findElement(NewValueStatusS).click();
		}
	public void BoutonCloseStatusS() {
		
		driver.findElement(BoutonCloseStatusS).click();
	}	
	public void setTextFieldNumClienRechercheContrat(String input) {
		driver.findElement(textFieldNumClienRechercheContrat).sendKeys(input);
	}
	
	public void FacturationPourClient() {
		driver.findElement(FacturationPourClient).click();
	}
	
	public void SelectFacturationNode() {
		driver.findElement(SelectFacturationNode).click();
	}
	
	public void ListEnsembleFinance() {
		driver.findElement(ListEnsembleFinance).click();
	}
	
	public void RechercheCalendarFacturation() {
		driver.findElement(RechercheCalendarFacturation).click();
	}
	
	public void Recherche29juin1() {
		driver.findElement(Recherche29juin1).click();
	}
	
	public void Recherche29juin2() {
		driver.findElement(Recherche29juin2).click();
	}
	
	public void Recherche29juin3() {
		driver.findElement(Recherche29juin3).click();
	}
	public void Recherche29juin3_1() {
		driver.findElement(Recherche29juin3_1).click();
	}
	
	public void Recherche29juin4() {
		driver.findElement(Recherche29juin4).click();
	}
	
	public void ClickResultatFacture() {
		driver.findElement(ClickResultatFacture).click();
	}
	
	public void RelatedFacture() {
		driver.findElement(RelatedFacture).click();
	}
	
	public void CloseButtonFacture() {
		driver.findElement(CloseButtonFacture).click();
	}
	
	//newwwwwww
	public void clickButtonHomeClientF() {
		driver.findElement(buttonHomeClient).click();
	}
	public void clickButtonRechercheClientF() {
		driver.findElement(buttonRechercheClient).click();
	}
	
	public void clickButtonHomeRechercheClientF() {
		driver.findElement(buttonHomeRechercheClient).click();
	}
	
	
	public void clickButtonHomeF() {
		driver.findElement(buttonHome).click();
	}
	
	public void setInputCalendarFacture(String input) {
		driver.findElement(InputCalendarFacture).sendKeys(input);	
	}
	
	public void ClickInspectContratPourService() {
		driver.findElement(InspectContratPourService).click();
		
	}
	public void ChoisirMiseEnAttente() {
		driver.findElement(ChoisirMiseEnAttente).click();
		
	}
	
	public void ClickChangerStatus() {
	
	driver.findElement(ClickChangerStatus).click();
		
	}
	
	public void ChoisirStatusAttenteS() {
		
	driver.findElement(ChoisirStatusAttenteS).click();
	}
	
	public void ClickSignalDappel() {
		
		driver.findElement(ClickSignalDappel).click();
		}
		
	
public void ChoixInput4AffS () {
		
		driver.findElement(ChoixInput4AffS).click();

	}
	public void ChoixInput5AffS () {
	
	driver.findElement(ChoixInput5AffS).click();

}
	public void AhbebcomLink () {
		
		driver.findElement(AhbebcomLink).click();

	}
	
	public void Numero1Link () {
		
		driver.findElement(Numero1Link).click();

	}
	
	public void NumParamService(String input) {
		driver.findElement(NumParamService).sendKeys(input);	
	}
	
	public void AccesAhbebcomVueEns () {
		
		driver.findElement(AccesAhbebcomVueEns).click();

	}

	public void AccesAhbebcomVueEns2 () {
	
	driver.findElement(AccesAhbebcomVueEns2).click();

	}
	
	public void BoutonCloseAffect () {
		
		driver.findElement(BoutonCloseAffect).click();

		}
	
	
}
