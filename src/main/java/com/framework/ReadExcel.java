package com.framework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String userName,password;
	public String profileName;


	public Sheet getSheet(String sheetName) {

		Sheet sheet = null;
		try {
			FileInputStream datafile = new FileInputStream(System.getProperty("user.dir") + "/Resource Folder/TestData.xlsx");
			Workbook workbook = new XSSFWorkbook(datafile);
			sheet = workbook.getSheet(sheetName);
			
		}
		catch(Exception e) {
			System.out.println("exception in read file ");

		}
		return sheet;


	}

	
	public void readVendorLoginData() {
		
		Sheet getsheet = getSheet("Login");
		Row row = getsheet.getRow(1);
		userName = row.getCell(0).toString();
		password = row.getCell(1).toString();
		System.out.println("username :" +userName);
		System.out.println("password :" +password);
	}
	
	public void readHomeScreenDate() {
		Sheet getsheet = getSheet("Home");
		Row row = getsheet.getRow(1);
		profileName = row.getCell(0).toString();
		System.out.println();
	}

}
