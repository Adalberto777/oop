package homeWorkThree;

import java.util.Objects;

public class Soda {
    private String name;
    private double cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soda soda)) return false;
        return Double.compare(soda.getCost(), getCost()) == 0 && Objects.equals(getName(), soda.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost());
    }

    @Override
    public String toString() {
        return "Soda{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
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

    public Soda(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}
