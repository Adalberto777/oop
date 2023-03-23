package seminarSix.controller;

import seminarSix.model.Student;
import seminarSix.model.Teacher;
import seminarSix.model.User;
import seminarSix.service.UserService;
import seminarSix.service.UserServiceImpl;

public class UserController <T extends User> {
    private UserService service = new UserServiceImpl();
    public void saveUser(Student student){
        service.saveUser(student);
    }
    public void saveUser(Teacher teacher){
        service.saveUser(teacher);
    }
    public void getUser(){
        service.getUser();
    }
}
