package homeWorkSeven.service;

import homeWorkSeven.model.Product;
import homeWorkSeven.model.Water;


public interface ProductService {
    void saveProduct(Product product);

    void saveProduct(Water water);

    void getProduct();
}
