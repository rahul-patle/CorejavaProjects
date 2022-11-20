package ProjectPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filereadfromexcel {
	public static void main(String[] args) throws Exception {

// arguments as a inputstream.		
		Workbook workbook = new XSSFWorkbook(new FileInputStream("student.xlsx"));
		Sheet sheet = workbook.getSheetAt(0); // exel sheet index 1st sheet at 0 index

//	iterating rows
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
//	get row method call wich gives object of Row.
			Row row = sheet.getRow(i);
// iterating columns			
			for (int j = 0; j < row.getLastCellNum(); j++) {
// get cell gives the particular columns of rows
				System.out.print(row.getCell(j));
			}
			System.out.println();
		}
//R c c c <=
//R c c c <=
//R	c c c <=	
//R	c c c <=
	}

}
