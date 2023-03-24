using (homeWorkSeven.model);


public class Water : Product {
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
    public string getName() {
        return super.getName();
    }

    @Override
    public void setName(string name) {
        super.setName(name);
    }

    @Override
    public string toString() {
        return "Water{" +
                "price=" + price +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
