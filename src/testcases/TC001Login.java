package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week4.day2.SeMethods;

public class TC001Login extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		verifyTitle("hello");
		WebElement elelink =locateElement("partiallinktext","CRM");
		elelink.click();
		WebElement elelead = locateElement("linktext","Create Lead");
		elelead.click();
		
		
	}
	
}