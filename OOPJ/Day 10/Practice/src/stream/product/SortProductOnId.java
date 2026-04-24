package stream.product;

import java.util.Comparator;

public class SortProductOnId implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.productId - o2.productId;
    }
}
