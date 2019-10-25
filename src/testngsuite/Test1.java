package testngsuite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;

import excelnavigations.ReadExcelDatas;

public class Test1 {

	@SuppressWarnings("deprecation")
	@DataProvider(name="sample")
	public void getdata() {
			ReadExcelDatas ed = new ReadExcelDatas(System.getProperty("user.dir")+"\\inputexcel\\TestCaseInput.xlsx");
			
			Sheet sheet = ed.getsheet("TestCase1");
					
			int rowcount = ed.sheetrowcount();
			
			for(int i=0;i<rowcount;i++) {
				
				Row row = sheet.getRow(i);
				
				for(int j=0;j<row.getLastCellNum();j++) {
					
					Cell cell = row.getCell(j);
					
					if(cell == null || cell.getCellTypeEnum() == CellType.BLANK) {
						
					}else {
						if(j==0) {
							
						}
					}
					
				}
				
				
			}
	}
	
}
