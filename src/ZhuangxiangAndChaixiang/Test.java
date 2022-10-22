package ZhuangxiangAndChaixiang;
import FactoryPackage.FruitInterface;
class A implements FruitInterface {
    @Override
    public void eat() {
        System.out.println(333);
    }
}
public class Test {
    public static void main(String[] args) throws Exception{
        int i = 1;
        Integer Ig = new Integer(i);
        int temp = Ig.intValue();
        System.out.println(i+"  "+Ig+" "+temp);

        //字符串变基本类型
        String str = "123456";
        int i1 = Integer.parseInt(str);
        System.out.println(i1);

    }
}
