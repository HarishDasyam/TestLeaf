package testcases;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import week4.day2.SeMethods;
public class TestCaseZoomCar extends SeMethods
{
	@Test 
	void method()
	{
	startApp("chrome","https://www.zoomcar.com/chennai/");
	locateElement("xpath","//a[@class=\"search\"]").click();
	locateElement("xpath","//div[4][@class=\"items\"]").click();
	locateElement("xpath","//button[@class=\"proceed\"]").click();
	WebElement dp = locateElement("xpath","//div[contains(text(),\"Mon\")]");
	moveTo(dp);
	dp.click();
	locateElement("xpath","//button[@class=\"proceed\"]").click();
	locateElement("xpath","//button[@class=\"proceed\"]").click();
	locateElement("xpath","//div[@class=\"sort-bar car-sort-layout\"]/div[1]").click();
	
	WebElement price = locateElement("xpath","//div[1][@class=\"price\"]");
	String str= price.getText();
	char[] ch =str.toCharArray();
	System.out.print("Amount is: ");
	
	for(int i=0;i<ch.length;i++)
	{
	if(i>=2)
	{
	System.out.print(ch[i]);	
	}
	}
	System.out.println("");
	
	WebElement brand = locateElement("xpath","//div[@class=\"details\"]/h3");
	System.out.println("Brand is: "+brand.getText());
}
}