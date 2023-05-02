package renderer;

import primitives.Color;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Camera {

    private final Vector vRight;
    private final Point p0;

    private ImageWriter imageWriter;
    private RayTracerBase rayTracer;
    private int distance;
    private int width;
    private int height;

    public Camera(Point p0, Vector vTo, Vector vUp) {
        vRight = vTo.crossProduct(vUp).normalize();
        this.p0 = p0;
    }

    public Camera setViewPlaneDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public Camera setViewPlaneSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    public Camera setImageWriter(ImageWriter imageWriter) {
        this.imageWriter = imageWriter;
        return this;
    }

    public Camera setRayTracer(RayTracerBase rayTracer) {
        this.rayTracer = rayTracer;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void writeToImage() {
        imageWriter.writeToImage();
    }

    public void renderImage() {
    }

    public void printGrid(int i, Color color) {
    }

    public Ray constructRay(int nX, int nY, int i, int j) {
        return null;
    }
}
