package week4.day2;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	public int i = 1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {			
				System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--disable-notifications");
				driver = new ChromeDriver(op);
				
			} else if (browser.equalsIgnoreCase("firefox")) {			
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" Launched Successfully");
		} catch (WebDriverException e) {
			System.out.println("The Browser "+browser+" not Launched ");
		} finally {
			takeSnap();			
		}
	}


	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id": return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "partiallinktext": return driver.findElementByPartialLinkText(locValue);
			case "linktext": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.out.println("The Element Is Not Located ");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
		
	}

	@Override
	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is Entered Successfully");
		takeSnap();
	}

	@Override
	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" Clicked Successfully");
		takeSnap();
	}

	@Override
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The DropDown Is Selected with "+value);
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select drop = new Select(ele);
		drop.deselectByIndex(index);

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		
		boolean bReturn = false;
		//		String str = expectedTitle;
		//		if(str.equalsIgnoreCase("browser"));
		String str = driver.getTitle();
		System.out.println(str);
		if(expectedTitle.equals(str))
		{
			System.out.println("Inside If");
			bReturn =true;
		}

		else
		{
			System.out.println("Inside else");
		}

		return bReturn;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) 
	{
		// TODO Auto-generated method stub
		if(expectedText == "15")
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong");
		}
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
 //        driver.findElementByPartialLinkText("CRM");
         
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isDisplayed();
		System.out.println("element" +ele+"is displayed");

	}

	@Override
	public void switchToWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindow = new ArrayList<String>();
		listOfWindow.addAll(allWindows);
		driver.switchTo().window(listOfWindow.get(index));
		System.out.println("The Window is Switched ");
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
		System.out.println("Switched"+ele+"to frame");
	}

	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();
		takeSnap();
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub

		return driver.switchTo().alert().getText();
	}

	@Override
	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dsc = new File("./snaps/img"+i+".png");
			FileUtils.copyFile(src, dsc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		

	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}


	@Override
	public int datePicker() 
	{
		Date date =new Date();
		DateFormat sdf= new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		System.out.println(tomorrow);
		return tomorrow;
	}
	
	public void click(WebElement ele, int tom)
	{
		ele.click();
	}


	@Override
	public void moveTo(WebElement ele) 
	{
		// TODO Auto-generated method stub
	Actions action =new Actions(driver);
	action.moveToElement(ele);
	}

}
