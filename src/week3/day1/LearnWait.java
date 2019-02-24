package week3.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
		Thread.sleep(5000);
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("sarath");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
}