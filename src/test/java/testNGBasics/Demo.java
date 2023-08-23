package testNGBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		FileInputStream fis=new FileInputStream("C:\\Users\\gunda\\eclipse-workspace\\For_Automation\\TestNGPrograms\\src\\test\\resources\\Demo.xlsx");
        Workbook w=WorkbookFactory.create(fis);
        String data=w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(data);
        
	}

}
