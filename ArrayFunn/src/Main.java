/*
Bài 1:
- Số sinh viên nhập từ bàn phím. Khai báo 1 mảng gồm danh sách họ tên sinh viên.
- Tên từng sinh viên nhập từ bàn phím. Sau khi nhập xong, chương trình hỏi nhập tên sinh viên muốn tìm kiếm.
- Tìm và in ra kết quả là có trong danh sách hay không.


 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//

    public static void main(String[] args) {
        try{

            Scanner input = new Scanner(System.in);

            //Allocate memory for array
            SinhVienList sinhvien;
            System.out.print("Nhap so sinh vien: ");
            int n = input.nextInt();

            //sinhvien object retrieve data from SinhVienList
            sinhvien = new SinhVienList(n);

            //print arraylist
            System.out.println("Sinh vien vua nhap la: ");
            System.out.println(sinhvien);

            System.out.print("Nhap sinh vien can tim kiem: ");
            String nextLine = input.nextLine();
            String name = input.nextLine();

            int i = sinhvien.TimKiem(name);

            //check sinh vien's name in the array
            if(i!= -1){
            System.out.print("Sinh vien tim thay la: "+sinhvien.getSinhVien(i));
            }else{
            System.out.println("Khong tim thay sinh vien nay");
            }

        }  catch (Exception e) {
                e.printStackTrace();
            }
    }
}
