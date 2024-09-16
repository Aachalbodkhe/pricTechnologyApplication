package TestSuite;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import BaseClass.Base_Class;
import BaseClass.RandomNumber;
import POM.Pric;

public class Error_Handling extends Base_Class {

	@Test
	public void edit_mesg() throws InterruptedException
	{

     	 Pric p = new Pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		
		Thread.sleep(4000);
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"It is verify");
		p.Home.click();

}
}
