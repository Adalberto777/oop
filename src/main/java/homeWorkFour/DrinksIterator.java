package homeWorkFour;


import java.util.Iterator;
import java.util.List;

public class DrinksIterator implements Iterator<Drinks> {
    private int counter;
    private final List<Drinks> drinks;

    public DrinksIterator(DrinksGroup drinksGroup){
        this.counter = 0;
        this.drinks = drinksGroup.getDrinksGroup();
    }
    @Override
    public boolean hasNext() {
        return counter < drinks.size() - 1;
    }

    @Override
    public Drinks next() {
        counter++;
        return drinks.get(counter);
    }
}
