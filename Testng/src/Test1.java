import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeClass
	void beforeClass(){
		
		
		System.out.println("before class");
	}
	
	@AfterClass
	void afterClass(){
		System.out.println("after class");
	}
	
	@BeforeMethod
	void beforeMethod(){
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	void afterMethod(){
		
		System.out.println("After Method");
	}
	
	@Test
	void Method1(){
		
		System.out.println("show Method1");
	}
	@Test
   void Method2(){
		
		System.out.println("Method2");
	}
	@Test()
    void Method3(){
	
	System.out.println("Method3");
   }
	@Test()
   void Method4(){
	
	System.out.println("Method4");
  }
	@Test()
  void Method5(){
	
	System.out.println("Method5");
  }

}
