package homeWorkSix.service;

import homeWorkSix.model.Product;
import homeWorkSix.model.Water;


public interface ProductService {
    void saveProduct(Product product);

    void saveProduct(Water water);

    void getProduct();
}
