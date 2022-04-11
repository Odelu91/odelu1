package ABC_Demo003;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Action_MouseHover {
	
	 static WebDriver driver;
	 
	 
  @Test
  public void Mouse_Hover() throws Exception {
	  
	  driver = TestBrowser.OpenChromeBrowser();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  //create webelement object refference step;

	  WebElement Admin=findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement User_Management=findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		WebElement Users=findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));

		 Actions actions = new Actions(driver); //import Actions class//
		
		 actions.moveToElement(Admin).
		 moveToElement(User_Management).
		 moveToElement(Users).click().build().perform();
		 
		 
		 //2nd example;
		 //WebElement Time=findElement(By.xpath("//*[@id='menu_time_viewTimeModule']"));
			//WebElement attendance=findElement(By.xpath("//*[@id='menu_attendance_Attendance']"));
			//WebElement MyRecords=findElement(By.xpath("//*[@id='menu_attendance_viewAttendanceRecord']"));
			
			//Actions actions = new Actions(driver);

			
			// actions.moveToElement(Time).
			// moveToElement(attendance).
			// moveToElement(MyRecords).click().build().perform();
				
		 
		 
			
		}
	   
	  
  



public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
		 
			}
			return elem;
}
}
