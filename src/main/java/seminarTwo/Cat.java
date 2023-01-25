package seminarTwo;

public class Cat extends Animals {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void tellAboutYourSelf() {
        System.out.printf("Hello I am a cat %s, I am %d years old\n", this.name, this.age);
    }
}
