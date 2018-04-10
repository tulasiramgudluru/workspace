import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class ScreenShot {

	   public static void main(String[] args) throws IOException{
	       WebDriver driver = new FirefoxDriver();
	       driver.navigate().to("http://citibank.com");
	       driver.manage().window().maximize();

	       File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(screenshot,new File("D:\\s.png"));
	       driver.quit();
	       
	   }
	}

