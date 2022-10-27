package test;

import java.util.Map;
import java.util.TreeMap;

abstract class c{
     public abstract void f();
     public void f1(){
         System.out.println("普通方法");
     }
}
class MapTest{
    public void f(){
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"2");
        map.put(2,"1");
        map.put(5,"5");
        map.put(4,"4");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public static void hhh(){
        System.out.println(1111);
    }
}
public class Test extends c{
    @Override
    public void f() {
        System.out.println("abstract function print");
    }

    @Override
    public void f1() {
//        super.f1();
        System.out.println("abstract class common function override");
    }

    public static void main(String[] args) {
        Test t = new Test();
        MapTest mapTest = new MapTest();
        MapTest.hhh();
        t.f();
        t.f1();
        mapTest.f();
    }
}
class cc{
    int []arr = new int[]{1,23,5,6};
    static char c = '1';
    static int num = c;

    public static void main(String[] args) {
        int count = 0;
        for(int i = 0;i < 100;i++)
        {
            count = ++count;
        }
        System.out.println("count = "+count);

    }
}
interface ii{
    void say();
    public abstract void a();
    final String HELLO = "HELLO  WORLD";
}

class ccc implements ii{
    @Override
    public void say() {

    }

    @Override
    public void a() {

    }

    public static void main(String[] args) {
        System.out.println(HELLO);
    }
}
