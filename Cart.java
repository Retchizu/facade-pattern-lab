public class Cart implements HotelSerivce {
    private Integer numberOfCarts;

    public Cart(Integer numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println(numberOfCarts + " carts requested");
    }

    @Override
    public void service() {
        requestCart();
    }
}
