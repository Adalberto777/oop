using view;
namespace homeWorkSeven{
    public class Program 
    {
    public static void Main(String[] args) 
    {
        ProductController productController = new ProductController();
        Water water = WaterBuilder.GetInstance().SetName("Pepsi").SetPrice(14.00).SetVolume(0.5).Build();
        ProductController.SaveProduct(water);
        ProductController.GetProduct();
        
    }      
    
    }    
}

