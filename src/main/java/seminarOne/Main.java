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

        Albert.addToFamily(Rina);
        Albert.addToFamily(Lina);
        Albert.addToFamily(Iskander);

        Liliya.addToFamily(Rina);
        Liliya.addToFamily(Lina);
        Liliya.addToFamily(Iskander);

        printFamily(Albert);
        printCheckParent(Lina, Albert);
        printCheckBrother(Lina, Liliya, Iskander);
    }
    static void printFamily(Person root){
        if (root != null){
            System.out.println(root.getName());
            for (Person item : root.getChildren()){
                if (item != null){
                    printFamily(item);
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
}
