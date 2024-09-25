package src.reflaction;

import org.apache.commons.logging.LogFactory;

public class reflection {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class cla = String.class;
//        System.out.println(cla);
//        Integer s = 1;
//        Class cla1 = s.getClass();//从实例变量获得
//        Class cla2 = Class.forName("java.lang.String");
//        System.out.println(cla1  == cla2);
//        printClassInfo("".getClass());
//        LogFactory factory = null;
//        if(isClassPresent("org.apache.commons.logging")){
//            factory = createLog4j();
//        }else{
//            factory = createJdkLog();
//        }



    }
    static boolean isClassPresent(String name) {
        try{
            Class.forName(name);
            return true;
        }catch(Exception e){
            return false;
        }


    }
    static void printClassInfo(Class cls){
        System.out.println("Class name: "+cls.getName());
        System.out.println("Simple name: "+cls.getSimpleName());
        if(cls.getPackage()!=null){
            System.out.println("Package name:"+cls.getPackage().getName());
        }
        System.out.println("is Interface:"+cls.isInterface());

    }
}
