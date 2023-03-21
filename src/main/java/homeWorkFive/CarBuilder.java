package homeWorkFive;


public class CarBuilder {
    private static CarBuilder instance;
    Car obj;
    private CarBuilder(){

    }

    public static CarBuilder getInstance(){
        if (instance == null)
            instance = new CarBuilder();
        instance.obj = new Car();

        return instance;
    }

    public CarBuilder setName(String name){
        obj.setName(name);
        return this;
    }

    public CarBuilder setEquipment(String equipment){
        obj.setEquipment(equipment);
        return this;
    }

    public CarBuilder setCoast(double coast){
        obj.setCoast(coast);
        return this;
    }

    public CarBuilder setDateOfManufacture(String dateOfManufacture){
        obj.setDateOfManufacture(dateOfManufacture);
        return this;
    }

        public Car build() {
        return obj;
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "obj=" + obj +
                '}';
    }
}
