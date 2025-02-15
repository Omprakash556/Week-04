package Collection.common_problem.implementshoppingcart;

import java.util.*;

public class ImplementShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // Stores product prices (unordered)
    private Map<String, Double> cartOrder = new LinkedHashMap<>(); // Maintains insertion order
    private TreeMap<Double, String> sortedCart = new TreeMap<>(); // Sorts by price
    public static void main(String[] args) {
        ImplementShoppingCart cart = new ImplementShoppingCart();

        cart.addProduct("Skirt", 500);
        cart.addProduct("Top", 300);
        cart.addProduct("Headphones", 2000);
        cart.addProduct("Mouse", 1500);
        cart.addProduct("Speaker", 2500);

        cart.displayCartOrder();
        cart.displaySortedCart();
        cart.displayAllProducts();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cartOrder.put(product, price);
        sortedCart.put(price, product);
    }

    public void displayCartOrder() {
        System.out.println("\nCart Items (Order of Addition):");
        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " - ₹" + entry.getValue());
        }
    }

    public void displaySortedCart() {
        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println(entry.getValue() + " - ₹" + entry.getKey());
        }
    }

    public void displayAllProducts() {
        System.out.println("\nAll Products (Unordered):");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " - ₹" + entry.getValue());
        }
    }
}

