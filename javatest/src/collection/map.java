package src.collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String... args) {
//        Person p = new Person("t","yl",22);
        Map<String,Integer> map = new HashMap<>();
//        map.put("tyl",p);//将tyl与p关联
//        Person target = map.get("tyl");
//        System.out.println(target == p);
//        System.out.println(target.age);
//        Person another = map.get("bob");
//        System.out.println(another);
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);
        for(String s:map.keySet()){
            System.out.println(map.get(s));
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
