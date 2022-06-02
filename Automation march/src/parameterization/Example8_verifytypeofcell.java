package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_verifytypeofcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\eclipse\\apache poi\\Excel1\\New Microsoft Excel Worksheet1.xlsx");
		 CellType CELLtype= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
		 System.out.println(CELLtype);//string,boolean,numeric
		 
		 


	}

}
