package src.collection;

import java.util.ArrayList;
import java.util.List;

public class list{
    public static void main(String[] args)
    {
        List<String> list =List.of("A","B");
        System.out.println(list.contains(new String("A")));//true
//        List<Person> p = List.of(new Person(null,""));
//        System.out.println(p.contains(new Person(null,21)));//false
    }
}

