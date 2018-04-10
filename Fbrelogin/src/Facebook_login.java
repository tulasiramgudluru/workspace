import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_login {

	static WebDriver d;
	
	
	
	public static void main(String[] args) {
		//WebDriver d=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\SELINIUM for Chrome\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http:facebook.com");
		//d.manage().window().maximize();

	}

}
