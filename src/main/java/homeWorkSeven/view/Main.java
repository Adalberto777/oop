package homeWorkSeven.view;

import homeWorkSeven.controller.ProductController;
import homeWorkSeven.model.Water;
import homeWorkSeven.model.WaterBuilder;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Water water = WaterBuilder.getInstance().setName("Pepsi").setPrice(14.00).setVolume(0.5).build();
        ProductController.saveProduct(water);
        ProductController.getProduct();
    }
}
