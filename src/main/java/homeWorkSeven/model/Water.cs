namespace homeWorkSeven{
    public class Water : Product
{
    private double price;
    private double volume;
    public Water(){}

    public double GetPrice() 
    {
        return price;
    }

    public void SetPrice(double price) 
    {
        this.price = price;
    }

    public double GetVolume() 
    {
        return volume;
    }

    public void SetVolume(double volume)
    {
        this.volume = volume;
    }

    public new string GetName()
    {
        return base.GetName();
    }

    public new void SetName(string name) 
    {
        base.SetName(name);
    }

    public new string ToString() 
    {
        return "Water{" +
                "name='" + name +
                ",  price=" + price+
                ", volume=" + volume + '\'' +
                '}'; 
    }    
}

}
