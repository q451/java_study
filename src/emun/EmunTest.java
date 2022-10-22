package emun;
class emun<T>{
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
public class EmunTest {
    public static void main(String[] args) {
        emun<String> emun = new emun<String>();
        emun.setVal("name");
        System.out.println(emun.getVal());
    }
}
