using service;

namespace service
{
    public interface ProductService
    {
        void SaveProduct(Product product);

        void SaveProduct(Water water);

        void GetProduct();
    }
}

