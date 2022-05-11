package sr.unasat.oop.app;

import sr.unasat.oop.entities.Dog;
import sr.unasat.oop.entities.Person;

public class Application {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Maarten Narain";
        person.idNumber = "YX209374";
        person.printInfo();

        System.out.println();

        Dog dog1 = new Dog();
        dog1.name = "Bello";
        dog1.owner = person;
        dog1.printInfo();

        System.out.println();

        Dog dog2 = new Dog();
        dog2.name = "Fifi";
        dog2.owner = person;
        dog2.printInfo();

        System.out.println();

        Person person2 = new Person();
        person2.name = "Margo Tjon a Kon";
        person2.idNumber = "WZ928733";
        person2.printInfo();

        System.out.println();

        dog2.owner = person2;
        dog2.printInfo();
    }



}
