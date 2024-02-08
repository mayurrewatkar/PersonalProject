package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelHandling {
	
	public static void main(String[] args) throws IOException {
		
		String address="\\D:\\PracticeExcel.xlsx\\";
		
		//File open and read
		FileInputStream File=new FileInputStream(address);
		
		//open the workbook
		
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		
		//read the sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//read the row
		
		XSSFRow row=sheet.getRow(0);
		
		//read the cell
		XSSFCell cell=row.getCell(0);
		
		//read the cell value
		
		String exceldata=cell.getStringCellValue();
		
		System.out.println(exceldata);
	}

}
