package pattern;

import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String str = "123456";
        String email = "1393371859@qq.com";
        String pat = "[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
        if(Pattern.compile("[0-9]+").matcher(str).matches()){
            System.out.println("数字组成");
        }else {
            System.out.println("不是数字组成");
        }
        if (Pattern.compile(pat).matcher(email).matches()){
        System.out.println("this is email");
        }else{
            System.out.println(0000);
        }
    }
}
