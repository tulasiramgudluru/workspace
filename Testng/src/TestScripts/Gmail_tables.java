package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import CommonUtils.CommonMethods;

public class Gmail_tables {
	public static Properties p=null;
	public static WebDriver d=null;
	static int rowcount=0;
	static int columncount=0;
		
	@Test
	public static void extractData1() throws IOException, InterruptedException{
		File f=new File(System.getProperty("user.dir")+"\\Resources\\Prop.properties");
	    FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		//System.out.println(p.getProperty("ApplicationUrl"));
		//System.out.println(p.getProperty("browser"));
		
		d=CommonMethods.openbrowser(p.getProperty("browser"));
		d.get(p.getProperty("ApplicationUrl"));
		d.manage().window().maximize();
		//d=CommonMethods.waitForElementVisibleXpath(d, xpath);
		CommonMethods.waitForElementVisibleId(d,"Email");
		CommonMethods.TypetextByName(d, "Email", p.getProperty("username"));
		//CommonMethods.TypetextByclassName(d, "Email",p.getProperty("username"));
		//CommonMethods.TypetextById(d, "Email", p.getProperty("username"));
		CommonMethods.clickElementById(d, "next");
		CommonMethods.waitForElementVisibleId(d,"Passwd");
		//CommonMethods.TypetextById(d, "Passwd", p.getProperty("password"));
		//CommonMethods.TypetextBylinktest(d, "Password",p.getProperty("password"));
		CommonMethods.TypetextByName(d, "Passwd", p.getProperty("password"));
		CommonMethods.clickElementById(d, "signIn");
		//WebElement table=d.findElement(By.xpath(p.getProperty("TableXpath")));
		
		rowcount=CommonMethods.getWebTableRowCountByXpath(d, p.getProperty("TableXpath"));
		//int trows=table.findElements(By.tagName("tr")).size();
		//rowcount=CommonMethods.webTablesrowsbyXpath("//table[@class='th']/tbody");
		//CommonMethods.webTablesrowsbyXpath("//table[@class='th']/tbody", "tr")
		//CommonMethods.webTablesrowsbyXpath("//table[@class='th']/tbody/tr");
	    
	
		
		//int tcols=table.findElements(By.tagName("td")).size();
	    //System.out.println(trows);
	 for(int i=1;i<=rowcount;i++){
	     //System.out.println(CommonMethods.getWebTableColumnCountByXpath(d, p.getProperty("TableXpath"), i));
		 CommonMethods.clickOnWebTableChildItem(d,p.getProperty("TableXpath"), i,1,"input");
		 System.out.println(CommonMethods.getTextFromWebTableChildItem(d,p.getProperty("TableXpath"), i,3,"span"));
	   
	    	
	 } 
	 File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshot, new File("E:\\screenshot.png"));
	    	//Thread.sleep(500);
	    	//CommonMethods.waitForElementVisibleXpath(d,p.getProperty("CheckBoxXpath"));
	  //  CommonMethods.clickElementByXpath(d,p.getProperty("CheckBoxXpath1")+i+p.getProperty("CheckBoxXpath2"));
	    	//System.out.println(p.getProperty("CheckBoxXpath1")+i+p.getProperty("CheckBoxXpath2"));
	    	//d.findElement(By.xpath("//table[@class='th']/tbody/tr["+i+"]/td[1]/input")).click();
	    	//CommonMethods.waitForElementVisibleXpath(d,p.getProperty("CheckBoxXpath"));
	   // }
	    //CommonMethods.waitForElementVisibleXpath(d,p.getProperty("CheckBoxXpath"));
	}
	@AfterClass
	public static void afterTest(){
		d.quit();
	}
	
}	


	
