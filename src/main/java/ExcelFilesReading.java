import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.*;




public class ExcelFilesReading {
	
	public  static void excelreading() throws FileNotFoundException {
		File excelfile = new File("C:\\");
		FileInputStream IS = new FileInputStream(excelfile);
		Workbook wb = new XSSFWorkbook (IS);
		
	}

}
