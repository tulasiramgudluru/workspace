package Test_ant;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {
	
	   public void onTestFailure(ITestResult tr)
	   {
		System.out.println("fail");
	    }
	   public void onTestSkipped(ITestResult tr)
	   {
			System.out.println("skip");
		}
	   public void onTestSuccess(ITestResult tr)
	   {
				System.out.println("success");  
		}

}
