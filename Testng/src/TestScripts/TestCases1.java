package TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

import CommonUtils.Reading_Xlsx;

public class TestCases1 {
	//static String tcols1=null;
	static  int trows=0;
	static int tcols=0;
   
	static Logger Log = Logger.getLogger(TestCases1.class.getName());                 //working
	//public static Logger Application_logs=Logger.getLogger("devpinoyLogger");           not working
	@Test
	public static void getExcelData() throws IOException{
		//Logger Application_logs=Logger.getLogger("devpinoyLogger");                          //not working
		DOMConfigurator.configure("Log4j.xml");
		Reading_Xlsx file=new Reading_Xlsx();
		XSSFSheet ws=file.xlsxFileInput(System.getProperty("user.dir")+"\\Resources\\Testdata.xlsx", "Exceldata");
		Log.info("reading xlsx");
		//Application _logs.debug("reading xlsx");                                              //not working
		//int trows=ws.getLastRowNum();
		trows=Reading_Xlsx.readingExcelSheetrowcount(ws);
		Log.info("getting rows");
		System.out.println(trows);
		String tcols1=null;
		for(int i=1;i<=trows;i++){
			//int tcols=ws.getRow(i).getLastCellNum();
			tcols=Reading_Xlsx.readingExcelSheetcolumncount(ws, i);
			Log.info("getting cols");
			System.out.println(tcols);
			 for(int j=0;j<tcols;j++){
				 //tcols1=ws.getRow(i).getCell(j).getStringCellValue();
				 tcols1=(String) Reading_Xlsx.readingExcelSheet(ws, i,j);
				 //if(tcols1.contains("B")){
				 //Log.info("contains");}
				/*try{
				 if(tcols1.equals("D"))
					Log.info("printing");
				 else
					 Log.info("printing failed");
				}catch(Exception e){
					e.getMessage();
					}
					//	break;*/
				Log.info("gettingdata");
				 System.out.print(tcols1);
				System.out.println("\n");
				
			}
			}
		}
		}
	

