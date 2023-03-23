package seminarSix.model;

public class TeacherBuilder {
    public static TeacherBuilder instance;
    public Teacher teacher;

    public static TeacherBuilder getInstance() {
        instance = new TeacherBuilder();
        instance.teacher = new Teacher();
        return instance;
    }

    public TeacherBuilder setSpecialization(String specialization){
        teacher.setSpecialization(specialization);
        return this;
    }
    public TeacherBuilder setCategory(String category){
        teacher.setCategory(category);
        return this;
    }
    public TeacherBuilder setName(String name){
        teacher.setName(name);
        return this;
    }
    public Teacher build(){
        return teacher;
    }
}
