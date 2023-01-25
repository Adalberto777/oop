package seminarOne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private LocalDate birchDate;
    private String sex;
    private List<Person> children = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirchDate() {
        return birchDate;
    }

    public void setBirchDate(LocalDate birchDate) {
        this.birchDate = birchDate;
    }

    public Person(String name, LocalDate birchDate, String sex) {
        this.name = name;
        this.birchDate = birchDate;
        this.sex = sex;
    }

    public List<Person> getChildren(){
        return children;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void addToFamily(Person p){
        if (!p.equals(this) && birchDate.isBefore(p.getBirchDate()))
            children.add(p);
    }

    public boolean isParent(Person parent){
        if (parent.getChildren().contains(this)){
            return true;
        }
        return false;
    }

    public boolean isBrother(Person parent, Person brother){
        if (isParent(parent) && brother.isParent(parent) && brother.getSex().equals("man")){
            return true;
        }
        return false;
    }

}
