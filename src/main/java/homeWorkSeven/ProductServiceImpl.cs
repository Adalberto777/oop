
public class ProductServiceImpl : ProductService 
{



    public void SaveProduct(Product product) {}

    
    public void SaveProduct(Water water) { 
        try
        {
            StreamWriter sw = new StreamWriter("water.txt");
            sw.WriteLine(water.ToString());
            sw.Close();
        }
        catch (Exception)
        {
            Console.WriteLine("Exception: " + "Houston, we have a problem");
        }
        finally
        {
            Console.WriteLine("Executing finally block.");
        }
        }

    public void SaveProduct() 
    { 
        Console.WriteLine("Enter the name of the file");
    }

    public void GetProduct() {
        String line;
        try
        {
            StreamReader sr = new StreamReader("water.txt");
            line = sr.ReadLine();
            while (line != null)
            {
                Console.WriteLine(line);
                line = sr.ReadLine();
            }
            sr.Close();
            Console.ReadLine();
        }
        catch (Exception)
        {
            Console.WriteLine("Exception: " + "Houston, we have a problem");
        }
        finally
        {
            Console.WriteLine("Executing finally block.");
        }

        
    }
}

