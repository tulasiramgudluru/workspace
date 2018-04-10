package Test_ant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority=1)
	public void login(){
		System.out.println("Print");
		try{
			Assert.assertEquals("A","A");
		}catch(Throwable t){
			System.out.println("caught the error");
		}
		
		System.out.println("Print e");
	}
   @Test(priority=2)
   public void admin_login(){
	   
   }
}
