package seminarSix.model;

public class Student extends User{
    double averageScore;
    String formOfTraining;

    public Student(String name) {
        super(name);
    }

    public Student() {

    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getFormOfTraining() {
        return formOfTraining;
    }

    public void setFormOfTraining(String formOfTraining) {
        this.formOfTraining = formOfTraining;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                ", formOfTraining='" + formOfTraining + '\'' +
                '}';
    }


}
