package homeWorkSix.model;

import homeWorkFour.Drinks;

import java.util.Objects;

public class AlcoholDrinks extends Drinks {
    private double degreeOfAlcohol;
    private double volume;

    public double getDegreeOfAlcohol() {
        return degreeOfAlcohol;
    }

    public void setDegreeOfAlcohol(double degreeOfAlcohol) {
        this.degreeOfAlcohol = degreeOfAlcohol;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "AlcoholDrinks{" +
                "name='" + getName() + '\'' +
                ", cost=" +  getCost() +
                ", degreeOfAlcohol=" + degreeOfAlcohol +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlcoholDrinks that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getDegreeOfAlcohol(), getDegreeOfAlcohol()) == 0 && Double.compare(that.getVolume(), getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDegreeOfAlcohol(), getVolume());
    }

    public AlcoholDrinks(String name, double cost, double degreeOfAlcohol, double volume) {
        super(name, cost);
        this.degreeOfAlcohol = degreeOfAlcohol;
        this.volume = volume;
    }


}
