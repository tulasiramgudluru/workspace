package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	@Test
	public static void test() throws InterruptedException{
		 WebDriver d;
		d=new FirefoxDriver();
		 d.navigate().to("http:Gmail.com");
		 d.manage().window().maximize();
		 Thread.sleep(1000);
		 //d.findElement(By.xpath("//input[@id='Email']")).sendKeys("tulasigudluru@gmail.com");
		 d.findElement(By.xpath("//a[normalize-space(text())='Need help?']")).click();
 
}}
