package primitives;

import java.util.Objects;

public class Point {
    public static final Point ZERO = new Point(Double3.ZERO);
    final Double3 xyz;

    public Point(Double3 xyz) {
        this.xyz = xyz;
    }

    public Point(double x, double y, double z) {
        xyz = new Double3(x, y, z);
    }

    public Vector subtract(Point p1) {
        return new Vector(xyz.subtract(p1.xyz));
    }

    public Point add(Vector vector) {
        return new Point(xyz.add(vector.xyz));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(xyz, point.xyz);
    }


}
