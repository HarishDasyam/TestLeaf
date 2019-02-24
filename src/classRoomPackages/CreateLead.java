package classRoomPackages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLead 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Balaji");
		driver.findElementById("createLeadForm_firstName").sendKeys("HD");
		driver.findElementById("createLeadForm_lastName").sendKeys("Dhoni");
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(ele);
		//Select by text
		sel.selectByVisibleText("Other");
		WebElement eleNew = driver.findElementById("createLeadForm_marketingCampaignId");
		Select selNew = new Select(eleNew);
		//Select by value
		selNew.selectByValue("CATRQ_CARNDRIVER");
		WebElement elehd = driver.findElementById("createLeadForm_industryEnumId");
		Select selhd = new Select(elehd);
		List<WebElement> listOptions = new ArrayList<>();
		//Select options
		listOptions = selhd.getOptions();
		int count=0;
		for(WebElement elehh:listOptions)
		{
			String str = elehh.getText();
			if(str.startsWith("M"))
			{
				System.out.println(str);
				count++;	
			}
			if(str.contains("Media"))
			{
			elehh.click();
			}
		}System.out.println("There are "+count+" names that start with M");
		WebElement eleee = driver.findElementById("createLeadForm_currencyUomId");
		Select selhh = new Select(eleee);
		List<WebElement> ll = new ArrayList<>();
		ll = selhh.getOptions();
		int size = ll.size();
		//Select by index
		selhh.selectByIndex(size-24);
		WebElement eleeee = driver.findElementById("createLeadForm_ownershipEnumId");
		Select selhhh = new Select(eleeee);
		List<WebElement> llll = new ArrayList<>();
		llll = selhhh.getOptions();
		//Select the text
		for(WebElement eleecc : llll)
		{
			System.out.println(eleecc.getText());
		}
		driver.findElementByName("submitButton").click();		driver.close();
	}
}