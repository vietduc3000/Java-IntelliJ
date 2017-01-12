import java.util.Scanner;

/**
 * Created by ducdoan on 12/31/16.
 */
public class ThoiGian {
    private static int LON_HON = 1;
    private static int BANG_NHAU = 0;
    private static int BE_HON = -1;

    public int ngay;
    public int thang;
    public int nam;

    public ThoiGian() {

    }

    public void nhapThoiGian(){
        System.out.println("Xin hay nhap ngay thang nam sinh cua sinh vien: ");
        System.out.print("Ngay sinh: ");
        this.ngay = new Scanner(System.in).nextInt();
        System.out.print("Thang sinh: ");
        this.thang = new Scanner(System.in).nextInt();
        System.out.print("Nam sinh: ");
        this.nam =  new Scanner(System.in).nextInt();
    }

    public void inThoiGian(){

        System.out.println(this.ngay+"-"+this.thang+"-"+this.nam);
    }

    public int tinhNam(ThoiGian HienTai){
        if(HienTai.thang >= this.thang){
            return HienTai.nam - this.nam + 2;
        } else {
            return HienTai.nam - this.nam + 1;
        }
    }

    //ham so sanh 2 bien
    public int soSanh(ThoiGian tg){
        //nhan vao 1 thoi gian va so sanh voi thoi gian this
        if(this.nam > tg.nam){
            return LON_HON;
        }
        if(this.nam < tg.nam){
            return BE_HON;
        }
        //so sanh thang
        if(this.thang > tg.thang){
            return LON_HON;
        } if(this.thang < tg.thang){
            return BE_HON;
        }
        //so sanh ngay
        if(this.ngay > tg.ngay){
            return LON_HON;
        }
        if(this.ngay < tg.ngay){
            return BE_HON;
        } return BANG_NHAU;
    }


}

