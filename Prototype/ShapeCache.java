package Prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeName){
        Shape cachedShape = shapeHashtable.get(shapeName);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("Circle");
        shapeHashtable.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("Rectangle");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }
}
