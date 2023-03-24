package homeWorkSeven.controller;

import homeWorkSeven.model.Product;
import homeWorkSeven.model.Water;
import homeWorkSeven.service.ProductService;
import homeWorkSeven.service.ProductServiceImpl;

public class ProductController <T extends Product>{
    private static ProductService productService = new ProductServiceImpl();
    public static void saveProduct(Water water){
        productService.saveProduct(water);
    }

    public static void getProduct() {
        productService.getProduct();
    }
}
