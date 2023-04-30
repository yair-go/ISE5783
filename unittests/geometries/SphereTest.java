package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @org.junit.jupiter.api.Test
    void testGetNormal() {
    }

    @org.junit.jupiter.api.Test
    void testFindIntersections() {
        Sphere sphere = new Sphere(new Point(0, 0, 7), 3);
        Ray ray = new Ray(new Point(0,0,0), new Vector(-2,-1,9));
        assertEquals(List.of(new Point(-0.93, 0.47, 4.19), new Point(-2, -1, 9)),sphere.findIntersections(ray));

    }
}