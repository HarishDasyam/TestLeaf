package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import WEandSE.SeMethods;

public class TestCase002 extends SeMethods
{
	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}
}