package algorithm;

public class Test_Day_9 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2},
                {3,4}
        };
        int length = matrix.length;
        //因为是对称的，只需要计算循环前半行即可
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = matrix[i][j];
                int m = length - j - 1;
                int n = length - i - 1;
                matrix[i][j] = matrix[m][i];
                matrix[m][i] = matrix[n][m];
                matrix[n][m] = matrix[j][n];
                matrix[j][n] = temp;
            }
        }
        for (int i =0;i<matrix.length;i++){
            for (int j =0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
