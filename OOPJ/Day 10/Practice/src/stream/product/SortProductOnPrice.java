package stream.product;

import java.util.Comparator;

public class SortProductOnPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Float.compare(o1.price,o2.price);
    }
}
