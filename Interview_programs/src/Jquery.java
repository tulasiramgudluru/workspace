import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Jquery {
	WebDriver driver=null;
@Test
public void jQueryCalendarExample() {
	
	driver.navigate().to("http:\\jQueryURL");
	//WebElement frameElement=driver.findElement(frameLocator);
	//driver.switchTo().frame(frameElement);
	WebDriverWait wait=new WebDriverWait(driver,40);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(name)));
	//driver.findElement(tagText).click();
	selectJQueryDate("");
}

public void selectJQueryDate(String date) {
	WebDriverWait wait=new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-datepicker-div")));
	WebElement table = driver.findElement(By.className("ui-datepicker-calendar")); 
	System.out.println("JQuery Calendar Dates");
	
	List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
			for (WebElement row : tableRows) {
		List<WebElement> cells = row.findElements(By.xpath("td"));
		
		for (WebElement cell : cells) {
			if (cell.getText().equals(date)) {
				driver.findElement(By.linkText(date)).click();
			}
		}
	}
}}