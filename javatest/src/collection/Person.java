package src.collection;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;



    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
//    public boolean equals(Object o){
//        if(o instanceof Person p){
//            boolean nameEquals = false;
//            if(this.name == null &&p.name == null){
//                nameEquals = true;
//            }
//            if(this.name!=null){
//                nameEquals = this.name.equals(p.name);
//            }
//            return nameEquals && this.age == p.age;
//        }
//        return false;
//    }
//public boolean equals(Object o){
//    if(o instanceof Person p){
//        return Objects.equals(this.firstName,p.firstName)&& Objects.equals(this.lastName,p.lastName)&& this.age == p.age;
//    }
//    return false;
//}
}
