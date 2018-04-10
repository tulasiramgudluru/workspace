import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeClass
	void launchApplication(){
		
		System.out.println("application launched");
	}
	
	@AfterClass
	void quitApplication(){
		
		System.out.println("quit application ");
	}
	
	@BeforeMethod
	void login(){
		
		System.out.println("login into application");
	}
	
	@AfterMethod
	void logout(){
		
		System.out.println("logout from application");
	}
	
	@Test(enabled=true)
	void addFriend(){
		
		System.out.println("added friend");
	}
	
	@Test(enabled=false)
	void sendRequest(){
		
		System.out.println("request send");
	}
	
	@Test
	void sendRequest1(){
		
		System.out.println("request 1 send");
	}

}
