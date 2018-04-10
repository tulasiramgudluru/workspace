package Uploading;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;                    // autoit

public class FileUpload_Selenium {
	public static void main(String[]args) throws IOException{
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELINIUM for Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://qtpselenium.com/test/uploadform/contactform.php");
		
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("D:\\god");
		driver.findElement(By.xpath("//input[@id='photo']")).click();
		Process process=new ProcessBuilder(System.getProperty("user.dir")+"src\\Uploading\\temp.exe","","Open").start();
	}
}
