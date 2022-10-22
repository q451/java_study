package MapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"yxp");
        map.put(2,"xp");
        map.put(3,"yangxiaop");

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
        //常用方法
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
}
