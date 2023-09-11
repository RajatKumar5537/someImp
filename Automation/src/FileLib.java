import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for data driven testing 
 * @author Rajat
 *
 */
public class FileLib {
	/**
	 * This is generic method for reading the data from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
/**
 * This is a generic method for reading the data from Excel File 
 * @param sheetName
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String sheetName, int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	Workbook w=WorkbookFactory.create(fis);
	String data = w.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * This is generic method t write a data into Excel file 
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void writeExcelData(String shett,int row, int cell ) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	Workbook w=WorkbookFactory.create(fis);
	w.getSheet("CreateCustome").getRow(row).getCell(cell).setCellValue("Hi Good Morning");
	FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
	w.write(fos);
	w.close();
	
	
}
}
