package seminarOneR;

import java.util.ArrayList;
import java.util.Scanner;

public class HotVendingAutomate {
    public static HotWater newProduct(String name, double cost){
        HotWater hotWater = new HotWater(name, cost);
        return hotWater;
    }

    public static void initProducts(ArrayList<HotWater> hotWater) {
        Scanner in = new Scanner(System.in);
        String name = new String();
        double cost = 0;

        System.out.print("Enter name of the product: ");
        name = in.next();
        System.out.print("Enter cost of the product: ");
        cost = in.nextDouble();

        hotWater.add(newProduct(name, cost));

        System.out.println(hotWater);
    }
    public static void getProduct(ArrayList<HotWater> hotGoods) {
        Scanner in = new Scanner(System.in);
        String name = new String();

        System.out.print("Enter name of product: ");
        name = in.next();

        for (HotWater hotWater: hotGoods) {
            if (hotWater.getName().equals(name))
                System.out.printf("Cost of the %s - %f", hotWater.getName(), hotWater.getCost());
        }
    }
}
