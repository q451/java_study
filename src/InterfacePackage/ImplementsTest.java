package InterfacePackage;

public class ImplementsTest implements InterfaceTest{
    @Override
    public void Say() {
        System.out.println("hello");
    }

    @Override
    public void test() {
        System.out.println(1111);
    }

    public static void main(String[] args) {
        ImplementsTest implementsTest = new ImplementsTest();
        implementsTest.Say();
    }
}
