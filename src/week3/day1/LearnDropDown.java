package week3.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Direct Mail");
		dd.selectByValue("LEAD_OTHER");
		dd.selectByIndex(2);
		List<WebElement> allOptions = dd.getOptions();
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}
		System.out.println(allOptions.size());
	}
}
