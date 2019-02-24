package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningPopup 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
driver.switchTo().frame("iframeResult");
WebElement ele = driver.findElementByXPath("//button[text()='Try it']");
ele.click();
Alert alert = driver.switchTo().alert();
alert.sendKeys("HarishYash");
Thread.sleep(38);
alert.accept();
WebElement ele12 = driver.findElementById("demo");
String str = ele12.getText();
if(str.contains("HarishYash"))
{
System.out.println("Success");
}
else
{
System.out.println("Failure");
}
}
}