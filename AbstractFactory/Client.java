package AbstractFactory;

class Client {
    public static void main(String[] args) {
        BallFactory nike = new NikeBallFactory();
        Ball nikeBasketball = nike.createBasketball();
        Ball nikeVolleyball = nike.createVolleyball();
        nikeBasketball.printInfo();
        nikeVolleyball.printInfo();

        BallFactory adidas = new AdidasBallFactory();
        Ball adidasBasketball = adidas.createBasketball();
        Ball adidasVolleyball = adidas.createVolleyball();
        adidasBasketball.printInfo();
        adidasVolleyball.printInfo();
    }
}