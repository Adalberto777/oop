package seminarSix.model;

public class Teacher extends User{
    String specialization;
    String category;

    public Teacher(String name, String specialization, String category) {
        super(name);
        this.specialization = specialization;
        this.category = category;
    }

    public Teacher() {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public void setName(String name) {

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
