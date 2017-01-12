

import java.io.*;
import java.sql.*;


import com.healthmarketscience.jackcess.*;

/**
 * Created by ducdoan on 1/4/17.
 */
public class DemoJackcess {

    public static void main (String[] args) throws IOException, SQLException {

        Database db = DatabaseBuilder.create(Database.FileFormat.V2010, new File("Players.mdb"));
        Table newTable = new TableBuilder("PlayersList")
                .addColumn(new ColumnBuilder("PlayerID").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("FirstName").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("LastName").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Number").setSQLType(Types.INTEGER))
                .addColumn(new ColumnBuilder("Team").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Position").setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("Age").setSQLType(Types.INTEGER))
                .toTable(db);
        newTable.addRow(1,"Bradley",	"Beal",	23,	"WAS",	3,	"PG");
        newTable.addRow(2,"DeMarcus",	"Cousins",	26,	"SAC",	15,	"PG");
        newTable.addRow(3,"Joel",   "Embiid",	22,	"PHI",	21,	"SG");
        newTable.addRow(4,"DeMarcus",	"DeRoza",	27,	"TOR",	10,	"SG");
        newTable.addRow(5, "Goran",	"Dragic",	30	,"MIA"	,7,	"PG");

    }
}
