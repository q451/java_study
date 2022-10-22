package digui;

public class DiguiTest {
    public static void main(String[] args) {
        DiguiTest diguiTest = new DiguiTest();
        int f1 = diguiTest.di(3);
        System.out.println(f1);

        int f2 = diguiTest.f(3);
        System.out.println(f2);
    }
    //求阶乘
    public int di(int n){
        if (n == 1){
            return 1;
        }
        return n*di(n-1);
    }
    //斐波那契数列
    int f (int n){
        if (n == 0 || n == 1){
            return n;
        }
        return f(n-1)+f(n-2);
    }
}
