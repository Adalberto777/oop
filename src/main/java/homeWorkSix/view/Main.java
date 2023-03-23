package homeWorkSix.view;

import homeWorkFour.AlcoholDrinks;
import homeWorkFour.DrinksGroup;
import homeWorkFour.DrinksIterator;
import homeWorkFour.NonAlcoholDrinks;

public class Main {
    public static void main(String[] args) {

        NonAlcoholDrinks coca = new NonAlcoholDrinks("Coca-Cola", 84.99);
        NonAlcoholDrinks pepsi = new NonAlcoholDrinks("Pepsi-Cola", 79.99);
        NonAlcoholDrinks mirinda = new NonAlcoholDrinks("Mirinda", 69);
        NonAlcoholDrinks sidr = new NonAlcoholDrinks("Sidr", 30.77, "apple", 0.5);
        NonAlcoholDrinks baical = new NonAlcoholDrinks("Baical", 49.99);
        NonAlcoholDrinks shweps = new NonAlcoholDrinks("Shweps", 104.20);
        NonAlcoholDrinks buratino = new NonAlcoholDrinks("Buratino", 93.88, "dushes", 0.5);
        NonAlcoholDrinks dobrii = new NonAlcoholDrinks("Dobrii", 89.99, "multifruit", 1.0);

        DrinksGroup drinksGroupNonAlcohol = new DrinksGroup();

        drinksGroupNonAlcohol.addToDrinksGroup(coca);
        drinksGroupNonAlcohol.addToDrinksGroup(pepsi);
        drinksGroupNonAlcohol.addToDrinksGroup(mirinda);
        drinksGroupNonAlcohol.addToDrinksGroup(sidr);
        drinksGroupNonAlcohol.addToDrinksGroup(baical);
        drinksGroupNonAlcohol.addToDrinksGroup(shweps);
        drinksGroupNonAlcohol.addToDrinksGroup(buratino);
        drinksGroupNonAlcohol.addToDrinksGroup(dobrii);

        AlcoholDrinks belenkaya = new AlcoholDrinks("Belenkaya", 384.99, 40.00, 0.5);
        AlcoholDrinks parlament = new AlcoholDrinks("Parlament", 379.99, 40.00, 0.5);
        AlcoholDrinks beluga = new AlcoholDrinks("Beluga", 979.99, 40.00, 0.5);
        AlcoholDrinks hennesi = new AlcoholDrinks("HennesiXO", 6400.77, 40.00, 0.7);

        DrinksGroup drinksGroupAlcohol = new DrinksGroup();

        drinksGroupAlcohol.addToDrinksGroup(belenkaya);
        drinksGroupAlcohol.addToDrinksGroup(parlament);
        drinksGroupAlcohol.addToDrinksGroup(beluga);
        drinksGroupAlcohol.addToDrinksGroup(hennesi);

        DrinksGroup drinksGroup = new DrinksGroup();

        drinksGroup.addToDrinksGroup(belenkaya);
        drinksGroup.addToDrinksGroup(parlament);
        drinksGroup.addToDrinksGroup(beluga);
        drinksGroup.addToDrinksGroup(hennesi);
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
