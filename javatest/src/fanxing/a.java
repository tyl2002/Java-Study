package src.fanxing;

import java.util.ArrayList;
import java.util.Arrays;

public class a {
    public static void main(String[] args) {
//        ArrayList<String> StringList1 = new ArrayList<String>();
//        StringList1.add("Hello");
//        System.out.println(StringList1);
        Person [] per = new Person[]{
                new Person("王五", 70),
                new Person("张", 90),
                new Person("李四", 80)

        };
        Arrays.sort(per);
        System.out.println(Arrays.toString(per));

        Pair<String,Integer> p = new Pair<String,Integer>("hello", 1);
    }
}

class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return this.name + "," + this.score;
    }
    public int compareTo(Person p) {
        int result =  this.score-p.score;
        if(result>0){
            return -1;
        }else if(result == 0){
            return 0;
        }else{
            return 1;
        }
    }
}
