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

public class Prac {

	public String readExcel(String excel,String sheet,int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excel);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);	
		String data = cell.getStringCellValue();
		return data;
	}

	public void writeExcel(String excel, String sheet, int rowcount, int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excel);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		  cell.setCellValue(data);
	
		  FileOutputStream fos = new FileOutputStream(excel);
			wb.write(fos);
			wb.close();
				  
				  
	}

	public int getrowCount(String excel, String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excel);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();
			return rc;
	}
	public String readProp(String propath,String key) throws IOException {
		FileInputStream fis = new FileInputStream(propath);
					Properties prop = new Properties();
					prop.load(fis);
				String data = prop.getProperty(key);
				return data;	
					
	}

}

