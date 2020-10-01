package Prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("Circle");
        System.out.println(circle.getType());

        Shape rectangle = ShapeCache.getShape("Rectangle");
        System.out.println(rectangle.getType());

        Shape anotherRectangle = ShapeCache.getShape("Rectangle");
        System.out.println(anotherRectangle.getType());


    }
}
