package week4.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(300);
		
		WebElement ele = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		ele.click();

		WebElement ele1 = driver.findElement(By.className("LM6RPg"));
		ele1.sendKeys("iPhone X");
		WebElement ele2 = driver.findElement(By.className("vh79eN"));
        ele2.click();
        //Set<String> ele3 = driver.findElement(By.xpath("//a[@class='_2cLu-l']")); 
        WebElement ele3 = driver.findElement(By.xpath("//a[@class='_2cLu-l']"));
		ele3.click();
      //a[@class='_2cLu-l']	
	}
}