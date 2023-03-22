package XiaZhenkai_lab7;

/**
 * Records information of a person.
 *
 * @author Zhenkai Xia
 */
public class Person {
    private String ID;
    private String firstName;
    private String lastName;

    /**
     * Records a person's name and generates an ID.
     *
     * @param firstName the first name of the person.
     * @param lastName the last name of the person.
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = firstName + lastName;
    }

    /**
     * Records a person's name and ID.
     *
     * @param firstName the first name of the person.
     * @param lastName the last name of the person.
     * @param ID the ID of the person.
     */
    public Person(String firstName, String lastName, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this. ID = ID;
    }

    /**
     * returns the first name of this person.
     *
     * @return the first name of this person.
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * returns the ID of this person.
     *
     * @return the ID of this person.
     */
    public String getID(){
        return this.ID;
    }

    /**
     * Prints a greeting from this person to another.
     *
     * @param name the other person's name
     */
    public void sayHelloTo(String name){
        System.out.println("Hello " + name + ", my name is " + this.firstName +"!");
    }

    /**
     * Prints a greeting from this person to another.
     *
     * @param other the other person.
     */
    public void sayHelloTo(Person other){
        System.out.println("Hello " + other.getFirstName() + ", my name is " + this.firstName +"!");
    }

    /**
     * Outputs this person's information.
     *
     * @return formatted information of this person.
     */
    public String toString(){
        return "Person: " + this.firstName + " " + this.lastName + " (" + this.ID + ")";
    }
}
