package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_getBooleanData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\eclipse\\apache poi\\Excel1\\New Microsoft Excel Worksheet.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
          System.out.println(data);//true
	}

}
