package seminarOneR;


public class HotWater extends Product {
    private String taste;
    private double volume;
    private int temperature;


    public HotWater(String name, double cost, String taste, double volume, int temperature) {
        super(name, cost);
        this.taste = taste;
        this.volume = volume;
        this.temperature = temperature;
    }


    public HotWater(String name, double cost) {
        super(name, cost);
        this.taste = "default";
        this.volume = 400;
        this.temperature = 55;
    }



    @Override
    public String toString() {
        return super.toString();
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
}

