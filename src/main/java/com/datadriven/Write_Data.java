package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\write_demo.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	wb.createSheet("sample").createRow(0).createCell(0).setCellValue("email");
	wb.getSheet("sample").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("sample").createRow(1).createCell(0).setCellValue("gayu");
	wb.getSheet("sample").getRow(1).createCell(1).setCellValue("gayu@96");
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("write successfully");
	
	
}
}
