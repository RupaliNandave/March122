package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example7_Print1cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\eclipse\\apache poi\\Excel1\\New Microsoft Excel Worksheet1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		 
		 for(int i=0;i<=sh.getLastRowNum();i++) {
			 String data = sh.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(data);//rupali rupali rupali
		 }
	}

}
