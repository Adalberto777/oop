namespace homeWorkSeven{
    public class WaterBuilder
{
    public static WaterBuilder instance;
    public Water water;
    public static WaterBuilder GetInstance() {
        instance = new WaterBuilder();
        instance.water = new Water();
        return instance;
    }
    public WaterBuilder SetPrice(double price){
        water.SetPrice(price);
        return this;
    }
    public WaterBuilder SetVolume(double volume){
        water.SetVolume(volume);
        return this;
    }
    public WaterBuilder SetName(string name){
        water.SetName(name);
        return this;
    }
    public Water Build(){
        return water;
    }
}
}
public class WaterBuilder
{
    public static WaterBuilder instance;
    public Water water;
    public static WaterBuilder GetInstance() {
        instance = new WaterBuilder();
        instance.water = new Water();
        return instance;
    }
    public WaterBuilder SetPrice(double price){
        water.SetPrice(price);
        return this;
    }
    public WaterBuilder SetVolume(double volume){
        water.SetVolume(volume);
        return this;
    }
    public WaterBuilder SetName(string name){
        water.SetName(name);
        return this;
    }
    public Water Build(){
        return water;
    }
}