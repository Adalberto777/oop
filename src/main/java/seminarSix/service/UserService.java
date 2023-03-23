package seminarSix.service;

import seminarSix.model.Student;
import seminarSix.model.Teacher;
import seminarSix.model.User;

public interface UserService {
    void saveUser(User user);

    void saveUser(Student student);
    void saveUser(Teacher teacher);

}
