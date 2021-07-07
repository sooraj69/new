package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class N3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
			 FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sh = wb.getSheet("valid");
			 Row row = sh.getRow(0);
			 Cell cell = row.getCell(1);
			 String data = cell.getStringCellValue();
	System.out.println(data);
	}

}
