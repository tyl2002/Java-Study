package src.main;
import src.duotai.*;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

public class main {
    public static void main(String[] args) throws UnsupportedEncodingException, IntrospectionException {
//        Student s = new Student("tyl1",22,"4058");
//        Person q = new Student("tyl111",22,"4058");
//        q.run();
        String s = "hello";
        String s1 = "Hello";
//        System.out.println(s.equals(s1));
//        System.out.println(s.equalsIgnoreCase(s1));
//        System.out.println(s.contains("h"));
        //是否包含子串
        s.contains("h");
        s.indexOf("l");//第一次出现‘l’的索引
        s.lastIndexOf("l");//最后一次出现‘l’的索引
        s.startsWith("h");//是否以‘h’开头
        s.endsWith("o");//是否以‘o’结尾
        //去除收尾空白
        s = "\tHello   ";
//        System.out.println(s);
//        System.out.println(s.trim());//Hello
        s = "\u3000Hello\u3000";
//        System.out.println(s.strip());// "Hello"
//        System.out.println(s.stripLeading());//"Hello　"
//        System.out.println(s.stripTrailing());//"　Hello"
//        System.out.println(s.stripIndent());//"Hello"
//        System.out.println("".isEmpty());//"true"
//        System.out.println(" ".isEmpty());//"false"
//        System.out.println("".isBlank());//"true"
//        System.out.println(" ".isBlank());//"true"
//        String[] names = new String[] {"tyl","dyy"};
//        p.setNames(names);
//        System.out.println(p.getAge(2024));
//        System.out.println(p.getName());
//        System.out.println(Arrays.toString(p.getNames()));
//        names[0] = "tyl1";
//        System.out.println(Arrays.toString(p.getNames()));
//        String[] arr = {"t","y","l"};
//        String str = String.join("***",arr);
//        System.out.println(str);//t***y***l
//        s = "Hi %s, your score is %.3f! %d %x";
//        System.out.println(String.format(s,"tyl",100.000000000,10,156));// Hi tyl, your score is 100!
//        System.out.println(s.formatted("tyl",100.000000000,10,156));

//        String.valueOf(133);
//        String.valueOf(12.21);
//        String.valueOf(true);
//        String.valueOf(new Object());
//        System.out.println(String.valueOf(new Student("tyl",12,"asd")));
//        int n1 = Integer.parseInt("123");
//        System.out.println(n1);//123
//        double n2 = Double.parseDouble("12.21");
//        System.out.println(n2);//12.21
//        boolean n3 = Boolean.parseBoolean("false");
//        System.out.println(n3);//false
//        System.out.println(Integer.getInteger("java.version"));//null
//        char[] arr = "tyl".toCharArray();
//        String str = new String(arr);
//        arr[0] = 'a';
//        System.out.println(str);//tyl
//        int[] scores = new int[] {100,50,47};
//        Score score = new Score(scores);
//        score.print();
//        scores[1] = 100;
//        score.print();
//        byte [] b1 = "tyl".getBytes();
//        System.out.println(new String(b1));
//        byte [] b2 = "tyl".getBytes("UTF-8");
//        System.out.println(new String(b2));
//        byte [] b3 = "tyl".getBytes("GBK");
//        System.out.println(new String(b3));
//        byte [] b4 = "tyl".getBytes();
//        System.out.println(b1.toString());

//        StringBuilder sb = new StringBuilder(1024);
//        for(int i = 0;i<100;i++){
//            sb.append("tyl");
//            sb.append(i);
//            sb.append("\n");
//        }
//        sb.append("t").append("y").append("l").insert(0,"Hello ");
//        System.out.println(sb); //Hello tyl

//        String[] fields = { "name", "position", "salary" };
//        String table = "employee";
//        String insert = buildInsertSql(table, fields);
//        System.out.println(insert);
//        String a = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
//        System.out.println(a.equals(insert) ? "测试成功" : "测试失败");

//        String[] names = new String[]{"Bob", "Alice", "Grace"};
//        var sj =new StringJoiner(",","Hello ","!");
//        for(String name:names){
//            sj.add(name);
//        }
//        System.out.println(sj.toString());

//        String[] fields = { "name", "position", "salary" };
//        String table = "employee";
//        String select = buildSelectSql(table, fields);
//        System.out.println(select);
//        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");

//        int i = 100;
//        Integer n1 = new Integer(i);
//        Integer n2 = Integer.valueOf(i);
//        Integer n3 = Integer.valueOf("100");
//        System.out.println(n3);

//        BeanInfo info = Introspector.getBeanInfo(Person.class);
//        for(PropertyDescriptor pd:info.getPropertyDescriptors()){
//            System.out.println(pd.getName());
//            System.out.println("  " + pd.getReadMethod());
//            System.out.println("  " + pd.getWriteMethod());
//        }

    }
//    static String buildInsertSql(String table, String[] fields) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("INSERT INTO ").append(table).append(" (").append(String.join(", ",fields)).append(") VALUES ")
//                .append("(?, ?, ?)");
//        // TODO:
//        return sb.toString();
//    }
//    static String buildSelectSql(String table, String[] fields) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(" FROM ").append(table);
//        StringJoiner sj = new StringJoiner(", ","SELECT ",sb);
//        for(String field:fields){
//            sj.add(field);
//        }
//        return sj.toString();
//    }
}
abstract class Person{
    protected int birth;
    protected String name;
    protected String[] names;
    public Person (String name,int birth){
        this.name = name;
        this.birth = birth;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names){
        this.names = names;
    }
    public int getBirth(){
        return this.birth;
    }
    public void setBirth(int birth){
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(int year){
        return calcAge(year);
    }
    private int calcAge(int currentYear){
        return currentYear-this.getBirth();
    }
    public abstract void run();
    public static void setName(){
        System.out.println("setName");
    }
}
class Student extends Person{
    protected String major;
    private int grade;
    public Student(String name,int birth,String major){
        super(name,birth);
        this.major = major;
    }

    public String hello(){
        return STR."hello\{name}";
    }
    public String toMyString(){
        return STR."\{getClass().getSimpleName()}  name=\{name}  age=\{getAge(2024)}  major=\{major}";
    }
    @Override
    public void run(){
        System.out.println("name:"+name);
    }

}
class Score{
    private int[] scores;
    public Score(int[] scores){
        this.scores = Arrays.copyOf(scores,scores.length);
    }
    public void print(){
        System.out.println(Arrays.toString(this.scores));
    }
}
