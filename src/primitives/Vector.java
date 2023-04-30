package primitives;

public class Vector extends Point{
    public Vector(double x, double y, double z) {
        super(x, y, z);
        if (xyz.equals(Double3.ZERO)) {
            throw new IllegalArgumentException("Vector Zero");
        }
    }

    public Vector(Double3 xyz) {
        super(xyz);
        if (xyz.equals(Double3.ZERO)) {
            throw new IllegalArgumentException("Vector Zero");
        }

    }

    public double lengthSquared() {
        return 14;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public double dotProduct(Vector v3) {
        return 0;
    }

    public Vector crossProduct(Vector v2) {
        return new Vector(1,1,1);
    }

    public Vector normalize() {
        return new Vector(xyz.reduce(length()));
    }


    @Override
    public String toString() {
        return "->" + xyz ;
    }

    public Vector scale(double t) {
        return new Vector(xyz.scale(t));
    }
}
