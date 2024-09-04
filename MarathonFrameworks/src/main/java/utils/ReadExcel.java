package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		
		//To open the Workbook
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		// To enter into Worksheet
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		// To count the number of rows - Excluding Header
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("without row 1:" +rowcount);
		
		//Count the number of rows - including Header
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("with row 1:" +physicalNumberOfRows);
		
		//To count the number of Columns
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("column count:" +columnCount);
		
		//To retrive Particular value
		
		String rowcolumnData = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Data1 is:" +rowcolumnData );
		
		
		String[][] data=new String[rowcount][columnCount];
		
		//To retrive the entire value
		
		for(int i=1; i<=rowcount ;i++)
		{
		
			XSSFRow row = sheet.getRow(i);
			
		for(int j=0; j<columnCount; j++) 
		{
			String allData = row.getCell(j).getStringCellValue();
			System.out.println("Data are:" +allData);
			data[i-1][j]=allData;
		}
		}
		
		wb.close();
		return data;
		
	}

		}

