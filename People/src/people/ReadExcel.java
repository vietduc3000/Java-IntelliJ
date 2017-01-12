package people;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.util.*;

/**
 * Created by ducdoan on 12/20/16.
 */
public class ReadExcel {


    public static void main (String[]args) throws IOException {
        ArrayList<BasketballPlayer> bballPlayerList = new ArrayList<>();


        try {

            FileInputStream fis = new FileInputStream(new File("/Users/ducdoan/Downloads/People/PlayersDB.xls"));

            //create workbook instance to refer to .xls
            HSSFWorkbook workbook = new HSSFWorkbook(fis);

            //create sheet object to retrieve the sheet
            HSSFSheet sheet = workbook.getSheetAt(0);

            //Check the cell type and format accordingly
            FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();

            Row rww = sheet.getRow(0);
            int numberOfFields = rww.getLastCellNum();
            int numberOfPlayers = sheet.getLastRowNum() ;

            for (int i = 1; i < numberOfPlayers; i++) {
                Row currentPlayer = sheet.getRow(i);

                String firstName = "", lastName = "", teamName = "", number = "", position = "";
                int age = 0;

                for (int j = 0; j < numberOfFields; j++) {
                    Cell currentField = rww.getCell(j);
                    switch (currentField.toString()) {
                        case "FirstName":
                            firstName = currentPlayer.getCell(j).toString();
                            break;
                        case "LastName":
                            lastName = currentPlayer.getCell(j).toString();
                            break;
                        case "Number":
                            number = currentPlayer.getCell(j).toString();
                            break;
                        case "Team":
                            teamName = currentPlayer.getCell(j).toString();
                            break;
                        case "Position":
                            position = currentPlayer.getCell(j).toString();
                            break;
                        case "Age":
                            age = (int) Double.parseDouble(currentPlayer.getCell(j).toString()); // cast to integer
                            break;
                    }
                }
                bballPlayerList.add(new BasketballPlayer(teamName, number, position, firstName, lastName, age));
            }
            System.out.println("Number of players: " + bballPlayerList.size());
            for (int i = 0; i <bballPlayerList.size(); i++)
                bballPlayerList.get(i).toPrint();








          /* for (Row roww : sheet) { //iterate rows
                roww.getLastCellNum();

                for (Cell celll : rww) { //iterate columns

                    //check cell types
                    switch (formulaEvaluator.evaluateInCell(celll).getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC: // if cell is numeric format
                            System.out.print(celll.getNumericCellValue() + "\t\t");

                            break;
                        case Cell.CELL_TYPE_STRING: // if cell is string format
                            System.out.print(celll.getStringCellValue() + "\t\t\t");
                            break;
                    }
                }



            } */

                fis.close();




/* rowIterator ----
------------------

            // Get iterator to all the rows in current sheet
            Iterator<Row> rowIterator = sheet.iterator();

            // Traversing over each row of XLS file
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                //for each rows iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    //Check the cell type and format accordingly


                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t");

                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;
                    }
                    System.out.println();
                }

            }

            fis.close(); */
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}


