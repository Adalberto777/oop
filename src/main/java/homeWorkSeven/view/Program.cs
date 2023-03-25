using view;

namespace view
{
    public class Program 
    {
        public static void Main(String[] args) 
        {
            ProductController productController = new ProductController();
            Water water = WaterBuilder.getInstance().setName("Pepsi").setPrice(14.00).setVolume(0.5).build();
            ProductController.saveProduct(water);
            ProductController.getProduct();
        }
    }
}

