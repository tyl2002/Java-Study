import java.util.*;

public class Hello {
    public void main(String[] args) {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
        List list =new ArrayList();
        Collection coll =list;

    }

    public static void boole1() {
        int x = 100;
        int n = x > 0 ? x : -x;
        System.out.println(n);
    }

    public static void String1() {
        int a = 72;
        int b = 105;
        int c = 65281;
        String s = "" + a + b + c;
        System.out.println(s);
    }

    public static void printf1() {
        double x = 3.1415926;
        System.out.printf("%d\n", x);
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.nextLine();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("姓名：" + name + "\n年龄:" + age);
    }

    public static void scannertest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入上次成绩");
        double s1 = scanner.nextDouble();
        System.out.println("请输入本次成绩");
        double s2 = scanner.nextDouble();
        double up = (s2 - s1) / s1;
        System.out.printf("提升了%.2f%%", up * 100);
    }

    public static void if1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入BMI");
        double BMI = scanner.nextDouble();
        if (BMI < 18.5) {
            System.out.printf("体重过轻");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.printf("体重正常");
        } else if (BMI >= 25 && BMI <= 28) {
            System.out.printf("体重过重");

        } else if (BMI >= 28 && BMI <= 32) {
            System.out.printf("体重肥胖");

        } else if (BMI >= 32) {
            System.out.printf("非常肥胖");

        }
    }

    public static void switch1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("石头剪刀布");
        System.out.println("1.石头");
        System.out.println("2.剪刀");
        System.out.println("3.布");
        System.out.println("玩家1选择");
        int p1 = scanner.nextInt();
        System.out.println("玩家2选择");
        int p2 = scanner.nextInt();
        switch (p1) {
            case 1 -> {
                switch (p2) {
                    case 1 -> System.out.printf("平局");
                    case 2 -> System.out.printf("玩家1胜");
                    case 3 -> System.out.printf("玩家2胜");
                }

            }
            case 2 -> {
                switch (p2) {
                    case 1 -> System.out.printf("玩家2胜");
                    case 2 -> System.out.printf("平局");
                    case 3 -> System.out.printf("玩家1胜");
                }
            }
            case 3 -> {
                switch (p2) {
                    case 1 -> System.out.printf("玩家1胜");
                    case 2 -> System.out.printf("玩家2胜");
                    case 3 -> System.out.printf("平局");
                }

            }
            default -> System.out.printf("输入错误");
        }
    }
    public static void while1(){
        int n=1;
        int sum=0;
        while (n<100){
            sum=sum+n;
            n=n+1;
        }
        System.out.printf("1到100的和为%d",sum);
    }
    public static void for1(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.printf("1到100的和为%d",sum);
    }
    public static void foreach(){
    int[] ns={1,2,3,4,5,6};
    int sum=0;
    for (int n:ns){
        sum=sum+n;
    }
    System.out.println(sum);
    }
    public static void sort() {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        for (int i = 0; i < ns.length-1;i++){
            for (int j = 0; j < ns.length-i-1;j++){
                if(ns[j] < ns[j+1]){
                    int tem;
                    tem=ns[j];
                    ns[j]=ns[j+1];
                    ns[j+1]=tem;

                }
            }

        }
        System.out.println(Arrays.toString(ns));
    }
    public static void sort1() {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        Arrays.sort(ns);
        for(int i=0;i<ns.length/2;i++){
            int tep;
            tep=ns[i];
            ns[i]=ns[ns.length-i-1];
            ns[ns.length-i-1]=tep;
        }
        System.out.println(Arrays.toString(ns));
    }
    public static void sort2() {
        int[][] scores = {
            { 82, 90, 91 },
            { 68, 72, 64 },
            { 95, 91, 89 },
            { 67, 52, 60 },
            { 79, 81, 85 },
    };
        double[] avg=new double[scores.length];
        // TODO:
        for(int i=0;i<scores.length-1;i++){
            int sum=1;
            for (int j=0;j<scores[i].length-1;j++){
                sum=sum+scores[i][j];
            }
            double avg1=sum/3;
            avg[i]=avg1;
        }
        System.out.println(Arrays.toString(avg));
    }
    public static void  Average() {
            // 用二维数组表示的学生成绩:
            int[][] scores = {
                    { 82, 90, 91 },
                    { 68, 72, 64 },
                    { 95, 91, 89 },
                    { 67, 52, 60 },
                    { 79, 81, 85 },
            };
            // TODO:
            //请计算所有学生的平均分
            //计算每个学生的总分
            double[] stuAvg=new double[scores.length];
            for(int i=0;i<=scores.length-1;i++){
                double sum=0;
                for(int n:scores[i]){
                    sum+=n;
                }
                stuAvg[i]=sum/3;
            }
            double stuSum=0;
            double average = 0;
            for(double  n:stuAvg){
                stuSum+=n;
            }
            average=stuSum/5;
            System.out.println(average);
            System.out.println(Arrays.toString(stuAvg));
            if (Math.abs(average - 77.733333) < 0.000001) {
                System.out.println("测试成功");
            } else {
                System.out.println("测试失败");
            }

        }
        public static void Average1(){
            // 用二维数组表示的学生成绩:
            int[][] scores = {
                    { 82, 90, 91 },
                    { 68, 72, 64 },
                    { 95, 91, 89 },
                    { 67, 52, 60 },
                    { 79, 81, 85 },
            };
            // TODO:
            double average = 0;
            double[] stuAvg = new double[5];
            for(int i = 0;i<scores.length;i++){
                double sum = 0;
                for(int n : scores[i]){
                    sum += n;
                }
                stuAvg[i] = sum/3;
                System.out.println(stuAvg[i]);
            }

            double sum1 = 0;
            for( double n : stuAvg){
                sum1 += n;
            }
            average = sum1/5;

            System.out.println(average);

            if (Math.abs(average - 77.733333) < 0.000001) {
                System.out.println("测试成功");
            } else {
                System.out.println("测试失败");
            }
        }
    class City {
        public String name;
        public double latitude;
        public double longitude;
    }

}
