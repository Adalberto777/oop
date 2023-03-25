using service;

namespace service
{
    public class ProductServiceImpl : ProductService 
    {
    
    Logger logger= Logger.getAnonymousLogger();

    
        public void SaveProduct(Product product) {}

        
        public void SaveProduct(Water water) { 
            try
            {
                StreamWriter sw = new StreamWriter("water.txt");
                sw.WriteLine(water.toString());
                sw.Close();
            }
            catch(Exception e)
            {
                logger.warning("Houston, we have a problem");
            }
            finally
            {
                Console.WriteLine("Executing finally block.");
            }
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
            catch(Exception e)
            {
                logger.warning("Houston, we have a problem");
            }
            finally
            {
                Console.WriteLine("Executing finally block.");
            }

            
        }
    }
}
