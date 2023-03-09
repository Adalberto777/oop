package homeWorkThree;


import java.util.ArrayList;
import java.util.Iterator;

public class SodaGroup implements Iterable<Soda>{
    public ArrayList<Soda> getSodaGroup() {
        return sodaGroup;
    }
    public void setSodaGroup(ArrayList<Soda> sodaGroup) {
        this.sodaGroup = sodaGroup;
    }

    public SodaGroup addToSodaGroup(Soda soda){
        sodaGroup.add(soda);
        return this;
    }

    private ArrayList<Soda> sodaGroup = new ArrayList<>();
    @Override
    public Iterator<Soda> iterator() {
        return new SodaIterator(this);
    }
}
