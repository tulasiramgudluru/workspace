package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Login {
	static WebDriver d;
	
	public static void main(String[] args) throws InterruptedException{
		
		d=new FirefoxDriver();
		d.navigate().to("http:facebook.com");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//input[@id='email']")).sendKeys("muralichimmili@gmail.com");
		//d.findElement(By.xpath("//input[@id='pass']")).sendKeys("Omsairam#");
		//d.findElement(By.xpath("//input[@value='Log In']")).click();
		//d.findElement(By.xpath("//a/div[text()='Account Settings']")).click();
		Thread.sleep(2000);
		//d.findElement(By.xpath("//span[text()='Log out']")).click();
		d.quit();
	}

}
