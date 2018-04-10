import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Svn {
	
		static WebDriver d;
		public static void main(String[]args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","D:\\SELINIUM for Chrome\\chromedriver.exe");
			d=new ChromeDriver();
			//d=new FirefoxDriver();
			d.navigate().to("http:citibank.com");
			d.manage().window().maximize();
			Thread.sleep(10000);
			d.findElement(By.xpath("//a[contains(@href,'.citicards') AND normalize-space(text())='Learn More']")).click();
			//d.findElement(By.className("btn btn-primary");                  wrong
			//d.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("Citibank.com");
			//d.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		}
}
