package AbstractFactory;

public class Volleyball implements Ball {
    String color;
    String manufacturer;
    String type = "Volleyball";

    public Volleyball(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public void printInfo() {
        System.out.println(color + ", " + manufacturer + ", " + type);
    }
}
