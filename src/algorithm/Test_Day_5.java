package algorithm;

import java.util.Arrays;

public class Test_Day_5 {
    public static void main(String[] args) {
        String s = "a man a plan a canal panama";
        String s1 = s.replaceAll(" ","");
        System.out.println(s1);
        Character.isLetterOrDigit(s.charAt(2));
        StringBuffer sbf = new StringBuffer(s1);
        char []a = s.toCharArray();
        sbf.reverse();
        char []b = sbf.toString().toCharArray();
        System.out.println(Arrays.equals(a,b)) ;
    }
}
