package seminarThree;

import java.util.Objects;

public class Student {
    private String name;
    private String secondName;
    private float averageMark;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Float.compare(student.getAverageMark(), getAverageMark()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getSecondName(), student.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSecondName(), getAverageMark());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }
}
