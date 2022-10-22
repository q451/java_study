package arrayPackage;

import java.util.ArrayList;
import java.util.Iterator;

class test{
    private String userid;
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Array1 {
    public static void main(String[] args) {
        test t = new test();
        ArrayList<test> arrayList = new ArrayList<test>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        t.setUserid("19301105");
        t.setPassword("987654");
        System.out.println(t.getUserid());
        arrayList.add(t);

        arrayList1.add("110");
        arrayList1.add("120");
        System.out.println(arrayList1.size());

        Iterator<String> it = arrayList1.iterator();
        if (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
