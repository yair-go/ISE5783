package primitives;

import geometries.Polygon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
     void lengthSquared() {
        Vector v1 = new Vector(1, 2, 3);
        assertEquals(14, v1.lengthSquared(), "ERROR: lengthSquared() wrong value");
        Vector v2 = new Vector(1, 1, 1);
        assertEquals(3,  v2.lengthSquared(), "ERROR: lengthSquared() wrong value");


    }

    @Test
    void testLength() {
    }

    @Test
    void testDotProduct() {
    }

    @Test
    void testCrossProduct() {
    }

    @Test
    void testNormalize() {
    }
}