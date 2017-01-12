/*


Khai báo 2 biến nguyên “thang” và “nam” gán giá trị là tháng và năm.Yêu cầu “thang” thuộc tập hợp [1..12], năm không được âm.
- Nếu gán sai tháng thì báo “Bạn đã nhập sai tháng”, nếu gán sai năm thì báo “Bạn đã gán sai năm”. Khi 1 trong 2 thông tin bị gán sai, những câu lệnh sau sẽ không chạy!
- Nếu năm đó là năm nhuận thì in ra thông báo: Đây là năm nhuận. không thì báo ra là năm thường.
- Dựa vào thông tin năm đó là năm nhuận hay không và giá trị của tháng đó là tháng nào để báo ra tháng đó có bao nhiêu ngày.



 */

public class Main {


    public static void main(String[] args) {
        // data demo
        int thang = 2 ; // thang 1 - 12 , thang 2 co 28 hoac 29 ngay tuy nham nhuan hay thuong
        String nam = "nhuan"; // nam nhuan va thuong


        switch(thang){
            case 1:
                System.out.println("Thang 1 co 31 ngay");
                    break;

            case 3:
                System.out.println("Thang 3 co 31 ngay");
                    break;
            case 4:
                System.out.println("Thang 4 co 30 ngay");
                    break;
            case 5:
                System.out.println("Thang 5 co 31 ngay");
                    break;
            case 6:
                System.out.println("Thang 6 co 30 ngay");
                    break;
            case 7:
                System.out.println("Thang 7 co 31 ngay");
                    break;
            case 8:
                System.out.println("Thang 8 co 30 ngay");
                    break;
            case 9:
                System.out.println("Thang 9 co 31 ngay");
                    break;
            case 10:
                System.out.println("Thang 10 co 30 ngay");
                break;
            case 11:
                System.out.println("Thang 11 co 31 ngay");
                    break;
            case 12:
                    break;

            if ( ){
                if (thang == 2) {
                        System.out.println("Thang 2 co 29 ngay");

                }
                System.out.println("Thang 2 co 28 ngay");


            }


        }

        switch (nam){
            case "nhuan":
                System.out.println("Day la nam nhuan");
                    break;

            case "thuong":
                System.out.println("Day la nam thuong");
                    break;
        }









    }

}
