package src.fanxing;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class main {
    public static void main(String[] args){
//        Class<InPair> clazz = InPair.class;
//        Type t = clazz.getGenericSuperclass();
//        if(t instanceof ParameterizedType){
//            ParameterizedType pt = (ParameterizedType) t;
//            Type[] types = pt.getActualTypeArguments();
//            Type firstType = types[0];
//            Class<?> typeClass = (Class<?>) firstType;
//            System.out.println(types);
//        }
        int sum = PairHelper.add(new Pair<Integer,Integer>(123,123));
        System.out.println(sum);
    }
}
