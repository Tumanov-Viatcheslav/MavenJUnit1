import mydomain.geometry.Point;
import mydomain.geometry.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test2Triangle {
//    @Test(expected = IllegalArgumentException.class)
//    void test1() {
//        Point p1 = new Point(0, 0),
//                p2 = new Point(0, 0),
//                p3 = new Point(0, 0);
//        Triangle t1 = new Triangle(p1, p2, p3);
//    }

    @Test
    public void testPerimeter1(){
        Point p1 = new Point(0, 0),
                p2 = new Point(0, 3),
                p3 = new Point(4, 0);
        Triangle t1 = new Triangle(p1, p2, p3);
        Assertions.assertEquals(12, t1.perimeter());
    }

    @Test
    public void testPerimeter2(){
        Point p1 = new Point(0, 0),
                p2 = new Point(3, 3),
                p3 = new Point(4, 120);
        Triangle t1 = new Triangle(p1, p2, p3);
        Assertions.assertTrue(Math.abs(t1.perimeter() - 241.4) < 0.1);
    }

    @Test
    public void testPerimeter3(){
        Point p1 = new Point(0, 0),
                p2 = new Point(3, 3),
                p3 = new Point(4, 120);
        Triangle t1 = new Triangle(p1, p2, p3);
        Assertions.assertTrue(t1.perimeter() > 0);
    }
}
