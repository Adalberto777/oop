package homeWorkFour;

public class Main {
    public static void main(String[] args) {

        Drinks coca = new Drinks("Coca-Cola", 84.99);
        Drinks pepsi = new Drinks("Pepsi-Cola", 79.99);
        Drinks mirinda = new Drinks("Mirinda", 69);
        Drinks sidr = new Drinks("Sidr", 30.77);
        Drinks baical = new Drinks("Baical", 49.99);
        Drinks shweps = new Drinks("Shweps", 104.20);
        Drinks buratino = new Drinks("Buratino", 93.88);
        Drinks dobrii = new Drinks("Dobrii", 89.99);

        DrinksGroup drinksGroup = new DrinksGroup();
        drinksGroup.addToDrinksGroup(coca);
        drinksGroup.addToDrinksGroup(pepsi);
        drinksGroup.addToDrinksGroup(mirinda);
        drinksGroup.addToDrinksGroup(sidr);
        drinksGroup.addToDrinksGroup(baical);
        drinksGroup.addToDrinksGroup(shweps);
        drinksGroup.addToDrinksGroup(buratino);
        drinksGroup.addToDrinksGroup(dobrii);

        DrinksIterator iterator = new DrinksIterator(drinksGroup);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
