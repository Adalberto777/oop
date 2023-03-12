package homeWorkFour;

import java.util.Objects;

public class Drinks {
    private String name;
    private double cost;


    public Drinks(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drinks drinks)) return false;
        return Double.compare(drinks.getCost(), getCost()) == 0 && Objects.equals(getName(), drinks.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
