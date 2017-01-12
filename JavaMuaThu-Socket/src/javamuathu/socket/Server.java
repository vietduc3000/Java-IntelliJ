package javamuathu.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ducdoan on 1/3/17.
 */
public class Server {
    public static void Main (String[] args){

        try {
            //buoc 1: server cho` va lang nghe
            ServerSocket serverSocket = new ServerSocket(6969);

            //cho
            System.out.println("Waiting is happiness..");
            Socket socket = serverSocket.accept();

            //chay den lenh nay server dung moi xu li
            //khi ma client ket noi toi may chay tiep
            System.out.println("Found connection :D" + socket.getInetAddress().getHostAddress());

            //OutputStream outputStream = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter());
            String mes = "Hello ! Nice to meet up ";

            //outputStream.write(mes.getBytes());
            //outputStream.flush();
            writer.write(mes);
            writer.flush();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
