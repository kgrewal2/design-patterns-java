package AbstractFactory;

public class AdidasBallFactory implements BallFactory {
    public Basketball createBasketball(){
        return new Basketball("Red", "Adidas");
    }
    public Volleyball createVolleyball(){
        return new Volleyball("Red", "Adidas");
    }
}