import java.util.Scanner;

/**
 * Created by ducdoan on 12/25/16.
 */
public class SinhVien {
    String hoten;

    public String getName() {
        return hoten;
    }

    public void setName(String name) {
        hoten = name;
    }

    public SinhVien() {
        this.hoten = "";
    }

    public SinhVien(String name) {
        this.hoten = name;
    }

    // print array toString
   public String toString() {
        return "Ho ten " + hoten + "\n";
   }
}
