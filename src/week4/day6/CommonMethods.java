package week4.day6;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CommonMethods
{
	public void allMethods() throws IOException, InterruptedException
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(38, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Select
		WebElement ele = driver.findElementById("");
		Select sel = new Select(ele);
		sel.selectByVisibleText("HD");
		sel.selectByValue("id");
		sel.selectByIndex(4);
		//get count of options Tag
		List<WebElement> allOptions = new ArrayList<>();
		allOptions = sel.getOptions();
		System.out.println(allOptions.size());
		
		driver.findElementById("").getText();
		driver.findElementByXPath("").getLocation().getX();
		driver.findElementByXPath("").getLocation().getY();
		driver.getTitle();
		driver.getCurrentUrl();
		
		boolean b=ele.isSelected();	
		Set<String> windows =new HashSet<>();
		if(b)
		{			
			System.out.println("True");
		}		
		windows = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<>(windows);
		driver.switchTo().window(allWindows.get(0));
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileUtils.copyFile(file,dest);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		driver.switchTo().alert().getText();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("id");
		driver.switchTo().frame("name");
		WebElement frame = driver.findElementByXPath("//input[@id='name']");
		driver.switchTo().frame(frame);
		driver.switchTo().defaultContent();		//Main Html page-from grandchild to grandfather
		driver.switchTo().parentFrame(); // Used in NestedFrames - from grandchild to parent
		
		//webtable - 4 row 3 column read text -tablename -table1			
		WebElement table = driver.findElementById("table1");
		List<WebElement> row= table.findElements(By.tagName("tr"));
		List<WebElement> column= row.get(3).findElements(By.tagName("td"));
		System.out.println(column.get(2).getText());
		
		driver.manage().timeouts().implicitlyWait(38, TimeUnit.SECONDS);
		Thread.sleep(3883);
		WebDriverWait wait = new WebDriverWait(driver,38);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id"))).click();
		WebElement waitElement = driver.findElementById("id");
		wait.until(ExpectedConditions.elementToBeClickable(waitElement));
		waitElement.sendKeys("ONN");
		
		driver.findElementById("id").sendKeys("ONN");
		driver.findElementById("id").click();
		driver.findElementByXPath("").clear();
		driver.findElementByClassName("").getAttribute("");
		driver.findElementByCssSelector("").getCssValue("");
		driver.findElementByLinkText("").getText();
		driver.findElementByPartialLinkText("").getLocation().getX();
		driver.findElementByName("").getSize().getHeight();
	}
}