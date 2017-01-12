import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ducdoan on 12/27/16.
 */
public class SanPham {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout;

// Tạo file mới!
        try {
            fout = new FileOutputStream("E:\\output.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Error Opening OutputFile ");
            return;
        }

// Ghi file theo từng ký tự từ a -> z
        int i = 'a';
        int j = 'z';
        for (i = 'a'; i <= j; i++) {
            fout.write(i);
        }
        fout.close();
    }
}
