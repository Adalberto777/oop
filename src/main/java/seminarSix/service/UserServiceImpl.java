package seminarSix.service;

import seminarSix.model.Student;
import seminarSix.model.Teacher;
import seminarSix.model.User;

import java.io.FileWriter;
import java.util.logging.Logger;

public class UserServiceImpl implements UserService {
    Logger logger= Logger.getAnonymousLogger();
    @Override
    public void saveUser(User user) {
        try(FileWriter fileWriter = new FileWriter("user.txt")){
            fileWriter.write(user.toString());
        }catch (Exception e){
            logger.warning("We have a problem");}

    }

    @Override
    public void saveUser(Student student) {

    }

    @Override
    public void saveUser(Teacher teacher) {

    }
}
