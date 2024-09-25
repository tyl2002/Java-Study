package src.meijv;

public class meijv {
    public static void main(String[] args) {
        Weekday weekday = Weekday.SUN;
        System.out.println(weekday.dayValue);
        }
}
enum Weekday {
    SUN(10), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6);
    public final int dayValue;
    private Weekday(int dayValue){
        this.dayValue = dayValue;
    }
}
