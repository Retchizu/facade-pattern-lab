
public class Valet implements HotelSerivce {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        System.out.println(plateNumber + " is being picked up");
    }

    @Override
    public void service() {
        pickUpVehicle();
    }

}