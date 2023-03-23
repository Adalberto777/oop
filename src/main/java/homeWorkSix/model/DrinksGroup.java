package homeWorkSix.model;


import homeWorkFour.Drinks;
import homeWorkFour.DrinksIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinksGroup implements Iterable<homeWorkFour.Drinks>{
    public ArrayList<homeWorkFour.Drinks> getDrinksGroup() {
        return drinksGroup;
    }
    public void setDrinksGroup(ArrayList<homeWorkFour.Drinks> drinksGroup) {
        this.drinksGroup = drinksGroup;
    }

    public DrinksGroup addToDrinksGroup(homeWorkFour.Drinks drinks){
        drinksGroup.add(drinks);
        return this;
    }

    private ArrayList<homeWorkFour.Drinks> drinksGroup = new ArrayList<>();
    @Override
    public Iterator<Drinks> iterator() {
        return new DrinksIterator(this);
    }
}
