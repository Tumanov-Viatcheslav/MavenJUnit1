import mydomain.geometry.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test1 {
    @Test
    public void test0() {
        System.out.println("а мы тут тестами балуемся");
    }

    @Test
    public void test1Distances() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Assertions.assertEquals(2, a.distanceTo(b));
        Assertions.assertEquals(2, b.distanceTo(a));
    }
    @Test
    public void test2Distances() {
        Point a = new Point(333, 12);
        Point b = new Point(64, 182);
        Assertions.assertEquals(b.distanceTo(a), a.distanceTo(b));
        Assertions.assertNotEquals(0, a.distanceTo(b));
    }
    @Test
    public void test3Distances() {
        Point a = new Point(333, 12);
        Point b = new Point(333, 12);
        Assertions.assertEquals(0, a.distanceTo(b));
        Point c = new Point(12, 333);
        Assertions.assertNotEquals(0, c.distanceTo(a));
    }
}
