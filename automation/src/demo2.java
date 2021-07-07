import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis); //create method is used to make the file ready to operation
		Sheet sh = wb.getSheet("valid");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);			
		String data = cell.getStringCellValue();
		System.out.println(data);
	}

}
