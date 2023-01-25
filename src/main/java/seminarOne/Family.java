package seminarOne;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> bigFamily = new ArrayList<>();

    public boolean addToBigFamily(Person person){
        if (!bigFamily.contains(person)){
            bigFamily.add(person);
            return true;
        }
        return false;
    }


}
