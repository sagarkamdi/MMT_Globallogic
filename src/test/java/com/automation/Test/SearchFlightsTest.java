package com.automation.Test;


import org.testng.annotations.Test;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.SearchFlightsPage;

public class SearchFlightsTest extends BaseTest {
	@Test

	public void VerifySearchFlights() throws InterruptedException {
		DriverUtils.getDriver().get("https://www.makemytrip.com/");
		
		SearchFlightsPage sf = new SearchFlightsPage();
		Thread.sleep(3000);
		sf.ClosePop();
		sf.clickRtrip();
		sf.clickAddtraveller();
		sf.clickadultscount();
		sf.clickchildcount();
		sf.clickapplybtn();
		Thread.sleep(3000);
		sf.clickSearch();
		System.out.println("clickSearch()");
		sf.ClosePop2();
		Thread.sleep(4000);
		sf.clickBookNow();
		System.out.println("clickBookNow");
		
		sf.clickCont();
		sf.switchWin();
		sf.Scroll();
		System.out.println("scroll");
		
		sf.clickAddAdult();
		
		sf.enterfname("Sagar");
		sf.enterlname("Kamdi");
		sf.clickAddChild();
		sf.enterfname("Sagar");
		sf.enterlname("Geeky");
		sf.enterMob("8208292270");
		sf.enterEmail("sagar.kamdi27@gmail.com");
		//sf.clickGender();
		Thread.sleep(3000);
		sf.GetBaseFare();
		sf.GetSurcharge();
		sf.GetFare();
		Thread.sleep(3000);
		sf.Cont();
		
		

	}
}
