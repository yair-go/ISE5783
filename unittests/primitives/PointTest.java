package primitives;

import geometries.Polygon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void subtract() {
        Point point = new Point(1,0,0);
        Vector vector = new Vector(1,0,0);
        assertEquals(vector, point.subtract(new Point(0,0,0)),"wow");

        assertThrows(IllegalArgumentException.class, //
                () ->  point.subtract(new Point(1,0,0)),
                "Vector zero");
    }


    /**
     */

    @Test
    void testAdd() {
    }
}