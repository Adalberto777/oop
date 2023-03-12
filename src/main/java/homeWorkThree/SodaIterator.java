package homeWorkThree;


import java.util.Iterator;
import java.util.List;

public class SodaIterator implements Iterator<Soda> {
    private int counter;
    private final List<Soda> soda;

    public SodaIterator(SodaGroup sodaGroup){
        this.counter = 0;
        this.soda = sodaGroup.getSodaGroup();
    }
    @Override
    public boolean hasNext() {
        return counter < soda.size() - 1;
    }

    @Override
    public Soda next() {
        counter++;
        return soda.get(counter);
    }
}
