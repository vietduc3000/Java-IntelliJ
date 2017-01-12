/**
 * Created by ducdoan on 12/27/16.
 */
public class Mouse extends USB implements iDisplayable {

    public Mouse() {
    }

    public Mouse(String name, String mahang, Double gia, int soluong) {
        super(name, mahang, gia, soluong);
    }

    @Override
    public void toDisplay(){
        System.out.println("Mouse Name: "+ this.getName());
        System.out.println("SKU: " + this.getMahang());
        System.out.println("Gia: " + "$" + this.getGia());
        System.out.println("So luong: " + this.getSoluong());
        System.out.println("Tong so tien (save 20%): " + "$" + this.tongtien() * 0.8); //giam gia 20%
        System.out.println("---------------");

    }
}
