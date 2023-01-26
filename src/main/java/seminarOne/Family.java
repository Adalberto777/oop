package seminarOne;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> bigFamily = new ArrayList<>();

   public void addToBigFamily(Person person){
        if (!bigFamily.contains(person)){
            bigFamily.add(person);
        }
   }

   public boolean isFamily(Person person){
       if (bigFamily.contains(person)){
           return true;
       }
       return false;
   }



}

