package homeWorkSeven.model;

public class Water extends Product {
    private double price;
    private double volume;
    public Water(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
    public String toString() {
        return "Water{" +
                "price=" + price +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
