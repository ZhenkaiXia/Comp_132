package XiaZhenkai_lab7;

/**
 * Records the information of a car.
 *
 * @author Zhenkai Xia
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private Person owner;
    private long odometer;

    /**
     * Records this car's information.
     *
     * @param make the make of the car.
     * @param model the model of the car.
     * @param year the year the car was made.
     */
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = 0;
    }

    /**
     * Drives the car by printing car noises and adding distance on the odometer.
     *
     * @param dist the distance to drive.
     * @return the odometer after the drive.
     */
    public long drive(long dist){
        System.out.println("Vroom");
        odometer += dist;
        return odometer;
    }

    /**
     * Outputs the information of the car.
     *
     * @return formatted information of the car.
     */
    public String toString(){
        return "Car: " + year + " " + make + " " + model + ".";
    }
}
