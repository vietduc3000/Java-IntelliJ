import java.util.Scanner;

/**
 * Created by ducdoan on 1/1/17.
 */
public class SinhVien {
    private static int maSV = 0;
    private String tenSV;
    private int ma;

    public SinhVien() {
        this.ma = maSV++;
    }

    public void nhap(Scanner sc){
        tenSV = sc.nextLine();
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + "\n";
    }
}
