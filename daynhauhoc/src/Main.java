import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 * Created by ducdoan on 1/1/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<SinhVien> ds = new ArrayList<>();
            Scanner sc = new Scanner(new File("INPUT.txt"));
            while (sc.hasNextLine()) {
                SinhVien sv = new SinhVien();
                sv.nhap(sc);
                ds.add(sv);
            }

            //for (SinhVien sv : ds) {
            for (int i = 0 ; i < ds.size() ; i++){
                System.out.println(ds.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
