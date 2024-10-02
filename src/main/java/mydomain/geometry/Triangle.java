package mydomain.geometry;

public class Triangle {
    Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    public double perimeter(){
        double side12 = p1.distanceTo(p2);
        double side23 = p2.distanceTo(p3);
        double side31 = p3.distanceTo(p1);
        return side12+side23+side31;
    }
}
