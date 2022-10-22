package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http","59.64.3.20",8095,"/");
        InputStream input = url.openStream();
        Scanner scn = new Scanner(input);
        scn.useDelimiter("\n");
        while (scn.hasNext()){
            System.out.println(scn.next());
        }
    }
}
