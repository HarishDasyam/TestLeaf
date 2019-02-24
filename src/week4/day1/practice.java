package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        WebElement ele = driver.findElement(By.xpath("//button[text()='Try it']"));
        ele.click();
        //driver.
        
	}

}
