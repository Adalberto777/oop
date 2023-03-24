package seminarSix.service;

import seminarSix.model.Student;
import seminarSix.model.Teacher;
import seminarSix.model.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;

public class UserServiceImpl implements UserService {
    Logger logger= Logger.getAnonymousLogger();

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void saveUser(Student student) {
        try(FileWriter fileWriter = new FileWriter("user01.txt")){
            fileWriter.write(student.toString());
        }catch (Exception e){
            logger.warning("We have a problem");
        }
    }
    @Override
    public void saveUser(Teacher teacher) {
        try(FileWriter fileWriter = new FileWriter("user02.txt")){
            fileWriter.write(teacher.toString());
        }catch (Exception e){
            logger.warning("We have a problem");}

    }

    @Override
    public void readStudent(String student) {

    }

    @Override
    public void readTeacher(String teacher) {

    }

    @Override
    public void getStudent(String student) {

    }

    @Override
    public void getTeacher(String teacher) {

    }

    @Override
    public void getUser(String teacher) {

    }

    @Override
    public void getUser() {
        try(FileReader fileReader = new FileReader("user01.txt")){
            int c;
            while ((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        }catch (Exception e){
            logger.warning("We have a problem");
        }
        System.out.println();
        try(FileReader fileReader = new FileReader("user02.txt")){
            int c;
            while ((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        }catch (Exception e){
            logger.warning("We have a problem");
        }

    }

}
