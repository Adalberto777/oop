package seminarSix.model;

public class TeacherBuilder {
    public static TeacherBuilder instance;
    public Teacher teacher;

    public static TeacherBuilder getInstance() {
        instance = new TeacherBuilder();
        instance.teacher = new Teacher();
        return instance;
    }
    public Teacher build(){
        return teacher;
    }
    public TeacherBuilder setSpecialization(String specialization){
        teacher.getSpecialization();
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
}
