package homeWorkFive;



public class Main {
    public static void main(String[] args) {
        Car car01 = CarBuilder.getInstance().setName("Mazda").build();
        System.out.println(car01);

    }
}
