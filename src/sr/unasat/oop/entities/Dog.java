package sr.unasat.oop.entities;

public class Dog {
    public String name;
    public Person owner;

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Owner name: " + owner.name);
        System.out.println("Owner id number: " + owner.idNumber);
    }
}
