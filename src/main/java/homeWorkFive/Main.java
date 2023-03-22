package homeWorkFive;



public class Main {
    public static void main(String[] args) {
        Car car01 = CarBuilder.getInstance().setName("Mazda").build();
        Car car02 = CarBuilder.getInstance().setName("BMW").build();

        TractorSingleton tractor01 = TractorSingleton.getInstance();
        TractorSingleton tractor02 = TractorSingleton.getInstance();
        tractor01.setName("Catarpiller");



        System.out.println(car01);
        System.out.println(car02);
        System.out.println(tractor01);
        System.out.println(tractor02);
        System.out.println(tractor01.equals(tractor02));



    }
}
