package seminarOneR;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingAutomat {

    public static Product newProduct(String name, double cost){
        Product product = new Product(name, cost);
        return product;
    }

    public static void initProducts(ArrayList<Product> goods) {
        Scanner in = new Scanner(System.in);
        String name = new String();
        double cost = 0;

        System.out.print("Enter name of the product: ");
        name = in.next();
        System.out.print("Enter cost of the product: ");
        cost = in.nextDouble();

        goods.add(newProduct(name, cost));

        System.out.println(goods);
    }
    public static void getProduct(ArrayList<Product> goods) {
        Scanner in = new Scanner(System.in);
        String name = new String();

        System.out.print("Enter name of product: ");
        name = in.next();

        for (Product product: goods) {
            if (product.getName().equals(name))
                System.out.printf("Cost of the %s - %f", product.getName(), product.getCost());
        }
    }
}
