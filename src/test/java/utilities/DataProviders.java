package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="excelDataProvider")
	public String[][] getData() throws IOException{
		
		String path = ".\\testdata\\Automation_excel.xlsx";
		
		ExcelUtility exeu = new ExcelUtility(path);
		
		int rowSize = exeu.getRowCount("Sheet1");
		int colSize = exeu.getCellCount("Sheet1", 1);
		String[][] result = new String[rowSize][colSize];
		for(int i=1;i<=rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				result[i-1][j]=exeu.getCellData("Sheet1", i, j);
			}
		}
		return result;
	}		
	
}
