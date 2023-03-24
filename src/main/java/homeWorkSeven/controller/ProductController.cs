using (homeWorkSeven.controller);

using (homeWorkSeven.model.Product);
using (homeWorkSeven.model.Water);
using (homeWorkSeven.service.ProductService);
using (homeWorkSeven.service.ProductServiceImpl);

public class ProductController <T , Product>{
    private static ProductService productService = new ProductServiceImpl();
    public static void saveProduct(Water water){
        productService.saveProduct(water);
    }

    public static void getProduct() {
        productService.getProduct();
    }
}
