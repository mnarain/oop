package sr.unasat.oop.entities;

public class Person {
    private String name;
    private String idNumber;

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
