import com.healthmarketscience.jackcess.*;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ducdoan on 1/6/17.
 */
public class DBController {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public DBController(String fileName) {
        this.fileName = fileName;
    }

    public Database getDatabase() {
        Database db = null;
        try {

            File file = new File(this.fileName);
            db = DatabaseBuilder.open(file);
            //DBController dbController = new DBController(getFileName());
            // Database db = dbController.getDatabase();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return db;
    }

//    create 3 methods to create, update, and delete a record by passing the BasketballPlayer as a parameter
//    create a methods that will read a specific record, playerID  - CRUD

    public void createRecord(){

        Database db = getDatabase();
        try {
            Table table = db.getTable("Players");
            table.addRow( "", "Chris",	"Abc",	27	,"DOTA"	,15,	"NOOBCARRY");
            System.out.println("Player has been added! ");

            db.close();

        } catch (IOException e) {
            System.out.println("Player can't be added! ");
        }

    }

    public void readRecord(){


       Database db = getDatabase();
        try {

            //Use cursor to point to the Primary Key

            Table table = db.getTable("Players");
            IndexCursor cursor = CursorBuilder.createCursor(table.getPrimaryKeyIndex());
            for (Row row : cursor) {
                System.out.println(String.format("PlayerID: %d", row.get("PLAYER_ID")));
                System.out.println(String.format("FirstName: %s", row.get("FIRST_NAME")));
                System.out.println(String.format("LastName: %s", row.get("LAST_NAME")));
                System.out.println(String.format("Age: %d", row.get("AGE")));
                System.out.println(String.format("Team: %s", row.get("TEAM")));
                System.out.println(String.format("Position: %s", row.get("POSITION")));
                System.out.println(" ");
            }

            db.close();

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (Exception e){
            System.out.println("Database not found! ");
        }
    }

    public void updateRecord() {

        Database db = getDatabase();

        try {
            Table table = db.getTable("Players");
            //Row row = CursorBuilder.findRowByPrimaryKey(table,11);

            Cursor cursor = CursorBuilder.createCursor(table);
            boolean found = cursor.findFirstRow(Collections.singletonMap("PLAYER_ID","6"));

            if (found) {
                cursor.updateCurrentRow("", "TESTUPDATE2",	"TEST2", 88, "ABC2", 22, "EZ2");
                System.out.println("Player Updated ! ");

            }else{
                System.out.println("Player not found ! ");
            }

            db.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deleteRecord(){

        Database db = getDatabase();
        try {
            Table table = db.getTable("Players");
            Row row = CursorBuilder.findRowByPrimaryKey(table,10);

            if (row != null){
                System.out.println("PlayerID Found : " + row.get("PLAYER_ID"));
                System.out.println(String.format("Row found : Name ='%s' ", row.get ("FIRST_NAME" )));
                table.deleteRow(row);
                System.out.println("Player has been deleted! ");

            } else {
                System.out.println("Player not found ! ");
            }

            db.close();


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public void searchRecord(){

        Database db = getDatabase();
        try {
            Table table = db.getTable("Players");
            Cursor cursor = CursorBuilder.createCursor(table);
            boolean found = cursor.findFirstRow(Collections.singletonMap("FIRST_NAME","Chris"));
            if(found){
                System.out.println("Player found ! ");
                System.out.println("PlayerID: " + cursor.getCurrentRowValue(table.getColumn("PLAYER_ID")));
                System.out.println("First Name: " + cursor.getCurrentRowValue(table.getColumn("FIRST_NAME")));
                System.out.println("Last Name: " + cursor.getCurrentRowValue(table.getColumn("LAST_NAME")));
                System.out.println("Age: " + cursor.getCurrentRowValue(table.getColumn("AGE")));
                System.out.println("Team: " + cursor.getCurrentRowValue(table.getColumn("TEAM")));
                System.out.println("Position: " + cursor.getCurrentRowValue(table.getColumn("POSITION")));

            } else {
                System.out.println("No matching player found. ");
            }

            db.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


}
