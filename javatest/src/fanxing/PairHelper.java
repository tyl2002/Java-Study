package src.fanxing;

public class PairHelper {
    static int add(Pair<? extends Number,? extends Number> p){
        Number first = p.getFirst();
        Number last = p.getLast();
//        p.setFirst(new Integer(first.intValue()+100));
        return first.intValue()+last.intValue();
    }
}
