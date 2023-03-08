package seminarThree;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student>{
    public ArrayList<Student> getGroup01() {
        return group01;
    }

    public void setGroup01(ArrayList<Student> group01) {
        this.group01 = group01;
    }

    public StudentGroup addToGroup(Student student){
        group01.add(student);
        return this;
    }

    private ArrayList<Student> group01 = new ArrayList<>();
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(this);
    }
}
