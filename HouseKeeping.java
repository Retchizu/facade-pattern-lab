public class HouseKeeping implements HotelSerivce {
    private Integer roomNumber;

    public HouseKeeping(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("Cleaning room " + roomNumber);
    }

    @Override
    public void service() {
        cleanRoom();
    }

}
