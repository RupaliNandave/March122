package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getCellSiize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\eclipse\\apache poi\\Excel1\\New Microsoft Excel Worksheet.xlsx");
		short cellSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(cellSize);
	}
	

}
