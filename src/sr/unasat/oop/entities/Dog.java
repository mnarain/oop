package sr.unasat.oop.entities;

public class Dog {
    private String name;
    private Person owner;

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Owner name: " + owner.name);
        System.out.println("Owner idNumber: " + owner.idNumber);
    }

}
