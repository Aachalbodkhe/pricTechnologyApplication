package TestSuite;

import org.testng.annotations.Test;

import BaseClass.Base_Class;
import POM.Pric;

public class Message_Create extends Base_Class {

	@Test
	public void create_mesg() throws  InterruptedException
	{
		Pric p = new Pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		Thread.sleep(2000);
		String s=String.valueOf(-567);
		p.amount.sendKeys(s);
		Thread.sleep(2000);
		p.visible_Mesg.sendKeys("Manjiri");
		Thread.sleep(2000);
 	    p.preminumContent.sendKeys("1234");
 	   Thread.sleep(2000);
		p.submit.click();
		p.Home.click();
		
	}

}
