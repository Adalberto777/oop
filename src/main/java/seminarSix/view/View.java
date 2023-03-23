package seminarSix.view;


import seminarSix.controller.UserController;
import seminarSix.model.Student;
import seminarSix.model.StudentBuilder;
import seminarSix.model.Teacher;
import seminarSix.model.TeacherBuilder;

import static java.lang.StringBuilder.*;

public class View {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Student student = StudentBuilder.getInstance().setName("Albert").setAverageScore(4.00).build();
        userController.saveUser(student);
        Teacher teacher = TeacherBuilder.getInstance().setName("Don_Albert").setSpecialization("Informatics").setCategory("the_highest_category").build();
        userController.saveUser(teacher);
    }

}
