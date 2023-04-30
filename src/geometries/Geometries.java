package geometries;

import primitives.Point;
import primitives.Ray;

import java.util.LinkedList;
import java.util.List;

public class Geometries implements Intersectable{
    List<Intersectable> geometries;

    public Geometries(Intersectable... geometries) {

    }

    public void add(Intersectable... geometries){

    }

    /**
     * @param ray
     * @return
     */
    @Override
    public List<Point> findIntersections(Ray ray) {
        List<Point> result = new LinkedList<>();
        for (Intersectable geometry: geometries){
            result.addAll(geometry.findIntersections(ray));
        }
        return result;
    }
}
