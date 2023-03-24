package homeWorkSix.service;

import homeWorkSix.model.Product;
import homeWorkSix.model.Water;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;

public class ProductServiceImpl implements ProductService{
    Logger logger= Logger.getAnonymousLogger();

    @Override
    public void saveProduct(Product product) {
    }

    @Override
    public void saveProduct(Water water) {
        try(FileWriter fileWriter = new FileWriter("water.txt")){
            fileWriter.write(water.toString());
        }catch (Exception e){
            logger.warning("Houston, we have a problem");
        }
    }

    @Override
    public void getProduct() {
        try(FileReader fileReader = new FileReader("water.txt")){
            int c;
            while ((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        }catch (Exception e){
            logger.warning("Houston, we have a problem");
        }
    }
}
