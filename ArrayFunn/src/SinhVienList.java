import java.util.Scanner;

/**
 * Created by ducdoan on 12/26/16.
 */
public class SinhVienList {
    SinhVien[] sv;

    //array range
    public SinhVienList(int size){
        sv = new SinhVien[size];

        for(int i=0;i<size;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap Ho Ten Sinh Vien " + (i + 1));
            String name = input.nextLine();
            sv[i] = new SinhVien(name);
         }
    }

    //print array
    public String toString(){
        String s= "";
            for(int i= 0;i<sv.length;i++){
                s+=sv[i];
            }
        return s;
    }

    public SinhVien getSinhVien(int i) {
        return sv[i];
    }

    //search string
    public int TimKiem(String name) {
        for (int i = 0; i < sv.length; i++) {
            if (sv[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}
