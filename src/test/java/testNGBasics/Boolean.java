package testNGBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\gunda\\eclipse-workspace\\For_Automation\\TestNGPrograms\\src\\test\\resources\\Demo.xlsx");
            Workbook w=WorkbookFactory.create(fis);
                      boolean b = w.getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
                       System.out.println(b);
		System.out.println("Hello this anjali from GitHub");
		
	}

}
