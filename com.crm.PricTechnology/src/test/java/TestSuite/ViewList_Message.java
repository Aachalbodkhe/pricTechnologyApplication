package TestSuite;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import BaseClass.RandomNumber;
import POM.Pric;

@Listeners(com.crm.Listeners.View_List.class)
public class ViewList_Message  extends Base_Class{

	@Test
	public void listView() throws InterruptedException, IOException
	{ 
     	Pric p = new Pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no= RandomNumber.random();
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
		p.search_field.sendKeys(s);
		p.search_button.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"It is verify");
		
		p.Home.click();
		
		
	}
}
