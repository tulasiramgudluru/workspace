import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DropBox {
	static WebDriver driver=null;

	@Test
	public static void main(String[]args) throws InterruptedException{
		driver=new FirefoxDriver();
		Thread.sleep(1000);
		//driver.navigate().to("http://gmail.com");
		driver.navigate().to("http://jqueryui.com/droppable/");
		}
	}
