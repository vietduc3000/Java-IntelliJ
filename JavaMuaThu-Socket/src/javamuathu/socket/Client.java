package javamuathu.socket;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ducdoan on 1/3/17.
 */
public class Client {
    public static void main (String[]args){

        try  {
            System.out.println("Di tim hanh phuc....");
            Socket socket = new Socket("localhost",6969);
            System.out.println("Da thong.");
            //InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

           /* while (true) {
                if (inputStream.available() == 0) {
                    break;
                }
                int read = inputStream.read();
            }*/

            while(true){
                String readLine = reader.readLine();
                if (readLine == null) break;
                System.out.println("Server : " + readLine);

            }


        }catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
