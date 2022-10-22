package algorithm;

public class Test_Day_4 {
    public static void main(String[] args) {
        //数组加一算法
        Test_Day_4 test_day_4 = new Test_Day_4();
        int []array = {1,2,9};
        for(int i = array.length-1;i>=0;i--){
            if(array[i] != 9){
                array[i]++;
                break;
            }else{
                array[i] = 0;
            }
        }
        for (int num:array){
            System.out.println(num);
        }
    }
}
