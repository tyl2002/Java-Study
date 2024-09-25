package src.fanxing;

public class Pair<T, K> {
    private T first;
    private K last;
    public Pair(T first,K last){
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }

    public K getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(K last) {
        this.last = last;
    }
//    //静态方法应该和上述方法进行区分
//    public static <K> Pair<K> create(K first,K last){
//        return new Pair<K>(first,last);
//    }


}
