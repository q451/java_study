package StaticPackage;
class test{
    public static String n = "pxy";
    public static void f(){
        System.out.println("我是其他类的Static方法");
    }
}

class single{//单例模式实现，只实例化一个对象
    private static single s = new single();
    private single(){

    }
    public static single getInstance(){
        return s;
    }

    public void print(){
        System.out.println("hello");
    }
}
public class StaticTest {
    public static String name = "yxp";
    public static void say(){
        System.out.println("我是Static方法");
    }

    public static void main(String[] args) {
        say();
        System.out.println(name);
        test.f();
        System.out.println(test.n);

        single ts = single.getInstance();
        ts.print();
    }
}
