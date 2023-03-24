using (homeWorkSeven.service);

using (homeWorkSeven.model.Product);
using (homeWorkSeven.model.Water);


public interface ProductService {
    void saveProduct(Product product);

    void saveProduct(Water water);

    void getProduct();
}
