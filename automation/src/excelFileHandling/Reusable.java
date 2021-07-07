package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reusable {

	public String readExcel(String excelpath,String sheetname, int rowcount, int cellcount ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);	
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
	return data;
	}
		//generic reusable method for rowcount
	public int  getRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);//make the excel file ready for read operation
		Sheet sh = wb.getSheet(sheetName);// go to that sheet
		int rc = sh.getLastRowNum();
		return rc;
	}
	
	public void writeExcel(String excelpath,String sheetName,int rowcount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);//make the excel file ready for read operation
		Sheet sh = wb.getSheet(sheetName);// go to that sheet
		Row row = sh.getRow(rowcount);//go to the required  row
		
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
	

	}
	
	
	
	
}		
		