package homeWorkSix.model;


import homeWorkFour.Drinks;
import homeWorkFour.DrinksGroup;

import java.util.Iterator;
import java.util.List;

public class DrinksIterator<T extends homeWorkFour.Drinks> implements Iterator<T> {
    private int counter;
    private final List<? extends Drinks> drinks;

    public DrinksIterator(DrinksGroup drinksGroup){
        this.counter = 0;
        this.drinks = drinksGroup.getDrinksGroup();
    }
    @Override
    public boolean hasNext() {
        return counter < drinks.size() - 1;
    }

    @Override
    public T next() {
        counter++;
        return (T) drinks.get(counter);
    }
}
