package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.adactin.*;

public class Read_Data extends com.base.adactin.Base_class {
	public static void particular_cell_data() throws IOException
	{
		File f=new File("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\sample_wb.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		 Sheet s=  wb.getSheetAt(0);
		Row r= s.getRow(1);
		Cell c=r.getCell(1);
		CellType type=c.getCellType();
		System.out.println("****particular cell data****");
		if(type.equals(CellType.STRING))
		{
			String cellvalue=c.getStringCellValue();
			System.out.println(cellvalue);
		}
		else if(type.equals(CellType.NUMERIC))
		{
			double d=c.getNumericCellValue();
			int n=(int) d;
			String value=String.valueOf(n);
			System.out.println(value);	
			
		}
		wb.close();
	}
	public static void Row_data() throws IOException
	{
		File f=new File("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\sample_wb.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		Row r=s.getRow(1);
		int c=r.getPhysicalNumberOfCells();
		System.out.println("****row data****");
		for(int i=0;i<c;i++)
		{
			Cell c1=r.getCell(i);
			CellType type=c1.getCellType();
			if(type.equals(CellType.STRING))
			{
				String cellvalue=c1.getStringCellValue();
				System.out.println(cellvalue);
			}
			else if(type.equals(CellType.NUMERIC))
			{
				double d=c1.getNumericCellValue();
				int n=(int) d;
				String value=String.valueOf(n);
				System.out.println(value);	
			}
		}
		wb.close();
	}
	public static void all_data() throws IOException
	{
		File f=new File("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\sample_wb.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		int r=s.getPhysicalNumberOfRows();
	System.out.println("****all data*****");
		for(int i=1;i<r;i++)
		{
			Row r1=s.getRow(i);
			int c=r1.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				Cell c1= r1.getCell(j);
				CellType type=c1.getCellType();
				if(type.equals(CellType.STRING))
				{
					 String cellvalue=c1.getStringCellValue();
					 System.out.println(cellvalue);
				}
				else if(type.equals(CellType.NUMERIC))
				{
					 double d=c1.getNumericCellValue();
					 int n=(int)d ;
					 String value=String.valueOf(n);
					 System.out.println(value);	 
				}
			}
		}
		wb.close();
	}
	public static void particular_column() throws IOException
	{
		File f=new File("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\sample_wb.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		int r=s.getPhysicalNumberOfRows();
		System.out.println("****particular column data****");
		for(int i=0;i<r;i++)
		{
			Row r1=s.getRow(i);
			Cell c=r1.getCell(0);
			CellType type=c.getCellType();
			if(type.equals(CellType.STRING))
			{
				 String cell_value=c.getStringCellValue();
				 System.out.println(cell_value);
			}
			else if(type.equals(CellType.NUMERIC))
			{
				double d=c.getNumericCellValue();
				int n=(int) d;
				String value=String.valueOf(n);
				System.out.println(value);
			}
		}
		wb.close();
	}
	public static void main(String[] args) throws IOException {
	particular_cell_data();	
	Row_data();
	all_data();
	particular_column();	
		
	}
}
