package ABC_Demo003;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Action_Drag_Drop {
	
	static WebDriver driver;
	
  @Test
  public void Drag_Drop() throws Exception {
	  
	  driver = TestBrowser.OpenChromeBrowser();
	  driver.get("http://testautomationpractice.blogspot.com/");
	 
	  
	  WebElement Source_Drag_Button=findElement(By.xpath("//*[@id='draggable']"));
		WebElement Target_Drop_Button=findElement(By.xpath("//*[@id='droppable']"));
		
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(Source_Drag_Button, Target_Drop_Button).perform();

		
			
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
