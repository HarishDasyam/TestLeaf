package testcases;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import week4.day2.SeMethods;

public class TC_Zoom_S001 extends SeMethods
{
	@Test
	public void callURL()
	{
		startApp("chrome","https://www.zoomcar.com/chennai/");
		WebElement ele = locateElement("class","search");
		click(ele);
		WebElement dest = locateElement("xpath","//div[@class='component-popular-locations']/div[2]");
		click(dest);
		WebElement next = locateElement("xpath","//button[@class=\"proceed\"]");
		click(next);
		int date = datePicker();
		WebElement datePicker = locateElement("xpath","//div[contains(text(),'"+date+"')]");
		click(datePicker);
		click(next);
		verifyExactText(datePicker,"15");
		//System.out.println(date);//button[@class='proceed']
		WebElement button = locateElement("xpath","//button[@class='proceed']");
		click(button);
		//WebElement listOfCars = locateElement("xpath","/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]");	
	}
}