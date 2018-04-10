 import java.io.IOException; 
 import java.util.concurrent.TimeUnit; 
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver; 
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.interactions.Actions;
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;
 public class DoubleClick {
	 WebDriver driver;
	 @BeforeTest 
	 public void setup() throws Exception { 
		 driver =new FirefoxDriver(); 
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html"); }
	 @Test 
	 public void doubleClick_Button() throws IOException, InterruptedException { 
		 WebElement ele = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]")); 
		 //To generate double click action on "Double-Click Me To See Alert" button.
		 Actions action = new Actions(driver);
		 action.doubleClick(ele); 
		 action.perform(); 
		 Thread.sleep(3000); 
		 String alert_message = driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept(); 
		 System.out.println(alert_message); 
		 }
 }
 