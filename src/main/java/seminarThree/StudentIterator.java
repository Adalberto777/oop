package seminarThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    public StudentIterator(StudentGroup group01){
        this.counter = 0;
        this.students = group01.getGroup01();
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }
}
