using homeWorkSeven;


public class Water : Product {
    private double price;
    private double volume;
    public Water(){

    }

    public double GetPrice() {
        return price;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public double GetVolume() {
        return volume;
    }

    public void SetVolume(double volume) {
        this.volume = volume;
    }

    public string GetName() {
        return base.getName();
    }

    public void SetName(string name) {
        base.setName(name);
    }

    
}
