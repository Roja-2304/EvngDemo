package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_readexcel
{
public static String getData(String Sheet,int row,int column) throws IOException
{
	 String val= "";
	FileInputStream fis = new FileInputStream("./excel/Hybrid.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(Sheet).getRow(row).getCell(column);
	return val=c.getStringCellValue();	
}
}
