package sr.unasat.oop.entities;

public class Dog {
    private String name;
    private Person owner;

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Owner name: " + owner.getName());
        System.out.println("Owner idNumber: " + owner.getIdNumber());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
