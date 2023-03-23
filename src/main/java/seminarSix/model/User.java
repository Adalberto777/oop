package seminarSix.model;

public abstract class User {
    protected String name;

    public User() {

    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void setName(String name);

}
