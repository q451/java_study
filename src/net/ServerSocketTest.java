package net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务器等待连接");
            Socket socket = serverSocket.accept();
            String str = "Hello world";
            PrintStream out = new PrintStream(socket.getOutputStream());
            out.println(str);
            out.close();
            serverSocket.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
