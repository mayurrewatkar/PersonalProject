
package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling1 {
	
	public static void main(String[] args) throws IOException {
		
       String address="\\D:\\PracticeExcel.xlsx\\";
		
		//File open and read
		FileInputStream File=new FileInputStream(address);
		
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		
	      XSSFSheet sheet= workbook.getSheet("Sheet1");
	      
	      
	      
	    
	     for(int i=0;i<=2;i++) {
	    	 
	    	 for(int j=0;j<=2;j++) {
	    		 
	    		 XSSFRow row =sheet.getRow(i);
	    	     
	    		  XSSFCell cell  = row.getCell(j);
	    		      
	    		 
	    	String execedata=cell.getStringCellValue();
	    	
	    		 System.out.println(execedata);
	    	 }
	     }
		
		
	}

}
