package Testng_Xml;
 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement; 
 import org.openqa.selenium.firefox.FirefoxDriver; 
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;
 public class Test_One { 
	 WebDriver driver; 
	 WebElement dragElementFrom;
	 @BeforeTest
	 public void setup() throws Exception { 
		 System.out.println("In @BeforeTest Of Test_One.");
		 driver =new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html"); }
	 @Test(priority=1)
	 public void testCaseOne_Test_One() {
		 System.out.println("Executing testCaseOne_Test_One.");
		 driver.findElement(By.xpath("//input[@id='2']")).click();
		 driver.findElement(By.xpath("//input[@id='plus']")).click();
		 driver.findElement(By.xpath("//input[@id='6']")).click(); 
		 driver.findElement(By.xpath("//input[@id='equals']")).click();
		 String Result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		 System.out.println("Result of testCaseOne_Test_One = "+Result); }
	 @Test(priority=2)
	 public void testCaseTwo_Test_One() {
		 System.out.println("Executing testCaseTwo_Test_One."); 
		 driver.findElement(By.xpath("//input[@id='Resultbox']")).clear(); 
		 driver.findElement(By.xpath("//input[@id='3']")).click();
		 driver.findElement(By.xpath("//input[@id='plus']")).click();
		 driver.findElement(By.xpath("//input[@id='7']")).click();
		 driver.findElement(By.xpath("//input[@id='equals']")).click();
		 String Result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		 System.out.println("Result of testCaseTwo_Test_One = "+Result);
		 }
	 }