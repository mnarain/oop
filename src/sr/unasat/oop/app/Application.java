package sr.unasat.oop.app;

import sr.unasat.oop.entities.Dog;
import sr.unasat.oop.entities.Person;

public class Application {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Maarten Narain";
        person.idNummer = "YX209374";
        person.printInfo();

        System.out.println();

        Dog dog1 = new Dog();
        dog1.name = "Bello";
        dog1.owner = "Maarten Narain";
        dog1.printInfo();

        System.out.println();

        Dog dog2 = new Dog();
        dog2.name = "Fifi";
        dog2.owner = "Maarten Narain";
        dog2.printInfo();
    }



}