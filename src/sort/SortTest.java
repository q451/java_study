package sort;

public class SortTest {
    public static void main(String[] args) {
        int []array = {98,32,1,5,15,62,28,34,6};
        System.out.println("原数组输出");
        for (int item:array){
            System.out.print(item+",");
        }

        SortTest sortTest = new SortTest();
        int []output = sortTest.maopao(array);

        System.out.println("冒泡排序后输出");
        for (int item:output){
            System.out.print(item+",");
        }
    }
    /*
    *冒泡排序
    */
    public int[] maopao(int[] a){
        if (a.length <= 1){
            return a;
        }
        for(int i =0; i < a.length-1; i++){
            for (int j =0; j < a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
