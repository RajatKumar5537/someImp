package com.actitimeProject.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getProperyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".//data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String getExcelData() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/CreateCustomer.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(null).getRow(0).getCell(1).getStringCellValue();
		return data;
	}
}
