package seminarSix.model;

public class StudentBuilder {
    public static StudentBuilder instance;

    public Student student;

    public static StudentBuilder getInstance() {
        instance = new StudentBuilder();
        instance.student = new Student();
        return instance;
    }

    public StudentBuilder setAverageScore(double averageScore){
        student.setAverageScore(averageScore);
        return this;
    }
    public StudentBuilder setFormOfTraining(String formOfTraining){
        student.setFormOfTraining(formOfTraining);
        return this;
    }
    public StudentBuilder setName(String name){
        student.setName(name);
        return this;
    }
    public Student build(){
        return student;
    }
}
