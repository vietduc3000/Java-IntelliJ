/**
 * Bài 1:
 - Class USB có các thuộc tính: mã hàng, giá, số lượng. Phương thức tổng tiền = giá * số lượng,
 phương thức show in ra toàn bộ thông tin đơn hàng mua USB

 - Class Mouse kế thừa từ class USB, ghi đè 2 phương thức tổng tiền (do chuột được giảm giá 20%)
 và show in toàn bộ thông tin đơn hàng khi khách hàng mua chuột máy tính.

 - Tạo mỗi lớp 1 đối tượng, nhập thông tin từ bàn phím, in thông tin đơn hàng ra màn hình!

 - Code hướng đối tượng, các thuộc tính để private!
 */
public class USB implements iDisplayable{

    private String name;
    private String mahang;
    private Double gia;
    private int soluong;

    //Contructor
    public USB(){

    }
    public USB(String name, String mahang, Double gia, int soluong) {
        this.name = name;
        this.mahang = mahang;
        this.gia = gia;
        this.soluong = soluong;
    }

    //Get and Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    //tong tien
    public int tongtien (){
        return (int) (this.gia * this.soluong);
    }

        @Override
        public void toDisplay(){
            System.out.println("USB Name: "+ this.getName());
            System.out.println("SKU: " + this.getMahang());
            System.out.println("Gia: " + "$" + this.getGia());
            System.out.println("So luong: " + this.getSoluong());
            System.out.println("Tong so tien: " + "$" + this.tongtien());
            System.out.println("---------------");

        }



}
