package funtest;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ducdoan on 12/20/16.
 */
public class ReadExcel2 {
    public static void main (String[]args) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("test.xls"));
        HSSFSheet sheet = workbook.getSheetAt(0);
        HSSFRow row = sheet.getRow(0);
        System.out.print(row.getCell(0).getStringCellValue());

        

    }
}
