import com.healthmarketscience.jackcess.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by ducdoan on 1/4/17.
 */
public class CreateDatabase {

    //Create database contruction
    private static Database createDatabase(String databaseName) throws IOException {
        File file = new File(databaseName);
        Database db = new DatabaseBuilder(file).setFileFormat(Database.FileFormat.V2007).create();
        return db;
    }

    private static TableBuilder createTable(String tableName) {
        return new TableBuilder(tableName);
    }

    public static void startDatabaseProcess()  {

        String databaseName = "players.mdb";
        Database database = null;

        try {
            database = createDatabase(databaseName);

        String tableName = "Bballplayers";
        Table table = createTable(tableName)
                .addColumn(new ColumnBuilder("PlayerID").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("FirstName").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("LastName").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Number").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("Team").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Age").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("Position").setSQLType(Types.VARCHAR))
                .toTable(database);

        table.addRow(1,"Bradley",	"Beal",	23,	"WAS",	3,	"PG");
        table.addRow(2,"DeMarcus",	"Cousins",	26,	"SAC",	15,	"PG");
        table.addRow(3,"Joel",   "Embiid",	22,	"PHI",	21,	"SG");
        table.addRow(4,"DeMarcus",	"DeRoza",	27,	"TOR",	10,	"SG");

        } catch (IOException e) {
            System.out.println("File Not Found ! ");
        }

        catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


  //  public static void main(String[] args) throws IOException, SQLException {
  //      CreateDatabase.startDatabaseProcess();
  //      System.out.println("File Created Success !!");
  //  }


}
