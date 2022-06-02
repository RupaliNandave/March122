package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Printalldatausingcelltype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\eclipse\\apache poi\\Excel1\\New Microsoft Excel Worksheet.xlsx");
		 Sheet sh= WorkbookFactory.create(file).getSheet("Sheet3");
		  
		 for(int i=0;i<=sh.getLastRowNum();i++) {//row
			 for(int j=0;j<=sh.getRow(j).getLastCellNum()-1;j++) {//column
				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType CT = cellinfo.getCellType();
				if(CT==CellType.STRING) {
					System.out.print(cellinfo.getStringCellValue()+" ");}
					
					else if(CT==CellType.NUMERIC) {
						System.out.print(cellinfo.getNumericCellValue()+" ");}
						  
					else if(CT==CellType.BOOLEAN) {
							System.out.print(cellinfo.getBooleanCellValue()+" ");
						
					}
				}
				
				 System.out.println();
				 
			 }
		 }
	

}
 