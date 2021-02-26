package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Data_DrivenDemo {
	String path,username,password;
	int count;
	
public void FetchData() throws IOException
{
	//Step 1 -- Providing path of excel File
	path=System.getProperty("user.dir")+"//TestData//LoginData.xls";
	
	//Step 2--Reading Data from Excel File
	FileInputStream fis=new FileInputStream(path);
	
	//Step 3-- Move to Workbook
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	
	//Step 4-- Open Specific Sheet
	HSSFSheet sheet=wb.getSheet("LoginSheet");
	
	//Step 5 -- Count No of rows in Excel Sheet
	count=sheet.getLastRowNum();
	
	//Step 6-- Get Data from 1st row 1st Column
	
	//username=sheet.getRow(1).getCell(0).getStringCellValue();
	//System.out.println(username);
	
	//Step 6- Fetch all data from Excel Sheet
	for(int i=0;i<=count;i++)
	{
		username=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(username);
		
		
		password=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(password);
	}
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Data_DrivenDemo oo=new Data_DrivenDemo();
		oo.FetchData();
	}

}
