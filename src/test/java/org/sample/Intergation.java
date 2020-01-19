package org.sample;

import java.io.File;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Intergation {
	
	public static void main(String[] args) throws Throwable {
		
		File loc = new File("C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Excel\\Candy.xlsx");
		
		Workbook w=new XSSFWorkbook();
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r=s.getRow(4);
		
		Cell c=r.getCell(4);
		
		c.setCellValue("Red Candy");
		
		FileOutputStream o=new FileOutputStream(loc);
		
		w.write(o);
		
		System.out.println("Updated Sucessfully");
		
		
		
		
		
		
		
	}
	
	
	
	

}
