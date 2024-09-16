package TestSuite;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import POM.Pric;

@Listeners(com.crm.Listeners.LockedMessage.class)
public class CreateLocked_Msg extends Base_Class {

	@Test
	public void create_mesg() throws InterruptedException, IOException
	{
 
     	 Pric p = new Pric(driver);
		 
		Thread.sleep(8000);                  
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		p.amount.sendKeys("1234");
		p.visible_Mesg.sendKeys("Achal");
 	    p.preminumContent.sendKeys("1215");
		p.submit.click();
		
		p.Home.click();
 
		
		

		
	}

}
