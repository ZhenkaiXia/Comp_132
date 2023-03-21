package XiaZhenkai_lab7;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = firstName + lastName;
    }

    Person(String firstName, String lastName, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this. ID = ID;
    }

    public void sayHelloTo(String name){
        System.out.println("Hello " + name + ", my name is " + this.firstName +"!");
    }

    public void sayHelloTo(Person other){

    }

    public String toString(){
        return "Person: " + this.firstName + " " + this.lastName + " (" + this.ID + ")";
    }
}
