package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority=1)
	public void login(){
		System.out.println("Print");
		Assert.assertEquals("A","B");
		System.out.println("Print");
	}
   @Test(priority=2)
   public void admin_login(){
	   
   }
}
