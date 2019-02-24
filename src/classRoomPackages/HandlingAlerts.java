package classRoomPackages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlerts
{
public static void main(String hd[])
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	Alert alert = driver.switchTo().alert();
	String str = "HD";
	alert.sendKeys(str);
	alert.accept();
	String name = driver.findElementById("demo").getText();
	if(name.contains(str))
	{
		System.out.println(str+" is present");
	}
}
}