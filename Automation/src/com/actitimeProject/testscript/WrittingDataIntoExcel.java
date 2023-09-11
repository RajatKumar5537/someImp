package com.actitimeProject.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDataIntoExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/CreateCustomer.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	wb.getSheet("CreateCustomer").getRow(3).getCell(4).setCellValue("Success");
	FileOutputStream fos=new FileOutputStream("./data/CreateCustomeer.xlsx");
	wb.write(fos);
	wb.close();
}
}
