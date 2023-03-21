package homeWorkFive;

public class Tractor {
    private String name = "Belarus";
    private String equipment = "second";
    private double coast = 7.00;
    private String dateOfManufacture = "15.12.2022";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", equipment='" + equipment + '\'' +
                ", coast=" + coast +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                '}';
    }
}
