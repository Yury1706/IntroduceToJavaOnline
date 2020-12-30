package BasicsOfOOP.Payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    double totalPrice = 0;
    List<Product> productList = new ArrayList<>();

    public void pay() {
        System.out.printf("Общая стоимость за товары %.2f оплачена.", totalPrice);
    }

    public void showCheck() {
        productList.forEach(System.out::println);
        System.out.printf("Итого: %.2f", totalPrice);
        System.out.println();
    }

    public class Product {
        String name;
        int quantity;
        double price;

        public Product(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            productList.add(this);
            totalPrice += (quantity*price);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}';
        }
    }
}
