import java.util.Scanner;
import java.lang.*;

/**
 * App quan li sinh vien
 * -Khai bao class SinhVien (ma,ten,tuoi (dd/mm/yyy))
 * -Nhap du lieu cho 1 sinh vien va hien ra man hinh
 * -Nhap du lieu cho 1 mang sinh vien va hien ra man hinh
 * Note:
 * -Ham nhap du lieu va hien thong tin cho 1 sinh vien nen de trong class SinhVien
 * -
 */

//attribute = thuoc tinh , variable = bien, contructor = hang

public class SinhVien {


    private String ma;
    private String ten;
    private int tuoi;
    private ThoiGian ngaySinh;

    public SinhVien () {
        ngaySinh = new ThoiGian();
    }

    public void inThongTin() {
        System.out.println("Ma so cua sinh vien: " + this.ma);
        System.out.println("Ten cua sinh vien: " + this.ten);
        System.out.println("Tuoi cua sinh vien: " + this.tuoi);
        System.out.println("Ngay sinh: ");
        ngaySinh.inThoiGian();

    }

    public void nhapThongTin(){
        System.out.println("Nhap ma so, ten va tuoi cua sinh vien: ");
        System.out.print("Ma so: ");
        this.ma = new Scanner(System.in).nextLine();
        System.out.print("Ten: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Tuoi ");
        this.tuoi = new Scanner(System.in).nextInt();
        ngaySinh.nhapThoiGian();

    }

    public int soSanhTuoi(SinhVien sv){ // so sanh tuoi nhan vao 1 ong sinh vien sv
        return this.ngaySinh.soSanh(sv.ngaySinh);
    }


}
