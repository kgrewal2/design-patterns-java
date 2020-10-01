package AbstractFactory;

public class NikeBallFactory implements BallFactory {
    public Basketball createBasketball(){
        return new Basketball("Grey", "Nike");
    }
    public Volleyball createVolleyball(){
        return new Volleyball("Grey", "Nike");
    }
}