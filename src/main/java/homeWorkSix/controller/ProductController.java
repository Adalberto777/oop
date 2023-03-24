package homeWorkSix.controller;

import homeWorkSix.model.Product;
import homeWorkSix.model.Water;
import homeWorkSix.service.ProductService;
import homeWorkSix.service.ProductServiceImpl;

public class ProductController <T extends Product>{
    private static ProductService productService = new ProductServiceImpl();
    public static void saveProduct(Water water){
        productService.saveProduct(water);
    }

    public static void getProduct() {
        productService.getProduct();
    }
}
