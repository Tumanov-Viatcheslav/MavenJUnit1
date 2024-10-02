package mydomain.geometry;

public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distanceTo(Point other){
        return Math.sqrt((x-other.x)*(x-other.x) + (y-other.y)*(y-other.y));
    }
}
