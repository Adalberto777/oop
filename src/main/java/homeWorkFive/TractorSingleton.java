package homeWorkFive;

public class TractorSingleton {
    private static TractorSingleton instance;
    Tractor obj = new Tractor("Belarus", "with a bucket", 7.00, "15.12.2023");

    private TractorSingleton(){

    }

    public static synchronized TractorSingleton getInstance() {
        if (instance == null) {
            instance = new TractorSingleton();
        }
        return instance;
    }

    public String getName() {
        return obj.getName();
    }

    public TractorSingleton setName(String name){
        obj.setName(name);
        return this;
    }

    public String getEquipment() {
        return obj.getEquipment();
    }

    public TractorSingleton setEquipment(String equipment){
        obj.setEquipment(equipment);
        return this;
    }

    public double getCoast() {
        return obj.getCoast();
    }

    public TractorSingleton setCoast(double coast){
        obj.setCoast(coast);
        return this;
    }

    public String getDateOfManufacture() {
        return obj.getDateOfManufacture();
    }

    public TractorSingleton setDateOfManufacture(String dateOfManufacture){
        obj.setDateOfManufacture(dateOfManufacture);
        return this;
    }

    @Override
    public String toString() {
        return "TractorSingleton{" +
                "obj=" + obj +
                '}';
    }
}
