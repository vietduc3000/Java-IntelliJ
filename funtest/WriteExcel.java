package funtest;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;

import java.io.IOException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by ducdoan on 12/20/16.
 */
public class WriteExcel {
    public static void main (String[] args) throws IOException {
    HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("First Sheet Name"); //create sheet
        HSSFRow row = sheet.createRow(0); //create row
        HSSFCell cell = row.createCell(0); //create cell
        cell.setCellValue("1,Cell");

        cell = row.createCell(1); //create column 1
        DataFormat format = workbook.createDataFormat();
        CellStyle dateStyle = workbook.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("dd-mm-yyyy"));
        cell.setCellStyle(dateStyle);
        cell.setCellValue(new Date());
        sheet.autoSizeColumn(1);

        row.createCell(2).setCellValue("3.Cell3"); //create column 2


        workbook.write(new FileOutputStream("test.xls"));
        workbook.close();


    }

}
