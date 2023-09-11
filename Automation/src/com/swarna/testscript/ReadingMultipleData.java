package com.swarna.testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/EmpDetail.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		int count = w.getSheet("Emp").getLastRowNum();
		for (int i=1;i<count;i++) {
			String un = w.getSheet("CreateCustomer").getRow(i).getCell(1).getStringCellValue();
			String pwd = w.getSheet("Emp").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pwd);
}
}
}
