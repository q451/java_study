package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_Day_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;

        Test_Day_1 test_day_1 = new Test_Day_1();
        int[] Arr = test_day_1.twoSum(nums,target);
        Iterator it = Arrays.stream(Arr).iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
