package algorithm;

import java.util.Arrays;

public class Test_Day_3 {
    public static void main(String[] args) {
        Test_Day_3 test_day_3 = new Test_Day_3();
        String s = "haa";
        String t = "ahh";
        test_day_3.isAnagram(s,t);
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] letterCount = new int[26];
        //统计字符串s中的每个字符的数量
        for (int i = 0; i < s.length(); i++){
            letterCount[s.charAt(i) - 'a']++;
            System.out.println(s.charAt(i)-'a');
        }

        //减去字符串t中的每个字符的数量
        for (int i = 0; i < t.length(); i++)
            letterCount[t.charAt(i) - 'a']--;
        //如果数组letterCount的每个值都是0，返回true，否则返回false
        for (int count : letterCount)
            if (count != 0)
                return false;
        return true;
    }
}
