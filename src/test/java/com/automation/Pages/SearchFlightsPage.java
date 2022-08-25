package com.automation.Pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFlightsPage extends BasePage {

	// declaration
	@FindBy(xpath = "//span[@class='langCardClose']")
	private WebElement closepop;

	@FindBy(xpath = "(//span[@class='tabsCircle appendRight5'])[2]")
	private WebElement selrtrip;
	
	@FindBy(xpath="//span[@class='lbl_input latoBold appendBottom5']")
	private WebElement addtraveller;
	
	@FindBy(xpath="//li[@data-cy='adults-2']")
	private WebElement adultscount;
	
	@FindBy(xpath="//li[@data-cy='children-1']")
	private WebElement childcount;
	
	@FindBy(xpath="//button[@data-cy='travellerApplyBtn']")
	private WebElement applybtn;
	

	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	private WebElement search;

	@FindBy(xpath = "//button[@class='button buttonSecondry buttonBig fontSize12 relative']")
	private WebElement closepop2;

	@FindBy(xpath = "//button[@class='splitFooterButton button buttonPrimary buttonBig appendBottom8 ']")
	private WebElement booknow;
	
	@FindBy(xpath = "//button[@class='buttonPrimary buttonBig  lato-black button']")
	private WebElement clkCont;

	@FindBy(xpath = "//button[@class='addTravellerBtn']")
	private WebElement addnewad;
	
	@FindBy(xpath = "(//button[@class='addTravellerBtn'])[2]")
	private WebElement addnewchild;

	@FindBy(xpath = "//input[@placeholder='First & Middle Name']")
	private WebElement fname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lname;


	@FindBy(xpath = "(//span[@class='selectTabText'])[1]")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	private WebElement mob;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 ']")
	private WebElement conti;

	@FindBy(xpath = "(//span[@class='fontSize14 darkText'])[1]")
	private WebElement baseFare;
	
	@FindBy(xpath = "(//span[@class='fontSize14 darkText'])[2]")
	private WebElement surchargeFare;
	
	@FindBy(xpath = "(//span[@class='fontSize16 blackFont'])[2]")
	private WebElement totalFare;
	

	public void ClosePop() {
		closepop.click();
	}

	public void clickRtrip() {
		selrtrip.click();
	}
	
	public void clickAddtraveller()
	{
		addtraveller.click();
	}
	
	public void clickadultscount()
	{
		adultscount.click();
	}
	
	public void clickchildcount()
	{
		childcount.click();
	}
	
	public void clickapplybtn()
	{
		applybtn.click();
	}

	public void clickSearch() {
		search.click();
	}

	public void ClosePop2() {
		closepop2.click();
	}

	public void clickBookNow() {
		booknow.click();
	}

	public void clickCont() {
		clkCont.click();
	}

	public void switchWin() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				break;
			}
		}
	}

	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String scroll_down = "window.scrollBy(0,5000)";
		js.executeScript(scroll_down);
	}

	public void clickAddAdult() {
		addnewad.click();
	}
	
	public void clickAddChild() {
		addnewchild.click();
	}
	
	public void enterfname(String pwd) {
		fname.sendKeys(pwd);
	}
	
	public void enterlname(String pwd) {
		lname.sendKeys(pwd);
	}
	
	
	
	public void enterMob(String pwd) {
		mob.sendKeys(pwd);
	}
	
	public void enterEmail(String pwd) {
		email.sendKeys(pwd);
	}
	
	public void clickGender() {
		gender.click();
	}
	
	public void Cont() {
		conti.click();
	}
	
	public void GetBaseFare() {
		System.out.println("Base fare= "+baseFare.getText());
	}
	
	public void GetSurcharge() {
		System.out.println("Sur Charge= "+surchargeFare.getText());
	}
	
	public void GetFare() {
		System.out.println("Total = "+totalFare.getText());
	}
}
