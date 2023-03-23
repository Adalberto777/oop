package homeWorkSix.model;

import homeWorkFour.Drinks;

import java.util.Objects;

public class NonAlcoholDrinks extends Drinks {

    private String taste;
    private double volume;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "NonAlcoholDrinks{" +
                "name='" + getName() + '\'' +
                ", cost=" +  getCost() +
                ", taste='" + taste + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonAlcoholDrinks that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getVolume(), getVolume()) == 0 && Objects.equals(getTaste(), that.getTaste());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTaste(), getVolume());
    }

    public NonAlcoholDrinks(String name, double cost, String taste, double volume) {
        super(name, cost);
        this.taste = taste;
        this.volume = volume;
    }

    public NonAlcoholDrinks(String name, double cost) {
        super(name, cost);
    }
}
