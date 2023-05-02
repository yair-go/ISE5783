package primitives;

import java.util.Objects;

public class Ray {
    private Point p0;
    private Vector dir;

    public Ray(Point point, Vector dir) {
        this.p0 = point;
        this.dir = dir.normalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return Objects.equals(p0, ray.p0) && Objects.equals(dir, ray.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p0, dir);
    }

    public Point getP0() {
        return null;
    }

    public Vector getDir() {
        return null;
    }
    public Point getPoint(double t) {
        return p0.add(dir.scale(t));
    }
}
