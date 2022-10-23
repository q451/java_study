package algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Test_Day_7 {
    public static void main(String[] args) {
        int []nums = {0,1,0,13,12};
        int index = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }else{
                count ++;
            }
        }

        for(int j = nums.length;j>nums.length -count;j--){
            nums[j-1] = 0;
        }
        System.out.println(nums);
    }
}
