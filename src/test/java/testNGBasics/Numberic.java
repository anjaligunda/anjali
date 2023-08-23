package testNGBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numberic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		FileInputStream fis=new FileInputStream("C:\\Users\\gunda\\eclipse-workspace\\For_Automation\\TestNGPrograms\\src\\test\\resources\\Demo.xlsx");
        Workbook w=WorkbookFactory.create(fis);
        Double data1=w.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
        System.out.println(data1);
        
        
	}
}



