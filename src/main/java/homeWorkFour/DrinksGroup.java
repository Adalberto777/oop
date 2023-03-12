package homeWorkFour;


import java.util.ArrayList;
import java.util.Iterator;

public class DrinksGroup implements Iterable<Drinks>{
    public ArrayList<Drinks> getDrinksGroup() {
        return drinksGroup;
    }
    public void setDrinksGroup(ArrayList<Drinks> drinksGroup) {
        this.drinksGroup = drinksGroup;
    }

    public DrinksGroup addToDrinksGroup(Drinks drinks){
        drinksGroup.add(drinks);
        return this;
    }

    private ArrayList<Drinks> drinksGroup = new ArrayList<>();
    @Override
    public Iterator<Drinks> iterator() {
        return new DrinksIterator(this);
    }
}
