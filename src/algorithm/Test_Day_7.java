package algorithm;
public class Test_Day_7 {
    public static void main(String[] args) {
        String s1 = "words and 987";
        String s = s1.replaceAll(" ","");
        char []a = s.toCharArray();
        for(int i =0;i<a.length;i++){
            if(Character.isLetter(a[i])){
                a[i] = ' ';
            }
        }
        String s2 = new String(a);
        String s3 = s2.replaceAll(" ","");
        int num = Integer.parseInt(s3);
        System.out.println(num);
    }
}
