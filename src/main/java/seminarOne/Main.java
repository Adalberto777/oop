package seminarOne;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person Vasilii = new Person("Vasilii", LocalDate.of(1983, 10, 15), "man");
        Person Albert = new Person("Albert", LocalDate.of(1984, 12, 15), "man");
        Person Anya = new Person("Anya", LocalDate.of(1995, 11, 25), "woman");
        Person Liliya = new Person("Liliya", LocalDate.of(1994, 03, 21), "woman");
        Person Rina = new Person("Rina", LocalDate.of(2025, 03, 16), "woman");
        Person Lina = new Person("Lina", LocalDate.of(2024, 03, 15), "woman");
        Person Iskander = new Person("Iskander", LocalDate.of(2023, 12, 15), "man");

        Albert.addKid(Rina);
        Albert.addKid(Lina);
        Albert.addKid(Iskander);

        Liliya.addKid(Rina);
        Liliya.addKid(Lina);
        Liliya.addKid(Iskander);

        Family Tlyashev = new Family();
        Family Latypov = new Family();

        Tlyashev.addToBigFamily(Albert);
        Tlyashev.addToBigFamily(Liliya);
        Tlyashev.addToBigFamily(Rina);
        Tlyashev.addToBigFamily(Lina);
        Tlyashev.addToBigFamily(Iskander);

        Latypov.addToBigFamily(Vasilii);
        Latypov.addToBigFamily(Anya);

        printKid(Albert);
        printCheckParent(Lina, Albert);
        printCheckBrother(Lina, Liliya, Iskander);
        printCheckSister(Lina, Liliya, Rina);
        printCheckFamily(Lina, Latypov);

    }

    private static void printCheckFamily(Person person, Family family) {
        boolean n = family.isFamily(person);
        System.out.println(n);
    }


    static void printKid(Person root){
        if (root != null){
            System.out.println(root.getName());
            for (Person item : root.getChildren()){
                if (item != null){
                    printKid(item);
                }
            }
        }
    }
    static void printCheckParent(Person person, Person parent){
        boolean n = person.isParent(parent);
        System.out.println(n);
    }
    static void printCheckBrother(Person person, Person parent, Person brother){
        boolean n = person.isBrother(parent, brother);
        System.out.println(n);
    }
    private static void printCheckSister(Person person, Person parent, Person sister) {
        boolean n = person.isSister(parent, sister);
        System.out.println(n);
    }
}
