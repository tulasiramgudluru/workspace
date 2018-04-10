package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Reading_Xlsx {
	public static XSSFSheet xlsxFileInput(String FilePath,String DataFile) throws IOException{
		File f=new File(FilePath);
		FileInputStream fis=new FileInputStream(f);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet ws=wb.getSheet(DataFile);
	    return ws;
	}
	/*public static void waitForElementVisibleXpath(WebDriver d,String xpath){
		try{
			new FluentWait<WebDriver>(d).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xpath))));

		}catch(Exception e){
			System.out.println(e.getMessage());
		}}*/
	
	public static int readingExcelSheetrowcount(XSSFSheet worksheet){
		int rowcount=0;
		try{
			rowcount=worksheet.getLastRowNum();
		}catch(Exception e){
			e.getMessage();
		}
		return rowcount;
		}
	public static int readingExcelSheetcolumncount(XSSFSheet worksheet,int row){
		int columncount=0;
		try{
			columncount=worksheet.getRow(row).getLastCellNum();
		}catch(Exception e){
			e.getMessage();
		}
		return columncount;
	}
	public static String readingExcelSheet(XSSFSheet ws,int row,int col){
		String sheetdata = null;
		try{
			sheetdata=ws.getRow(row).getCell(col).getStringCellValue();
		}catch(Exception e){
			e.getMessage();
		}
		return sheetdata;	
	}
}







































