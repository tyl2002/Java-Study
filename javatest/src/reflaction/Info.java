package src.reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Info {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Object p = new Person("tyl");//创建实例
        Student stu = new Student("tyl111");
        Class c = p.getClass();//获取类
        Field f = c.getDeclaredField("name");//获取字段信息
        Object value = f.get(p);//获得value
        System.out.println(value);
        f.set(p,"tyl1");
//        System.out.println(f.get(p));


        Class stdClass = Student.class;
//        System.out.println(stdClass.getMethod("setScore",int.class));//public void src.reflaction.Student.setScore(int)
//        System.out.println(stdClass.getMethod("getScore"));//public int src.reflaction.Student.getScore()
//        System.out.println(stdClass.getDeclaredMethod("setGrade",int.class));//private void src.reflaction.Student.setGrade(int)

        Method m = stdClass.getMethod("setScore",int.class);
        Method m1 = stdClass.getMethod("getScore");

        m.invoke(stu,100);
        m1.invoke(stu);

        Constructor cons1 = c.getConstructor(String.class);

        Person p1 = (Person) cons1.newInstance("tyl3");
        System.out.println(p1);



    }
}

class Student extends Person{
    public int score;
    public int grade;

    public Student(String name) {
        super(name);
    }

    public int getScore() {
        System.out.println(this.score);
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    private void setGrade(int grade) {
        this.grade = grade;
    }
}
class Person{
    public String name;


    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}