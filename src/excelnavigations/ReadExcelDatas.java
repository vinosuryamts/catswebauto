package excelnavigations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDatas {
	
	File file;
	FileInputStream fileinputstream;
	Workbook book;
	Sheet sheet;
	String fileextension;
	
	public ReadExcelDatas(String path) {
		
		try {
			file = new File(path);
			fileinputstream = new FileInputStream(file);  
			
			fileextension = FilenameUtils.getExtension(path);
			
			if(fileextension.equals("xsls")) {
				book = new XSSFWorkbook(fileinputstream);
			}else if (fileextension.equals("xls")) {
				book = new HSSFWorkbook(fileinputstream);
			}else {
				System.out.println("Invalid File Format");
				System.exit(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Sheet getsheet(String sheetname) {
		sheet = book.getSheet(sheetname);
		return sheet;
	}
	
	public int sheetrowcount() {
		 int sheetval = sheet.getLastRowNum()-sheet.getFirstRowNum();
		 return sheetval;
	}
	
	public String getcellvalues(int row, int column) {
		String cellvalue;
		try {
			cellvalue = sheet.getRow(row).getCell(column).getStringCellValue();
		}catch (Exception e) {
			cellvalue = "";
		}
		return cellvalue;
	}
	

}
