package funtest;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
/**
 * Created by ducdoan on 12/19/16.
 */
public class readfile {
    private Scanner x;
    public void openFile() {
        try {
            Scanner x = new Scanner(new File("/Users/ducdoan/Downloads/People/src/people/PlayersDB.xlsx"));

        } catch (Exception e) {
            System.out.println("File Not Found !!");
        }
    }

    public void readFile(){


    }

    public void closeFile(){

    }
}
