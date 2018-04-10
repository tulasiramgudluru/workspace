import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Aserting {
	WebDriver driver;
	WebElement chk1,chk2;
	 @BeforeClass
	 public void load_url(){
		 //driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:/SELINIUM for Chrome/chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://only-testing-blog.blogspot.in/2014/02/attributes.html");
		 chk1 = driver.findElement(By.xpath("//input[@name='option1']"));
		 chk2 = driver.findElement(By.xpath("//input[@name='option2']"));
		 //driver.findElement(By.xpath("//input[@name='option1']")).click();
		 driver.findElement(By.xpath("//input[@name='option2']")).click();
		 }
	 //Assertion Method - will pass
	 @Test public void asserttrue1() {
		 //System.out.println(chk1);
		 System.out.print("\n"+chk1.isSelected());
		 Assert.assertTrue(chk1.isSelected());
		 System.out.print("\n asserttrue1 - > Executed - means assertion is pass");
		 }
	 //Assertion Method - will fail
	 @Test public void asserttrue2() {
		 System.out.print("\n"+chk2.isSelected());
		 Assert.assertTrue(chk2.isSelected());
		 System.out.print("\n asserttrue2 - > Executed - means assertion is pass");
		 }
	 //- See more at: http://software-testing-tutorials-automation.blogspot.in/2014/03/selenium-webdriver-asserttrue-assertion.html#sthash.XDnppLI7.dpuf

}
