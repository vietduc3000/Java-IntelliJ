import java.util.Scanner;

/**
 * Created by ducdoan on 12/19/16.
 */
public class catchexample {

    public static void main(String[] args) {
            int x = 1;
        Scanner input = new Scanner(System.in);

            try {
                System.out.println("Enter first number: ");
                int a = input.nextInt(); // INT number
                System.out.println("Enter second number: ");
                int b = input.nextInt();
                int sum = a / b;
                System.out.println(sum);
                x =2;
            } catch (Exception e) {
                System.out.println("It's not valid");
            } while (x==1);

    }
}