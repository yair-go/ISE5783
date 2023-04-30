package renderer;

import primitives.Color;
import primitives.Point;
import primitives.Vector;

public class Camera {

    private ImageWriter imageWriter;
    private RayTracerBase rayTracer;

    public Camera(Point zero, Vector vector, Vector vector1) {
    }

    public Camera setViewPlaneDistance(int i) {
        return this;
    }

    public Camera setViewPlaneSize(int i, int i1) {
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

    public void writeToImage() {
        imageWriter.writeToImage();
    }

    public void renderImage() {
    }

    public void printGrid(int i, Color color) {
    }
}
