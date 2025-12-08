package com.utility;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
   public static void readParticularData(){
	   try {
		   File file =new File("\\MY BILL'S\\DataDriven_IPT (1).xlsx");
       	Workbook book=new XSSFWorkbook(file);
      Sheet sheet	=book.getSheet("Sheet1");
      Row row = sheet.getRow(3);
      Cell cell = row.getCell(1);
//     String data= cell.getStringCellValue();     //it access string value only
//     System.out.println(data);
      DataFormatter dataFormat = new DataFormatter();
      String data = dataFormat.formatCellValue(cell);
      System.out.println(data);
      
      
	} catch (Exception e) {
		e.printStackTrace();
	}
        }
   public static String readParticularData(int rowValue,int columnValue){
	   
	   String data =null;
	   try {
	//	   String data =null;
		   File file =new File("\\MY BILL'S\\DataDriven_IPT (1).xlsx");
       	Workbook book=new XSSFWorkbook(file);
      Sheet sheet	=book.getSheet("Sheet1");
      Row row = sheet.getRow(rowValue);
      Cell cell = row.getCell(columnValue);
 
      DataFormatter dataFormat = new DataFormatter();
      data = dataFormat.formatCellValue(cell);
      System.out.println(data);
      book.close();

      
	} catch (Exception e) {
		e.printStackTrace();
	}
	return data;
        }
   public static void writeData() {
		
		try {
			   File file =new File("\\MY BILL'S\\DataDriven_IPT (1).xlsx");
		       	FileInputStream fileInput=new FileInputStream(file);
		       	Workbook book=new XSSFWorkbook(fileInput);
//		       book.createSheet("IPT2025DEC").createRow(0).createCell(0).setCellValue("Muthu");
//			   book.getSheet("IPT2025DEC").createRow(1).createCell(0).setCellValue("Raju");
			   book.getSheet("IPT2025DEC").createRow(2).createCell(0).setCellValue("Narmatha");

		       	FileOutputStream fileOutput=new FileOutputStream(file);
               book.write(fileOutput);
               book.close();
               System.out.println("successfully created");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
   public static void getAllData() {	
		try {
			File file = new File("\\MY BILL'S\\DataDriven_IPT (1).xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			
			int lastRowNo = sheet.getLastRowNum();
			System.out.println("No of rows: " + lastRowNo);
			
			short lastCellNo = sheet.getRow(0).getLastCellNum();
			System.out.println("No of columns: " + lastCellNo);
			
			for (int i = 1; i <=lastRowNo; i++) {//rows
				//1<=4 --> true
				//2<=4 --> true
				Row row = sheet.getRow(i);
						
				for (int j = 0; j < lastCellNo; j++) {//columns
					
					//0<3 --> true
					//1<3 --> true
					//2<3 --> true
					//3<3 --> false
					Cell cell = row.getCell(j);
					
					DataFormatter dataFormat = new DataFormatter();
					String data = dataFormat.formatCellValue(cell);
					System.out.println(data);
					// 1,0
					// 1,1
					// 1,2
					  book.close();
				} 
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
   

public static void writeData2() {
	
	try {
		   File file =new File("\\MY BILL'S\\DataDriven_IPT (1).xlsx");
	       	FileInputStream fileInput=new FileInputStream(file);
	       	Workbook book=new XSSFWorkbook(fileInput);

		   book.getSheet("IPT2025DEC").createRow(0).createCell(0).setCellValue("Java Script");

	       	FileOutputStream fileOutput=new FileOutputStream(file);
         book.write(fileOutput);
         book.close();
         System.out.println("successfully created");
	} 
	
	catch (Exception e) {
		e.printStackTrace();
	}
} public static String readParticularData2(int rowValue,int columnValue){
	   
	   String data=null;
	   try {
		   File file =new File("\\MY BILL'S\\DataDriven_IPT (1).xlsx");
    	Workbook book=new XSSFWorkbook(file);
   Sheet sheet	=book.getSheet("IPT2025DEC");
	Row row = sheet.getRow(rowValue);
	Cell cell = row.getCell(columnValue);
	DataFormatter dataFormat = new DataFormatter();
	data = dataFormat.formatCellValue(cell);
	System.out.println(data);

   
   
	} catch (Exception e) {
		e.printStackTrace();
	}
	return data;
    
          }

	public static void main(String[] args) {
	//	readParticularData();
	//	readParticularData(3,1);
	//	readParticularData2(0,0);
	//	writeData();
		getAllData();
	//	writeData2();
		
	}
   
  
}

