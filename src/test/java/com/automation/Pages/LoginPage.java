package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//li[@data-cy='account']")
	private WebElement loginbtn;
	
	@FindBy(id ="username")
	private WebElement inputemail;
	
	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement contbtn;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement inputTextPassword;

	@FindBy(xpath = "//button[@data-cy='login']")
	private WebElement btnLogin;

	
	// utilization
	public void clickSignin() {
		loginbtn.click();
	}
	
	public void enterUsernme(String username) {
		inputemail.sendKeys(username);
	}

	
	public void clickCont() {
		contbtn.click();
	}
	
	public void enterPassword(String pwd) {
		inputTextPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

}
