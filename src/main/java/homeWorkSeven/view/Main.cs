using (homeWorkSeven.view);

using (homeWorkSeven.controller.ProductController);
using (homeWorkSeven.model.Water);
using (homeWorkSeven.model.WaterBuilder);

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Water water = WaterBuilder.getInstance().setName("Pepsi").setPrice(14.00).setVolume(0.5).build();
        ProductController.saveProduct(water);
        ProductController.getProduct();
    }
}
