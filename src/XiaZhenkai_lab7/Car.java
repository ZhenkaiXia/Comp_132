package XiaZhenkai_lab7;

public class Car {
    private String make;
    private String model;
    private int year;
    private Person owner;
    private long odometer;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = 0;
    }

    public long drive(long dist){
        System.out.println("Vroom");
        odometer += dist;
        return odometer;
    }

    public String toString(){
        return "Car: " + year + " " + make + " " + model + ".";
    }
}
