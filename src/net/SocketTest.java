package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = buf.readLine();
            System.out.println(str);

            socket.close();
            buf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
