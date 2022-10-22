package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_Day_2 {
    public static void main(String[] args) {
        String s = "abcabcssbb";
        Test_Day_2 test_day_1 = new Test_Day_2();
        test_day_1.lengthOfLongestSubstring(s);
    }
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()<=0 ){
            return 0;
        }
        char[] str = s.toCharArray();
        int n = s.length();
        int[] last = new int[128];
        int start = 0;
        int result = 0;
        for(int i =0; i<n;i++){

        }
        return result;
    }
}
