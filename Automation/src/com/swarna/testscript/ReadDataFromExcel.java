package com.swarna.testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		String data = w.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
	}
}
