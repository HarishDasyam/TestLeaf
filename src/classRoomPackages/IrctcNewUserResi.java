package classRoomPackages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class IrctcNewUserResi
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("DemoSalesManager");
		driver.findElementById("userRegistrationForm:password").sendKeys("crmsfa");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("crmsfa");
		WebElement eleSec= 	driver.findElementById("userRegistrationForm:securityQ");
		Select seleDd = new Select(eleSec);
		seleDd.selectByIndex(2);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Dedeepya");
		WebElement elelne= 	driver.findElementById("userRegistrationForm:prelan");
		Select seleln = new Select(elelne);
		seleln.selectByValue("en");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("HD");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Balaji");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("HD");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement ele = driver.findElementById("userRegistrationForm:dobDay");
		Select sel = new Select(ele);
		//Select by text
		sel.selectByIndex(2);
		WebElement eleNew = driver.findElementById("userRegistrationForm:dobMonth");
		Select selNew = new Select(eleNew);
		//Select by value
		selNew.selectByVisibleText("APR");
		WebElement elehd = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select selhd = new Select(elehd);
		selhd.selectByValue("1990");
		WebElement eleee = driver.findElementById("userRegistrationForm:occupation");
		Select selhh = new Select(eleee);
		selhh.selectByIndex(3);
		driver.findElementById("userRegistrationForm:uidno").sendKeys("DemoSalesManager");
		driver.findElementById("userRegistrationForm:idno").sendKeys("crmsfa");
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("DemoSalesManager@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9966776677");
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select selectNationality = new Select(nationality);
		selectNationality.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("HD");
		driver.findElementById("userRegistrationForm:street").sendKeys("HD");
		driver.findElementById("userRegistrationForm:area").sendKeys("HD");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("535004",Keys.TAB);
		Thread.sleep(44);
		if(driver.findElementById("userRegistrationForm:statesName").isEnabled())
		{
		System.out.println("State is captured");
		}
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select citySelect = new Select(city);
		citySelect.selectByIndex(1);
		Thread.sleep(40);
		WebElement po = driver.findElementById("userRegistrationForm:postofficeName");
		Select poSelect = new Select(po);
		poSelect.selectByIndex(2);
		driver.findElementById("userRegistrationForm:landline").sendKeys("446677");
		WebElement copy = driver.findElementById("userRegistrationForm:resAndOff:0");
		if(copy.isSelected())
		{
			driver.findElementById("userRegistrationForm:resAndOff:1").click();
		}driver.close();
	}
}