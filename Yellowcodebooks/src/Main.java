import com.sun.xml.internal.fastinfoset.util.StringArray;

/*Bài Thực Hành Số 1

Bạn hãy tạo MẢNG CÁC SỐ NGUYÊN và khởi tạo giá trị cho mảng như sau {3, 5, 7, 30, 10, 5, 8, 23, 0, -5}.
Hãy in ra console TỔNG và TRUNG BÌNH CỘNG của các giá trị phần tử trong mảng.

* */
public class Main {

    public static void main(String[] args) {

        int songuyen[];
        boolean isFound=false;

        songuyen = new int[]{3, 5, 7, 30, 10, 5, 8, 23, 0, -5};

        int sum = 0;

        for(int i=0 ; i < songuyen.length ; i++) {
            sum += songuyen[i];
        }
        System.out.println("Tong cua cac so nguyen: " + sum);

        double average = 0;
        average = (double)sum / songuyen.length;
        System.out.println("Trung binh: " + average);

        /*
        Với mảng các số nguyên như bài thực hành trên. Bạn hãy in ra VỊ TRÍ (thứ tự) của các phần tử nhỏ hơn hay bằng 0.
        */

        for (int i = 0 ; i< songuyen.length ; i++) {
            if (songuyen[i] <= 0) {

                System.out.println("So be hon hoac bang 0 la so thu: " + (i + 1) + " so " + songuyen[i]); //gia tri cua i chu ko phai nguyen array[i]
                isFound = true;
            }
        }

        // phai ket thuc vong lap for
        if (!isFound)
            {
                System.out.println("Khong tim thay so be hon hoac bang 0");
            }

        /* Cũng với mảng các số nguyên như bài thực hành trên.
        Giờ bạn hãy sắp xếp lại các phần thử mảng theo thứ tự TĂNG DẦN, {3, 5, 7, 30, 10, 5, 8, 23, 0, -5}.
        sao cho khi in ra console nội dung sẽ như vầy “-5  0  3  5  5  7  8  10  23  30”.
        */

        boolean flag = true; // flag true to begin 1st pass
        int temp;

        while (flag){

            flag = false; //flag false await a possible swap
            for(int i=0 ; i < songuyen.length -1 ; i++){
                if (songuyen[i] > songuyen[i+1]){ // ascending sort
                    temp = songuyen[i];
                    songuyen[i] =songuyen [i+1];
                    songuyen [i+1] = temp;
                    flag = true; //shows a swap occurred
                }

            }

        }

        for(int i=0 ; i < songuyen.length ; i++){
            System.out.println("Theo thu tu tang dan " + songuyen[i]);
        }





    }

}

