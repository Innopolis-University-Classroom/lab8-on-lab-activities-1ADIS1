package Test.SOLID;

import java.util.List;

public class Cart {
    List<Product> products;
    double totals;
    String token;

    void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }
}
