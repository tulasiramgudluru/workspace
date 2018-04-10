import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebooksignup {
	static WebDriver d;
	public static void login(String firstname,String lastname,String email,String reemail,String newpassword) throws InterruptedException{
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
		d.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(reemail);
		d.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(newpassword);
		//d.findElement(By.xpath("//select[@id='day']")).sendKeys(day);
		//d.findElement(By.xpath("//select[@id='month']")).sendKeys(month);
		//d.findElement(By.xpath("//select[@id='year']")).sendKeys(year);
		//Thread.sleep(5000);
		d.findElement(By.xpath("//button[contains(text(),'Create an account')]")).click();
		Thread.sleep(5000);
		
		/*try{
			if(d.findElement(By.xpath("//div[contains(text(),'address or mobile number') and @id='js_a']")).isDisplayed())
				{break;
				//d.navigate().back();
			}}
			catch(Exception e){
			
				e.printStackTrace();
			}*/
			}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("D:\\Testdata1.xlsx");
		FileInputStream  fis = new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheet("fb");
		int trows=ws.getLastRowNum();
		System.out.println(trows);
		for(int i=0;i<=trows;i++)
		System.out.println(ws.getRow(i).getCell(0).getStringCellValue());
		//WebDriver d;
		d=new FirefoxDriver();
		d.navigate().to("http:facebook.com");
		d.manage().window().maximize();
		for(int i=1;i<=trows;i++){
			String firstname=ws.getRow(i).getCell(0).getStringCellValue();
			String lastname=ws.getRow(i).getCell(1).getStringCellValue();
			String email=ws.getRow(i).getCell(2).getStringCellValue();
			String reemail=ws.getRow(i).getCell(3).getStringCellValue();
			String newpassword=ws.getRow(i).getCell(4).getStringCellValue();
			login(firstname,lastname,email,reemail,newpassword);
			try{
				if(d.findElement(By.xpath("//div[contains(text(),'address or mobile number') and @id='js_a']")).isDisplayed())
					break;
					//d.navigate().back();
				}
				catch(Exception e){
				
					//e.printStackTrace();
				}
			//String day=ws.getRow(i).getCell(5).getStringCellValue();
			//String month=ws.getRow(i).getCell(6).getStringCellValue();
			//String year=ws.getRow(i).getCell(7).getStringCellValue();
			
			
		}
		}
		}


