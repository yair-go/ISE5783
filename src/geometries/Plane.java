package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

public class Plane implements Geometry{

    public Plane(Point v1, Point v2, Point v3) {
        normal = new Vector(1,1,1);
    }

    public Vector getNormal() {
        return normal;
    }

    private Vector normal;
    @Override
    public Vector getNormal(Point point) {
        return normal;
    }

    @Override
    public List<Point> findIntersections(Ray ray) {
        return null;
    }
}
