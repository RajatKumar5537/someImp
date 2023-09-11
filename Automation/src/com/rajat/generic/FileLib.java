package com.rajat.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a class to read the data from generic class
 * @author Rajat
 *
 */
public class FileLib {
/**
 * This is a generic method for read the data from Propertyfile 
 * @param key
 * @return
 * @throws IOException
 */
	public String getPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * This is a generic method for read the data from Excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param path
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelFile(String sheet, int row, int cell, String path) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(path);
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * This is a generic method from write the data into Excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/EmpDetail.xlsx");
		Workbook wb1=WorkbookFactory.create(fis);
		wb1.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/EmpDetail.xlsx");
		wb1.write(fos);
		wb1.close();
		
		
	}
}
