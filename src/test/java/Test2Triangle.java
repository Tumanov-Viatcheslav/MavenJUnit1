import mydomain.geometry.Point;
import mydomain.geometry.Triangle;
import org.junit.jupiter.api.Assertions;
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

    @Test
    public void testPerimeter4(){
        Point p1 = new Point(0, 0),
                p2 = new Point(3, 3),
                p3 = new Point(4, 120);
        Triangle t1 = new Triangle(p1, p2, p3);
        Assertions.assertTrue(Math.abs(t1.perimeter() - p1.distanceTo(p2) - p2.distanceTo(p3) - p3.distanceTo(p1)) < 0.0001);
    }

    @Test
    public void testPerimeter5(){
        Point p1 = new Point(0, 0),
                p2 = new Point(0, 0),
                p3 = new Point(0, 0);
        Point cp1 = new Point(1, 1),
                cp2 = new Point(3, 3),
                cp3 = new Point(4, 120);
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(p1, p2, p3));
        Assertions.assertEquals("Equal points in triangle", ex.getMessage());
        ex = Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(p1, cp2, p3));
        Assertions.assertEquals("Equal points in triangle", ex.getMessage());
        ex = Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(cp1, p2, p3));
        Assertions.assertEquals("Equal points in triangle", ex.getMessage());
        ex = Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(p1, p2, cp3));
        Assertions.assertEquals("Equal points in triangle", ex.getMessage());
    }

    @Test
    public void testPerimeter6(){
        Point p1 = new Point(0, 0),
                p2 = new Point(0, 30),
                p3 = new Point(40, 0);
        Triangle t1 = new Triangle(p1, p2, p3);
        Assertions.assertEquals(120, t1.perimeter());
    }
}
