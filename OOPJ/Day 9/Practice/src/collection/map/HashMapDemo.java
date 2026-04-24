package collection.map;

import java.util.*;
import java.util.function.BiConsumer;

public class HashMapDemo {

    static void display(Map<?, ?> map) {
//        Set<? extends Map.Entry<?, ?>> set = map.entrySet();
        for (Map.Entry<?, ?> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, Product> map = new HashMap<>();
        map.put(61, new Product(15, "TV", 12056));
        map.put(54, new Product(23, "Router", 15200));
        map.put(23, new Product(5, "Cooler", 50000));
        map.put(98, new Product(67, "Board", 25000));


        Set<Map.Entry<Integer, Product>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Product> e : entrySet) {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        Set<Integer> integers = map.keySet();
        for (Integer i : integers) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + map.size());
        map.remove(23, new Product(5, "Cooler", 50000));

       display(map);


    }
}
