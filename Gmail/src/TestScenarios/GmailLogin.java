package TestScenarios;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class GmailLogin {
	
	/*@Test
	public static void test() throws InterruptedException{
		 WebDriver d;
		d=new FirefoxDriver();
		 d.navigate().to("http:Gmail.com");
		 d.manage().window().maximize();
		 Thread.sleep(1000);
		 //d.findElement(By.xpath("//input[@id='Email']")).sendKeys("tulasigudluru@gmail.com");
		 d.findElement(By.xpath("//a[normalize-space(text())='Need help?']")).click();*/
 
     public static void main(String[] args) throws InterruptedException{
    	 WebDriver d;
	 d=new FirefoxDriver();
	 d.navigate().to("http:Gmail.com");
	 d.manage().window().maximize();
	 Thread.sleep(1000);
	 //d.findElement(By.xpath("//input[@id='Email']")).sendKeys("tulasigudluru@gmail.com");
	 d.findElement(By.xpath("//a[normalize-space(text())='Need help?']")).click();
	 //d.findElement(By.xpath("//input[@id='next']")).click();
	//Thread.sleep(500);
	// d.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("40billionram");
	 //d.findElement(By.xpath("//input[@id='PersistentCookie']")).click();
	// d.findElement(By.xpath("//input[@id='signIn']")).click();
	// Thread.sleep(5000);	 
	// d.findElement(By.xpath("//a[contains(@title,'Google Account:')]")).click();
	// Thread.sleep(2000);
	// d.findElement(By.xpath("//a[text()='Sign out']")).click();
	 //d.quit();*/
 }
 
}
