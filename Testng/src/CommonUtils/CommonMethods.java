package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
                                                                         //Generic methods
public class CommonMethods {
	static WebDriver d=null;
public static WebDriver openbrowser(String Browser){
	WebElement table=null;
	WebDriver d=null;
	/*  if(Browser.equals("Mozilla"))
		  d=new FirefoxDriver();
	  else if(Browser.contains("firefox")){
			  d=new FirefoxDriver();}
		  if(Browser.contains("chrome")){
			  System.setProperty("WebDriver.Chrome.Driver","D:/SELINIUM for Chrome/chromedriver.exe");
			 d=new ChromeDriver();}
			 else if(Browser.equals("googlechrome")){
			 System.setProperty("WebDriver.Chrome.Driver","D:/SELINIUM for Chrome/chromedriver.exe");
			 d=new ChromeDriver();
		  }
		  if(Browser.contains("ie")){
			  System.setProperty("webdriver.ie.driver","D:/SELINIUM FOR ie/IEDriverServer.exe");
		  d=new InternetExplorerDriver();}		  
		  else if(Browser.equals("Internet explorer")){
				  System.setProperty("webdriver.ie.driver","D:/SELINIUM FOR ie/IEDriverServer.exe");
			  d=new InternetExplorerDriver();
			  }return d;*/
	
	  if(Browser.equalsIgnoreCase("mozilla") || Browser.equalsIgnoreCase("firefox") || Browser.equalsIgnoreCase("ff") ){
		    d=new FirefoxDriver();

		  }else if(Browser.equalsIgnoreCase("ie") ||Browser.equalsIgnoreCase("iexplore") || Browser.equalsIgnoreCase("internet explorer") ){
			  System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Resources//IEDriverServer.exe");
		      d=new InternetExplorerDriver();
		      		  
		 }else if(Browser.equalsIgnoreCase("googlechrome") || Browser.equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Resources//chromedriver.exe");
			 d=new ChromeDriver();
		 }	  
			  
		return d; 
 }
/*public static void main(String args[]){
	openbrowser("Mozilla");
}*/


public static void clickElementById(WebDriver d,String id){
	try{
		
		new FluentWait<WebDriver>(d).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		d.findElement(By.id(id)).click();
		
	}catch(Exception e){
		
		System.out.println(e.getMessage());
}}
public static void clickElementByName(WebDriver d,String Name){
	try{
		d.findElement(By.name(Name)).click();
	}catch(Exception e){
		System.out.println(e.getMessage());
}}

public static void clickElementBylinkText(WebDriver d,String linkText){
	try{
		d.findElement(By.linkText(linkText)).click();
	}catch(Exception e){
		System.out.println(e.getMessage());
}}
public static void clickElementByclassName(WebDriver d,String className){
	try{
		d.findElement(By.className(className)).click();
	}catch(Exception e){
		System.out.println(e.getMessage());
}}
public static void clickElementByXpath(WebDriver d,String Xpath){
	try{
		//waitForElementVisibleXpath(d,Xpath);
		d.findElement(By.xpath(Xpath)).click();
	}catch(Exception e){
		System.out.println(e.getMessage());
}
	}
public static void clickElementByPartialText(WebDriver d,String PartialText){
	try{
		d.findElement(By.partialLinkText(PartialText)).click();
	}catch(Exception e){
		System.out.println(e.getMessage());
}}
public static void clickElementBycss(WebDriver d,String css){
	try{
		d.findElement(By.cssSelector(css)).click();
	}catch(Exception e){
		System.out.println(e.getMessage());
}}
public static void TypetextByXpath(WebDriver d,String Xpath,String username){
	try{
		d.findElement(By.xpath(Xpath)).sendKeys(username);
	}catch(Exception e){
		System.out.println(e.getMessage());
    }
}
public static void TypetextById(WebDriver d,String Id,String password){
	try{
		d.findElement(By.id(password)).sendKeys(password);
	}catch(Exception e){
		System.out.println(e.getMessage());
}}
public static void TypetextByclassName(WebDriver d,String className,String firstname){
	try{
		d.findElement(By.className(className)).sendKeys(firstname);
	}catch(Exception e){
		System.out.println(e.getMessage());
    }
}
	public static void TypetextByName(WebDriver d,String Name,String firstname){
		try{
			d.findElement(By.name(Name)).sendKeys(firstname);
		}catch(Exception e){
			System.out.println(e.getMessage());	
		}
	}
	
	public static void TypetextBylinktest(WebDriver d,String link,String firstname){
		try{
			d.findElement(By.linkText(link)).sendKeys(firstname);
		}catch(Exception e){
			System.out.println(e.getMessage());	
		}
	}
	
public static void waitForElementVisibleXpath(WebDriver d,String xpath){
	try{
		new FluentWait<WebDriver>(d).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xpath))));

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
    }
public static void waitForElementVisibleId(WebDriver d,String Id){
	try{
		new FluentWait<WebDriver>(d).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
    }

/*FileInputStream fis = new FileInputStream(“path of excel file”);   reading and writing excel data

Workbook wb = WorkbookFactory.create(fis);

Sheet s = wb.getSheet("sheetName");

String value = s.getRow(rowNum).getCell(cellNum).getStringCellValue(); // read data

s.getRow(rowNum).getCell(cellNum).setCellValue("value to be set"); //write data

FileOutputStream fos = new FileOutputStream(“path of file”);

wb.write(fos); //save file*/

public static boolean isTextPresent(WebDriver d,String xpath,String ExpectedVal){
	String ActualVal=null;
	boolean flag=false;
	try{
		ActualVal=d.findElement(By.xpath(xpath)).getText();
		if(ActualVal.equals(ExpectedVal)){
		 flag=true;
		}
		
	}catch(Exception e){
		
		e.getMessage();
	}
	return flag;
}

public static boolean isEnabled(WebDriver d,String xpath){
	boolean flag=false;
	try{
		//d.findElement(By.xpath(xpath)).isEnabled();
		if(d.findElement(By.xpath(xpath)).isEnabled()){
			flag=true;
		}
	}catch(Exception e){
		e.getMessage();
	}return flag;
	}
/*public static void xlsxFileInput(String FilePath,String DataFile) throws IOException{
	File f=new File(FilePath);
	FileInputStream fis=new FileInputStream(f);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet ws=wb.getSheet(DataFile);
}*/

             public static int getWebTableRowCountByXpath(WebDriver d,String xpath){
                int rc=0;
            	 try{
            		 waitForElementVisibleXpath(d,xpath);
            		 WebElement table=d.findElement(By.xpath(xpath));
            		 rc=table.findElements(By.tagName("tr")).size();
                   	}catch(Exception e){
            		 e.getMessage();
            	 }
            	 
            	 return rc;
             }
             
             
             public static int getWebTableColumnCountByXpath(WebDriver d,String xpath,int row){
                 int cc=0;
             	 try{
            		 waitForElementVisibleXpath(d,xpath);

             		 WebElement table=d.findElement(By.xpath(xpath+"//tr["+row+"]"));
             		 cc=table.findElements(By.tagName("td")).size();
                    	}catch(Exception e){
             		 e.getMessage();
             	 }
             	 
             	 return cc;
              }
             
             public static void clickOnWebTableChildItem(WebDriver d,String xpath,int row,int column,String tagname){
               
             	 try{
            		 waitForElementVisibleXpath(d,xpath);

             		 WebElement element=d.findElement(By.xpath(xpath+"//tr["+row+"]/td["+column+"]//"+tagname));
             		 element.click();
                    	}catch(Exception e){
             		 e.getMessage();
             	 }
             	 
             
              }
             
             public static String getTextFromWebTableChildItem(WebDriver d,String xpath,int row,int column,String tagname){
                 String Text=null;
             	 try{
            		 waitForElementVisibleXpath(d,xpath);
                 System.out.println(By.xpath(xpath+"/tr["+row+"]/td["+column+"]//"+tagname));
             		 WebElement element=d.findElement(By.xpath(xpath+"/tr["+row+"]/td["+column+"]//"+tagname));
             		 Text=element.getText();
                    	}catch(Exception e){
             		 e.getMessage();
             	 }
             	 
               return Text;
              }
           
           
             
}


















