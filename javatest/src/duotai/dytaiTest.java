package src.duotai;

public class dytaiTest {
    public static void main(String[] args) {
        Income[] incomes =new Income[] {
                new Salary(10000),
                new StateCouncilSpecialAllowance(7000)
        };
        System.out.println("税收总额为："+totalTax(incomes));
    }
    public static double totalTax(Income[] incomes){
        double total =0;
        for(Income income:incomes){
            total = total+income.getTax();
        }
        return total;
    }
}
interface Income{
    double getTax();
}
class Salary implements Income{
    private double income;
    public Salary(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        if(income>=5000){
            income = income-5000;
        }
        return income*0.2;
    }
}
class StateCouncilSpecialAllowance implements Income{
    private double income;
    public StateCouncilSpecialAllowance(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        return 0;
    }
}
