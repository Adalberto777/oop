package seminarTwoR;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Albert");
        Human human2 = new Human("Azat");
        Human human3 = new Human("Anton");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
