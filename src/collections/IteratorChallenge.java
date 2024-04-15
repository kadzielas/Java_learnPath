package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name) {
        this.name = name;
    }
}

public class IteratorChallenge {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
//Nie dziala iterator          Product product = new Product("Product: " + i);
            products.add(new Product("Product: " + i));

        }

        System.out.println(" ");

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product1 = iterator.next();
            System.out.println(product1.name);
        }

    }
}
