package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SetTest {
    public static void main(String[] args) {
        Set<People> set = new HashSet<>();
        set.add(new People("yxp",21));
        set.add(new People("pxy",22));
        set.add(new People("cxy",20));

        Iterator<People> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (People people:set){
            System.out.println(people);
        }
    }
}
