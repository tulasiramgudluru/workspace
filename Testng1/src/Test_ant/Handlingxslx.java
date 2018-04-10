package Test_ant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Handlingxslx {
	@Test
	public static void reading_xslx() throws IOException{
	//public static void main(String[]args) throws IOException{
		File f=new File("D:\\Sample.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xwb=new XSSFWorkbook(fis);
		XSSFSheet xws=xwb.getSheet("Test");
		int trows=xws.getLastRowNum();
		System.out.println(trows);
		for(int trownum=1;trownum<=trows;trownum++){
			int tcols=xws.getRow(trownum).getLastCellNum();
			//System.out.println(tcols);
			for(int tcolnum=0;tcolnum<tcols;tcolnum++){
			String tcoldata=xws.getRow(trownum).getCell(tcolnum).getStringCellValue();
			System.out.println(tcoldata);
			if(tcoldata.equals("")){
				Row row=xws.getRow(trownum);
				Cell cell=row.createCell(tcolnum);
				cell.setCellType(cell.CELL_TYPE_STRING);
				cell.setCellValue("Selenium");
				FileOutputStream fos=new FileOutputStream("D:\\Sample.xlsx");
				xwb.write(fos);
				fos.close();}
				/*else {Row row=xws.getRow(trownum);
				Cell cell=row.createCell(tcolnum);
				cell.setCellType(cell.CELL_TYPE_STRING);
				cell.setCellValue("Webdriver");
				FileOutputStream fos=new FileOutputStream("D:\\Sample.xlsx");
				xwb.write(fos);
				fos.close();}
				}*/
				}
			/*Row row=xws.getRow(trownum);
		Cell cell=row.createCell(2);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("Webdriver");
		FileOutputStream fos=new FileOutputStream("D:\\Sample.xlsx");
		xwb.write(fos);
		fos.close();*/
	}

}}