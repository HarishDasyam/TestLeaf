package week3.day1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom1").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU",Keys.TAB);
		WebElement ele = driver.findElementById("chkSelectDateOnly");
		if (ele.isSelected()) {
			ele.click();
		}
		Thread.sleep(3000);
		//Table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		//Number of Rows
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allColumn = allRows.get(i).findElements(By.tagName("td"));
			String text = allColumn.get(1).getText();
			System.out.println(text);
		}		
		/*//Second Row
		WebElement secRow = allRows.get(1);
		//Number of Column in Second Row
		List<WebElement> allColumn = secRow.findElements(By.tagName("td"));
		System.out.println(allColumn.size());
		//Train Name in second row
		String text = allColumn.get(1).getText();
		System.out.println(text);*/
	}
}