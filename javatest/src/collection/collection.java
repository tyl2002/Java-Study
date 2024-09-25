package src.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collection {
    public static void main(String[] args){
//        List<String> list = new ArrayList<>();
//        list.add("tyl");
//        list.add("dyy");
////        System.out.println(list);
////        System.out.println(list.size());
////        System.out.println(list.get(1));
//        List<String> list1 = List.of("1","2","3");//不接受NUll
////        System.out.println(list1);
////        for(Iterator<String> it = list.iterator();it.hasNext();){
////            System.out.println(it.next());//it.hasNext()判断是否含有下一个元素
////        }
////        for(String s:list){//简化上述
////            System.out.println(s);
////        }
//        Object[] array = list.toArray();
//        for(Object s:array){
//            System.out.println(s);
//        }
//        String[] array1 = list.toArray(new String[list.size()]);
//        for(String s:array1){
//            System.out.println(s);
//        }
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        Collections.shuffle(list);
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    static int findMissingNumber(int start, int end, List<Integer> list) {
        Integer missing = null;
        for(int i = start;i<=end;i++){
            if(!list.contains(i)){
                missing = i;
            }
        }
        return missing;
    }
}
