/**
 * Created by ducdoan on 12/31/16.
 */
public class QuanLySinhVien {

    public static void main (String[]args){

    //    SinhVien sinhVien = new SinhVien();
    //    sinhVien.nhapThongTin();
    //    sinhVien.inThongTin();

        SinhVien danhSach[]=new SinhVien[3];
        SinhVien danhSach2[];

        for(int i=0;i<danhSach.length;i++){
            danhSach[i]=new SinhVien(); // khoi tao cho tung phan tu cua mang
            danhSach[i].nhapThongTin();
            System.out.println("---------------------");
        }

      //  for(SinhVien sv : danhSach){ // Khong duoc vi Scanner Buffer van con ki hieu Enter <-l
      //      sv.nhapThongTin();
      //  }

            System.out.println("Danh sach sinh vien trong truong: ");

        for (SinhVien sv : danhSach){
            sv.inThongTin();
        }
        System.out.println("---------------------");


         /*
    * Bo sung tinh nang : - tinh tuoi
    * - So Sanh tuoi 2 sinh vien tu ngay sinh va sap xep mang danhSach theo tuoi
    *
    * */

        // Sap xep tuoi tu lon den be
        System.out.println("Sap xep danh sach sinh vien ^_^ ");

        for (int i = 0; i < danhSach.length ; i++) {
            for (int j = 0; j < danhSach.length ; j++) {
                if(danhSach[i].soSanhTuoi(danhSach[j]) == 1) { // i > j tu be den lon
                   SinhVien svTrungGian = danhSach[i];
                   danhSach[i] = danhSach [j];
                   danhSach[j] = svTrungGian;
                }
            }
        }

        for (SinhVien sv: danhSach) {
            sv.inThongTin();
        }
    }
}
