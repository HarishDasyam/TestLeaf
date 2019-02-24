package classRoomPackages;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Erail
{
	public static void main(String hd[])
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(44, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Chennai Central",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Vizianagram",Keys.TAB);
		WebElement checkBox = driver.findElementById("chkSelectDateOnly");
		if(checkBox.isSelected())
		{
			checkBox.click();
		}
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		List<WebElement> columns = table.findElements(By.tagName("td"));
		System.out.println(columns.get(6).getText());
		WebElement individual6Row = rows.get(6);
		List<WebElement> individualColumn = individual6Row.findElements(By.tagName("td"));
		System.out.println(individualColumn.get(1).getText());
		List<String> str = new ArrayList<>();
		for(int i =0;i<rows.size();i++)
		{
			WebElement individualRow = rows.get(i);
			columns = individualRow.findElements(By.tagName("td"));
			str.add(columns.get(1).getText());
		}
		List<String> newStr = new ArrayList<>();
		newStr.addAll(str);
		for(int i=0;i<newStr.size();i++)
		{
		System.out.println(newStr.get(i));
		}
		driver.findElementByLinkText("Train Name").click();
		List<String> sortstr = new ArrayList<>();
		WebElement tableEle = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> newRow = tableEle.findElements(By.tagName("tr"));
		for(int i=0;i<newRow.size();i++)
		{
		WebElement individualRowHD = newRow.get(i);
		List<WebElement> columnsHD = individualRowHD.findElements(By.tagName("td"));
		sortstr.add(columnsHD.get(1).getText());
		}
		for(int i=0;i<sortstr.size();i++)
		{
		System.out.println(sortstr.get(i));
		}
		if(newStr.containsAll(sortstr))
		{
			System.out.println("Same Detailsh");
		}
		List<String> cc=new ArrayList<>();
		int size =sortstr.size();
		for(int i=(size-1);i>=0;i--)
		{
		cc.add(sortstr.get(i));
		}
		for(int i=0;i<cc.size();i++)
		{
		System.out.println(cc.get(i));
		}
		driver.close();
	}
}