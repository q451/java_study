package collection;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String>  list1 = new LinkedList<>();
        List<String> list2 = new Vector<>();

        list.add("123");
        list.set(0,"321");

        System.out.println(list.get(0));
    }
}
