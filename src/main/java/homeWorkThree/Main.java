package homeWorkThree;

public class Main {
    public static void main(String[] args) {

        Soda coca = new Soda ("Coca-Cola", 84.99);
        Soda pepsi = new Soda ("Pepsi-Cola", 79.99);
        Soda mirinda = new Soda ("Mirinda", 69);
        Soda sidr = new Soda ("Sidr", 30.77);
        Soda baical = new Soda ("Baical", 49.99);
        Soda shweps = new Soda ("Shweps", 104.20);
        Soda buratino = new Soda ("Buratino", 93.88);
        Soda dobrii = new Soda ("Dobrii", 89.99);

        SodaGroup sodaGroup = new SodaGroup();
        sodaGroup.addToSodaGroup(coca);
        sodaGroup.addToSodaGroup(pepsi);
        sodaGroup.addToSodaGroup(mirinda);
        sodaGroup.addToSodaGroup(sidr);
        sodaGroup.addToSodaGroup(baical);
        sodaGroup.addToSodaGroup(shweps);
        sodaGroup.addToSodaGroup(buratino);
        sodaGroup.addToSodaGroup(dobrii);

        SodaIterator iterator = new SodaIterator(sodaGroup);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
