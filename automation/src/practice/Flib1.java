package practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import WorkbookFactory.create;

public class Flib1 {


	public String readExcel(String excelpath, String sheet,int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;

	}

	public void writeExcel(String excelpath,String sheet,int rowcount, int cellcount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1 = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis1);	
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
	}
	public int getRow(String excelpath,String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();
			return rc;
	}

}





