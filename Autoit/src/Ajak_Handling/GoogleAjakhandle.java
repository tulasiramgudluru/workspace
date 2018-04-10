package Ajak_Handling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAjakhandle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();	
	d.navigate().to("http://google.com");	
	//d.manage().window().maximize();
	d.findElement(By.name("q")).sendKeys("Land Rover price");
	Thread.sleep(5000);
	String xpath1="//div[@id='sbse";                                      
	String xpath2="']/div[2]";                                               
	for(int i=0;i<=3;i++){
		System.out.println(xpath1+i+xpath2);
		String text=d.findElement(By.xpath(xpath1+i+xpath2)).getText();
		System.out.println(text);
	}
	/*Thread.sleep(5000);
	List<WebElement> list=d.findElements(By.xpath("//li[@role='presentation']"));
	
	System.out.println(list.size());
	Iterator<WebElement>i=list.listIterator();
	while(i.hasNext()){
		WebElement e=i.next();
		String s=e.getText();
		if(s.equalsIgnoreCase("land rover price list")){
			System.out.println(s);
			e.click();
				}
		}*/
	WebElement box=d.findElement(By.xpath("//ul[@role='listbox']"));
	List<WebElement> allajaks=box.findElements(By.tagName("li"));
	System.out.println(allajaks.size());
	//System.out.println(allajaks);
	}
}
//div/div/input[@type='text']
//div[@id='sbse0']/div[2]
//div[@id='sbtc']/div[2]/div[2]/div[1]/div[1]/ul[@role='listbox']
//div[@style='text-align: left;']/div[2]/div[2]//ul
//div[@id='sbtc']/div[2]/div[2]/div[1]