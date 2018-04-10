import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POIExcel {
static WebDriver d=null;
	public static void login(String username,String password) throws InterruptedException{
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		d.findElement(By.xpath("//td/input[@type='password']")).sendKeys(password);
		d.findElement(By.xpath("//label[@id='loginbutton']")).click();
		//d.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(1000);
		try
		{
			if(d.findElement(By.xpath("//div[contains(text(),'address or phone number')]")).isDisplayed()){
				d.navigate().back();
			}
			else if(d.findElement(By.xpath("//a[text()='Home']")).isDisplayed()){
				d.findElement(By.xpath("//div[text()='Account Settings']")).click();
				Thread.sleep(2000);
				d.findElement(By.xpath("//span[text()='Log Out']")).click();
			}
			
		}catch(Exception e){
			e.printStackTrace();
			try{
			if(d.findElement(By.xpath("//a[text()='Home']")).isDisplayed()){
				d.findElement(By.xpath("//div[text()='Account Settings']")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("//li[contains(@data-gt,'menu_logout')]")).click();
			}
			}catch(Exception e1){
				
				d.navigate().back();
				}
			}
			
			
		
		//d.findElement(By.xpath("//td/input[@type='password']")).clear();
		//d.navigate().back();
	}
	public static void main(String[] args) throws IOException, InterruptedException  {
		File f=new File("D:\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Logindata");
	    int trows=ws.getLastRowNum();
		System.out.println(trows);
		
		
			
			
		//WebDriver d;
		d=new FirefoxDriver();
		d.navigate().to("http:facebook.com");
		d.manage().window().maximize();
		for(int i=1;i<=trows;i++){
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			String password=ws.getRow(i).getCell(1).getStringCellValue();
			login(username,password);
				int tcol=ws.getRow(i).getLastCellNum();
				System.out.println(tcol);
				for(int j=0;j<tcol;j++){
					//String username=ws.getRow(i).getCell(j).getStringCellValue();
				    //String password=ws.getRow(i).getCell(j).getStringCellValue();
					//login(username,password);
					}
				
					//XSSFCell c=ws.getRow(i).getCell(j);
			 
			/*String username=ws.getRow(i).getCell(0).getStringCellValue();
			String password=ws.getRow(i).getCell(1).getStringCellValue();*/
		//login(username,password);}
		
		
		
		/*d.findElement(By.xpath("//input[@id='email']")).sendKeys("ws.getRow(i).getCell(0).getStringCellValue()");
		d.findElement(By.xpath("//td/input[@type='password']")).sendKeys("ws.getRow(i).getCell(1).getStringCellValue()");
		d.navigate().back();*/
				
				
				/*File f=new File("D:\\Testdata.xlsx");
				FileInputStream fis = new FileInputStream(f);
				XSSFWorkbook wb=new XSSFWorkbook(fis); //.xlsx format*/
				
				//HSSFWorkbook wb=new HSSFWorkbook(fis); //.xls format
				
				/*XSSFSheet ws=wb.getSheet("Sheet1");
				
				int trows=ws.getLastRowNum();
				
				System.out.println(trows);
				
				for(int i=1;i<=trows;i++){
					
					//XSSFCell c=ws.getRow(i).getCell(0);
					
					System.out.println("Username is "+ws.getRow(i).getCell(0).getStringCellValue());
					
		     // XSSFCell c1=ws.getRow(i).getCell(1);
					
					System.out.println("Password is "+ws.getRow(i).getCell(1).getStringCellValue());
					
					//int tcol=ws.getRow(i).getLastCellNum();
					
					//System.out.println(tcol);
					
					/*for(int j=0;j<tcol;j++){
						
						XSSFCell c=ws.getRow(i).getCell(j);
						
						System.out.println(c.getStringCellValue());
					}*/
				}
}	}
			

	


