package funtest;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by ducdoan on 12/20/16.
 */
public class ReadExcel {
    public static void main (String[]args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("PlayersDB.xls"));

        //create workbook instance to refer to .xls
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        //create sheet object to retrieve the sheet
        HSSFSheet sheet = workbook.getSheetAt(0);

        /*FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator(); //evaluate the cell style

         for (Row row:sheet) {
            for(Cell cell:row){
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC: // if cell is numeric format
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_STRING: // if cell is string format
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                }

                }
                System.out.print("");

        } */

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()){
            Row row = rowIterator.next();
            //for each rows iterate through all the columns
            Iterator<Cell>cellIterator=row.cellIterator();

            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                //Check the cell type and format accordingly
                switch (cell.getCellType())
                {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");

                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                }
                System.out.println();

            }
        }
        fis.close();


    }
}
