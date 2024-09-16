package TestSuite;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import POM.Pric;
@Listeners(com.crm.Listeners.Delete_Locked_Message.class)
public class DeleteLocked_Msg extends Base_Class {

	@Test
	public void delete_mesg() throws InterruptedException, IOException
	{
 
     	Pric p = new Pric(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		p.amount.sendKeys("1234");
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("1234");
		p.submit.click();
		p.delete_icon.click();
		Thread.sleep(6000);
		p.delete_button.click();
		driver.navigate().refresh();
		
		p.Home.click();
		
		
}

}
