package seminarOneR;

public class ColdWater extends Product {
        private String taste;
        private double volume;

    @Override
    public String toString() {
        return super.toString();
    }

    public ColdWater(String name, double cost) {
        super(name, cost);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    public ColdWater(String name, double cost, String taste, double volume) {
        super(name, cost);
        this.taste = taste;
        this.volume = volume;
    }
}
