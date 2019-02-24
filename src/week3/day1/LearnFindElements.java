package week3.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class LearnFindElements {

	public static void main(String[] args) {
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://www.crystalcruises.com/cruises/calendar?year=2018");
		List<WebElement> allQuotes = driver.findElementsByLinkText("REQUEST A QUOTE");
		int size = allQuotes.size();
		System.out.println("The Number Of Matching q "+size);
		/*WebElement firstOne = allQuotes.get(0);
		firstOne.click();*/
		WebElement lastOne = allQuotes.get(size-1);
		lastOne.click();		
	}
}