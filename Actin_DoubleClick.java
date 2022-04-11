package ABC_Demo003;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Actin_DoubleClick {
	
	static WebDriver driver;
	
  @Test
  public void Double_Click() throws Exception {
	  
	  driver=TestBrowser.OpenChromeBrowser();
	  driver.get("http://testautomationpractice.blogspot.com/");
	  
	  WebElement Copy_Text_Button=findElement(By.xpath("//*[@id='HTML10']/div[1]/button"));
		
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(Copy_Text_Button).perform();

		
			
		}
		
		
		
		 public  WebElement findElement(By by) throws Exception 
			{
		
				WebElement elem = driver.findElement(by);  
				
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
				}
				return elem;
	  
	  
  }
}
