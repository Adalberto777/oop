namespace homeWorkSeven
{
    public class WaterBuilder
    {
        public static WaterBuilder instance;
        public Water water;
        public static WaterBuilder getInstance() {
            instance = new WaterBuilder();
            instance.water = new Water();
            return instance;
        }
        public WaterBuilder setPrice(double price){
            water.setPrice(price);
            return this;
        }
        public WaterBuilder setVolume(double volume){
            water.setVolume(volume);
            return this;
        }
        public WaterBuilder setName(string name){
            water.setName(name);
            return this;
        }
        public Water build(){
            return water;
        }
    }
}
