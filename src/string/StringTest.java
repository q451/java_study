package string;

class Test{
    public void Say(){
        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("yxp");
//        stringBuffer.indexOf("y");
//        stringBuffer.insert(0,"name");
        System.out.println(stringBuffer.append("yxp"));
        System.out.println(stringBuffer.indexOf("y"));
        System.out.println(stringBuffer.insert(0,"name"));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.substring(0,1));
    }
}
public class StringTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.Say();
    }
}
