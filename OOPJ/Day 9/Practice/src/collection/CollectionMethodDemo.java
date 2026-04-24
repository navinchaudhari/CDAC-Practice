package collection;

import java.util.LinkedList;
import java.util.List;



public class CollectionMethodDemo {

   /* public static <T> void display(List<T> list){
        for (T s : list){
            System.out.println(s);
        }
    }*/

    public static void display(List<?> list){
        for (Object s : list){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Navin");
        list1.add("Sourabh");
        list1.add("MAhendra");
        list1.add("Omkar");

        display(list1);
    }
}
