public class HotelApp {
    public static void main(String[] args) {
        Valet valet = new Valet("JL091");
        Cart cart = new Cart(4);
        HouseKeeping houseKeeping = new HouseKeeping(106);

        FrontDesk frontDesk = new FrontDesk(valet, cart, houseKeeping);

        frontDesk.cartService();
        frontDesk.valetService();
        frontDesk.houseKeepingService();
    }
}
