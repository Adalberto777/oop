namespace homeWorkSeven
{
    public class ProductController <T , Product>
    {
        private static ProductService productService = new ProductServiceImpl();
        public static void saveProduct(Water water)
        {
            productService.saveProduct(water);
        }

        public static void getProduct()
        {
            productService.getProduct();
        }
    }
}