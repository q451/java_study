package math;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        Random random = new Random();
        char []code = {'a','b','b','d','A','B','C','D','1','2','3','4','5','6','7','8','9'};
        System.out.println(code.length);
        char []getCode = new char[6];
        for (int i =0; i<6; i++){
            int num = random.nextInt(code.length);
            getCode[i] = code[num];
        }
        System.out.println(getCode);
    }
}
