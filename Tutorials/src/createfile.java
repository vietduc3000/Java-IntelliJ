
import  java.util.*;
import java.io.*;
import java.lang.*;

public class createfile {
    private Formatter x;

    public void openFile(){
        try {
            x = new Formatter("chinese123.txt");
        }
        catch (Exception e){
            System.out.println("File is existed");
        }
    }

    public void addRecord(){
        x.format("%s%s%s", "Lucy","Nguyen","28");
    }

    public void closeFile(){
        x.close();
    }




}
