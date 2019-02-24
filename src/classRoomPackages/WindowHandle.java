package classRoomPackages;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandle
{
	public static void main(String hd[])
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(38, TimeUnit.SECONDS);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElementByXPath("//span[text()='AGENT LOGIN']/parent::a").click();
	driver.findElementByPartialLinkText("Contact Us").click();
	Set<String> activeWindows = driver.getWindowHandles();
	List<String> liWindows = new ArrayList<>();
	liWindows.addAll(activeWindows);
	driver.switchTo().window(liWindows.get(1));
	System.out.println(driver.getTitle());
	String str = driver.findElementByPartialLinkText("care@irctc.co.in").getText();
	System.out.println(str);
	driver.switchTo().window(liWindows.get(0));
	driver.close();
	}
}