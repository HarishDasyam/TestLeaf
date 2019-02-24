package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week4.day2.SeMethods;

public class FacebookTC extends SeMethods {
@Test
	public void login() throws InterruptedException
	{
		startApp("chrome","https://www.facebook.com/");
		WebElement ele = locateElement("id","email");
		type(ele,"gopisetty.yasaswini@gmail.com");
		
		WebElement ele1 = locateElement("id","pass");
		type(ele1,"Q$61e5514");
		
		WebElement ele2 = locateElement("id","loginbutton");
		click(ele2);
	
		//dismissAlert();
		
		WebElement ele3 = locateElement("name","q");
		type(ele3,"TestLeaf");
		
		////button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']
		
		WebElement ele4 = locateElement("xpath","//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']");
		click(ele4);
		
		////button[@class='_42ft _4jy0 PageLikeButton _4jy3 _517h _51sy']
		Thread.sleep(4000);
		WebElement ele5 = locateElement("xpath","//button[@class='_42ft _4jy0 PageLikeButton _4jy3 _517h _51sy']");
				
		if(ele5.isSelected())
		{
			WebElement ele6 = locateElement("xpath","//div[@class='_52eh _5bcu']");
			click(ele6);
			WebElement ele7 = locateElement("xpath","//span[@class='_2yav']");
			click(ele7);
			
			//_672g _1f47
			
			WebElement ele8 = locateElement("xpath","//span[@class='_672g _1f47']");
			System.out.println(ele8.getText());
		}
		else
		{
			click(ele5);
	
		}
		////span[@class='_2yav']
		
		
		
		
		
	}
}
