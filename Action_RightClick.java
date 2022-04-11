package ABC_Demo003;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Action_RightClick {
	
	static WebDriver driver;
  @Test
  public void Right_Click() throws Exception {
	  
	  driver=TestBrowser.OpenChromeBrowser();
	  
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  
	  //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  
	  
	  
	  WebElement RButton=findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(RButton).perform();
		
		findElement(By.xpath("//span[text()='Quit']")).click();// below steps need explainations
		
	    Alert alert = driver.switchTo().alert();
	    
	    Thread.sleep(1000);
	    
	    alert.accept();
	    //alert.dismiss();
		
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
