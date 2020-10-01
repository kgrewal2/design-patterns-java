package AbstractFactory;

public class Basketball implements Ball {
    String color;
    String manufacturer;
    String type = "Basketball";

    public Basketball(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public void printInfo() {
        System.out.println(color + ", " + manufacturer + ", " + type);
    }
}
