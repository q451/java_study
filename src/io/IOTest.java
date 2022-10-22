package io;

import java.io.*;
import java.util.Scanner;
import java.util.zip.ZipFile;

class File1{
    public void f() throws IOException {
        File file = new File("FileTest/test.txt");
        if (!file.exists()){
            file.createNewFile();
        }else {
            System.out.println("我存在啊");
            file.mkdir();
        }
        File files = new File("src");
        if (files.isDirectory()){
            File []fl = files.listFiles();
            for (int i =1;i<fl.length;i++){
                System.out.println(fl[i]);
            }
        }
        if (file.isFile()){
            System.out.println(file.length());
        }
    }
}
//字节六
class Ff{
    public final File file = new File("FileTest/test.txt");
    public void fff(){
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            OutputStream out = new FileOutputStream(file,true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入内容保存到文件");
            String text = scanner.nextLine();
            scanner.close();
            byte bytes[] = text.getBytes();
            out.write(bytes);
            out.close();
            System.out.println("保存成功");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
    public void readFile(){
        try {
            InputStream in = new FileInputStream(file);
            byte by[] = new byte[1024];
            in.read(by);
            System.out.println(new String(by));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void zipfile(){
        File file4 = new File("FileTest/testzip.zip");
        try {
            ZipFile zipFile = new ZipFile(file4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
public class IOTest {
    public static void main(String[] args) throws IOException {
//        Ff file1 = new Ff();
//        file1.fff();
//        file1.zipfile();
      System.out.println(System.getProperty("file.encoding"));
    }
}
