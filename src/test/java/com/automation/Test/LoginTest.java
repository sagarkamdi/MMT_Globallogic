package com.automation.Test;

import org.testng.annotations.Test;
import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test

	public void VerifysuccessfulLogin() throws InterruptedException {
		DriverUtils.getDriver().get("https://www.makemytrip.com/");
		LoginPage lp = new LoginPage();
		lp.clickSignin();
		lp.enterUsernme("sagar.kamdi27@gmail.com");
		lp.clickCont();
		Thread.sleep(0);
		lp.enterPassword("7709@Sak");
		lp.clickLogin();

	}
}
