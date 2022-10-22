package FactoryPackage;
//工厂
class A implements FruitInterface{
    @Override
    public void eat() {
        System.out.println(111);
    }
}

class B implements FruitInterface{
    @Override
    public void eat() {
        System.out.println(222);
    }
}

class Factorys{
    public static FruitInterface getInstance(String ClassName){
        FruitInterface f =null;
        if ("A".equals(ClassName)){
            f = new A();
        }
        if ("B".equals(ClassName)){
            f = new B();
        }
        return f;
    }
}
public class FactoryTest {
    public static void main(String[] args) {
        Factorys.getInstance("A").eat();

    }
}
