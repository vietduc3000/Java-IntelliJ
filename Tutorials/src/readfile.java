import java.io.File;
import java.util.Scanner;

public class readfile {

    private Scanner x;

    public void openFile  (){
        try{
            x = new Scanner(new File("/Users/ducdoan/Downloads/Tutorials/chinese123.txt"));
            System.out.println("File found !");
        } catch (Exception e){
        System.out.println("File not found !");
        }
    }

   public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();
            System.out.printf("%s %s %s \n",a,b,c);
        }
    }
    public void closeFile(){
        x.close();
    }


}