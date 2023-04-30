package primitives;

public class Ray {
    private Point p0;
    private Vector dir;

    public Ray(Point point, Vector dir) {
        this.p0 = point;
        this.dir = dir.normalize();
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
