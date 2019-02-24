package classRoomPackages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Youtube
{
	public static void main(String hd[])
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(38, TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/");
	driver.findElementByXPath("//span[text()='Trending']").click();
	driver.findElementById("search").sendKeys("Sri Venkateswara Swamy Suprabatham",Keys.ENTER);
	driver.close();
	}
}