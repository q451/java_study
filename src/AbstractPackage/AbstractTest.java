package AbstractPackage;
abstract class Test{
    public void Say(){
        System.out.println("抽象类中的普通方法");
    }
    public abstract void AbstractSay();
}

class A extends Test{
    @Override
    public void AbstractSay() {
        System.out.println("抽象类中的抽象方法");
        super.Say();
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        A a = new A();
        a.AbstractSay();
    }
}
