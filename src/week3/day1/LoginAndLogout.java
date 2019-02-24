package week3.day1;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {

	public static void main(String[] args) throws InterruptedException {
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("dsfghfjk");
		driver.findElementById("userRegistrationForm:checkavail").click();
		Thread.sleep(2000);
		String text = driver.findElementById("userRegistrationForm:useravail").getText();
		driver.findElementByXPath("//form[@id='login']//input|");
		System.out.println(text);
		/*//Enter username
	    driver.findElementById("username1").sendKeys("DemoSalesManager");
    //Enter password
    driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
    Thread.sleep(5000);
    //click login
    driver.findElementByClassName("decorativeSubmit").click();
		 */
	}
}