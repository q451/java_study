package algorithm;
public class Test_Day_10 {
    public static void main(String[] args) {
        String [] strs = {"fllour","float","flout"};
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(ans) != 0)
                ans = ans.substring(0, ans.length() - 1);
                System.out.println(ans.length()-1);
        }
        String s = "hello";
        System.out.println(s.substring(0,s.length()-1));
    }
}
