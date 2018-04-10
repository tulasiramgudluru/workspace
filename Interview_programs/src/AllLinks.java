import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;                                           //   writing output to doc
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {                                           //   printing data in doc file

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:/SELINIUM for Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://jquery.com");
		System.out.println("Get All Links");
		WebElement box=driver.findElement(By.cssSelector("#main"));
		List<WebElement> getalllinks=box.findElements(By.tagName("a"));
				
		 // String alllinks [] = selenium.getAllLinks();
		System.out.println(getalllinks.size());
		  
		  FileWriter fileWriter2 = new FileWriter("D:\\allLinks.doc");
		  BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
		  bufferedWriter2.write("Get All Links");
		  for(int c=0; c<getalllinks.size(); c++){
		    
		         bufferedWriter2.write(getalllinks.get(c).getText());
		         bufferedWriter2.newLine();
		     System.out.println("\n");
		  } bufferedWriter2.close();

	}

}
