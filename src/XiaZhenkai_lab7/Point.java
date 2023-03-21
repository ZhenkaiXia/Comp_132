package XiaZhenkai_lab7;

public class Point {
    private double x;
    private double y;

    Point(){
        this.x = 0;
        this.y = 0;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distanceFrom(Point b){
        return b.distanceFrom(this.x, this.y);
    }

    public String toString(){
        return "Point: [" + this.x + ", " + this.y + " ]";
    }
}
