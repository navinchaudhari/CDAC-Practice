package stream.product;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class ProductDemo {


    public static void display(Collection<?> collection){
        System.out.println("-----------------------------------");
        for (Object o : collection){
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>(new SortProductOnId());

        System.out.println("Product sort on Product ID using comparator");
        products.add(new Product(15,"TV",12056));
        products.add(new Product(23,"Router",15200));
        products.add(new Product(5,"Cooler",50000));
        products.add(new Product(67,"Board",25000));
        display(products);

        Set<Product> products1 = new TreeSet<>(new SortProductOnName());
        System.out.println("Product sort on Product Name using comparator");
        products1.add(new Product(15,"TV",12056));
        products1.add(new Product(23,"Router",15200));
        products1.add(new Product(5,"Cooler",50000));
        products1.add(new Product(67,"Board",25000));
        display(products1)

        ;Set<Product> products3 = new TreeSet<>(new SortProductOnPrice());
        System.out.println("Product sort on Product Price using comparator");
        products3.add(new Product(15,"TV",12056));
        products3.add(new Product(23,"Router",15200));
        products3.add(new Product(5,"Cooler",50000));
        products3.add(new Product(67,"Board",25000));
        display(products3);

    }
}
