package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("invalid");
		
		Reusable rs = new Reusable();
		int rc = rs.getRowCount("./data/Testdata.xlsx","invalid" );
		
		for(int i=0;i<=rc;i++)
		{
			Row row = sh.getRow(i);
			for(int j=0;j<=1;j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
			
		}
		
	}

}
