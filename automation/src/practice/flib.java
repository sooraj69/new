package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	public String readExcel(String excelPath, String sheetname, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
	
		return data;
	}
	
	public void writeExcel(String excelPath, String sheetname, int rowcount, int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		
				Cell cell = row.createCell(cellcount);
				  cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}

	public String readProp(String propPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		
			Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(key);
			return value;
	
	
	}
	public int rowcount(int rowcount,int count,String excelPath,String sheetname) throws EncryptedDocumentException, IOException
	{
			FileInputStream fis = new FileInputStream(excelPath);
					 Workbook wb = WorkbookFactory.create(fis);
					 			Sheet sh = wb.getSheet(sheetname);
					 			int rc = sh.getLastRowNum();
								return rc;
					 			
	}


}
