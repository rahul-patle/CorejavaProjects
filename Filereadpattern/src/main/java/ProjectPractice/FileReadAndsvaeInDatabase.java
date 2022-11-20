package ProjectPractice;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReadAndsvaeInDatabase {
	public static void main(String[] args) throws Exception {
		
		Connection connection = Connectionutilise.conectionutilise();
		PreparedStatement preparestatement = connection.prepareStatement("insert into user(rno,name,marks,subject) values (?,?,?,?)");

		Workbook workbook = new XSSFWorkbook(new FileInputStream("student.xlsx"));
		Sheet sheet = workbook.getSheetAt(0); // exel sheet index 1st sheet at 0 index

		for (int i = 1; i < sheet.getLastRowNum(); i++) {
	// iterating rows	
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getLastCellNum(); j++) {

	// data adding in database			
		preparestatement.setString(j+1,row.getCell(j).toString());
				
			}
		preparestatement.executeUpdate();
		}System.out.println("record added successfully");
	}
}
