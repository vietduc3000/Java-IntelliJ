

import com.healthmarketscience.jackcess.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by ducdoan on 1/4/17.
 */
public class CreateDBJackcess {

    private static Database createDatabase(String databaseName) throws IOException{
        return Database.create(new File(databaseName));
    }

    private static TableBuilder createTable(String tableName){
        return new TableBuilder(tableName);
    }

    public static void addColumn(Database database, TableBuilder tableName, String columnName, Types sqlType) throws SQLException, IOException {
        tableName.addColumn(new ColumnBuilder(columnName).setSQLType(Types.INTEGER).toColumn()).toTable(database);
    }

    public static void startDatabaseProcess() throws IOException, SQLException {
        String databaseName = "/players.mdb"; // Creating an MS Access database
        Database database = createDatabase(databaseName);

        String tableName = "BballPlayers"; // Creating table
        Table table = createTable(tableName)
                .addColumn(new ColumnBuilder("PlayerID").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("FirstName").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("LastName").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Number").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("Team").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Position").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Age").setSQLType(Types.INTEGER))
                .toTable(database);

        table.addRow(1,"Bradley",	"Beal",	23,	"WAS",	3,	"PG");
        table.addRow(2,"DeMarcus",	"Cousins",	26,	"SAC",	15,	"PG");
        table.addRow(3,"Joel",   "Embiid",	22,	"PHI",	21,	"SG");
        table.addRow(4,"DeMarcus",	"DeRoza",	27,	"TOR",	10,	"SG");
        table.addRow(5, "Goran",	"Dragic",	30	,"MIA"	,7,	"PG");
    }

    public static void main(String[] args) throws IOException, SQLException {
        CreateDBJackcess.startDatabaseProcess();
    }

}
