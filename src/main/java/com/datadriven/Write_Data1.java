package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data1 {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\write_demo2.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet s=wb.createSheet();
	s.createRow(0);
	s.getRow(0).createCell(0).setCellValue("name");
	s.getRow(0).createCell(1).setCellValue("nick");
	
	s.createRow(1);
	s.getRow(1).createCell(0).setCellValue("gayu");
	s.getRow(1).createCell(1).setCellValue("p");
	
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("write successfully");
	
}
}

