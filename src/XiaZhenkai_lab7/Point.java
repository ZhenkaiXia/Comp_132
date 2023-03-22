package XiaZhenkai_lab7;

/**
 * Records the X and Y of a point on a cartesian plane
 *
 * @author Zhenkai Xia
 */
public class Point {
    private double x;
    private double y;

    /**
     *  Default constructor. Places a point at (0, 0).
     */
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Places a point at the given coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates the distance from the given point and the recorded point.
     *
     * @param x the given point's x coordinate.
     * @param y the given point's y coordinate.
     * @return the distance between the two points.
     */
    public double distanceFrom(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    /**
     * Calculates the distance from the given point and the recorded point.
     *
     * @param b the given point.
     * @return the distance between the two points.
     */
    public double distanceFrom(Point b){
        return b.distanceFrom(this.x, this.y);
    }

    /**
     * Outputs the recorded point.
     *
     * @return the recorded point formatted.
     */
    public String toString(){
        return "Point: [" + this.x + ", " + this.y + " ]";
    }
}
