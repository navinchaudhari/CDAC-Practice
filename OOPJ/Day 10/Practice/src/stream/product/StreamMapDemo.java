package stream.product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamMapDemo {
    public static void main(String[] args) {
        Map<Integer, Product> map = new TreeMap<>();
        map.put(61, new Product(15, "TV", 12056.78f));
        map.put(54, new Product(23, "Router", 15200));
        map.put(23, new Product(5, "Cooler", 50000));
        map.put(98, new Product(67, "Board", 12056.65f));

        for (Map.Entry<Integer, Product> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

        Map<Integer, Product> linkedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(new SortProductOnPrice())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (p1, p2) -> p1,
                LinkedHashMap::new
        ));

        System.out.println("Value based Sorted Map");
        for (Map.Entry<Integer, Product> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

    }
}
