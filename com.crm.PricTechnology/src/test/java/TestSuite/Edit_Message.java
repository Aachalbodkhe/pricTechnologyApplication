package TestSuite;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import POM.Pric;
@Listeners(com.crm.Listeners.Edit_LockedMsg.class)
public class Edit_Message  extends Base_Class{

	@Test
	public void edit_mesg() throws InterruptedException, IOException
	{
		 
     	 Pric p = new Pric(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		p.amount.sendKeys("1234");
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
        p.edit.click();
       p.visible_Mesg.clear();
       p.visible_Mesg.sendKeys("hioejns");
       p.submit.click();
       
       p.Home.click();
}

}
