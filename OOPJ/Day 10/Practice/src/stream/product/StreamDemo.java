package stream.product;

import java.util.Collection;
import java.util.LinkedList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
    public static void display(Collection<?> collection) {
        System.out.println("-----------------------------------");
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Product> products = new LinkedList<>();

        System.out.println("Product sort on Product ID using comparator");
        products.add(new Product(15, "TV", 12056));
        products.add(new Product(67, "Board", 25000));
        products.add(new Product(23, "Router", 15200));
        products.add(new Product(5, "Cooler", 50000));
        products.add(new Product(67, "Board", 25000));
        System.out.println("Original Product List");
        display(products);

        //foreach
//        products.stream().forEach(p -> System.out.println(p));
//        products.stream().forEach(System.out::println);

       /* List<Product> productList = products.stream().filter(product -> product.price < 20000).toList();
        display(productList);*/

 /*       List<Product> list = Stream.concat(products.stream(), products.stream()).toList();
        display(list);*/


        /*List<String> productsName =
                products.stream().map(p -> p.name).collect(Collectors.toList());

        display(productsName);*/

     /*   List<Product> sortedProductList = products.stream().sorted().collect(Collectors.toList());
        display(sortedProductList);*/

       /* List<Product> list = products.stream().sorted(new SortProductOnId()).toList();
        display(list);*/

       /* List<Product> list = products.stream().sorted(new SortProductOnName()).toList();
        display(list);*/

        /*List<Product> list =
                products.stream().sorted(new SortProductOnPrice()).collect(Collectors.toList());
        display(list);*/

        System.out.println("Product list after adding 1000 in price");

//        List<Product> list = products.stream().peek(p -> p.price += 1000).toList();
//        List<Product> list = products.stream().peek(p -> p.productId += 1000).toList();
//        display(list);

        Optional<Product> max = products.stream().max(new SortProductOnPrice());
        System.out.println("Product Having Max Price: " + max);

        Product maxUsingReduce = products.stream().reduce(new Product(), (p1, p2) -> p1.price > p2.price ? p1 : p2);
        System.out.println("Product Having Max Price: " + maxUsingReduce);

        Optional<Product> min = products.stream().min(new SortProductOnPrice());
        System.out.println("Product Having Min Price: " + min);

        Optional<Product> reduce = products.stream().reduce((p1, p2) -> p1.price < p2.price ? p1 : p2);
        System.out.println("Product Having Lowest Price: " + reduce);

        Integer arr[] = {2, 5, 3, 8, 7};
        Optional<Integer> max1 = Stream.of(arr).max(Integer::compareTo);
        System.out.println(max1);


        Integer sum = Stream.of(arr).reduce(0, (i1, i2) -> i1 + i2);
        System.out.println("Sum: " + sum);


        System.out.println("HashSet: ");
        Set<Product> collect = products.stream().collect(Collectors.toCollection(HashSet::new));
        display(collect);

        System.out.println("TreeSet: ");
        Set<Product> collect2 = products.stream().collect(Collectors.toCollection(TreeSet::new));
        display(collect2);
    }
}
