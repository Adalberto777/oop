namespace homeWorkSeven{
    public class ProductController 
{
    private static ProductService productService = new ProductServiceImpl();

    public static void SaveProduct()
    {
        productService.SaveProduct();
    }
    public static void SaveProduct(Water water)
    {
        productService.SaveProduct(water);
    }

    public static void GetProduct()
    {
        productService.GetProduct();
    }
}

}
