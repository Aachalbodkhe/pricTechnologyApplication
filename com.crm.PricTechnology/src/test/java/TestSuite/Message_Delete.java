package TestSuite;

import org.testng.annotations.Test;

import BaseClass.Base_Class;
import BaseClass.RandomNumber;
import POM.Pric;

public class Message_Delete extends Base_Class{

	@Test
	public void delete_mesg() throws InterruptedException
	{
		 
     	 Pric p = new Pric(driver);
	
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("1234");
		p.submit.click();
		p.delete_icon.click();
		Thread.sleep(6000);
		driver.navigate().refresh();
		p.Home.click();
}

}
