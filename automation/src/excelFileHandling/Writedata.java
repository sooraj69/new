package excelFileHandling;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");// location where the file is stored
		Workbook wb = WorkbookFactory.create(fis);//create method is used to make the file ready for the write operation
		Sheet sh = wb.getSheet("valid");//the sheet in which you want to write the data
		Row row = sh.createRow(1);//the row in which i want to write data
		
		Cell cell = row.createCell(1);//make the cell empty for write operation
		cell.setCellValue("manager");//set the data that you want to write
		
	
		FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		wb.write(fos);// actual write operation wil be performed
		wb.close();// we close it bcxz excel file is a heavy resource
		
		
		
	}

}