public class Subscriber extends Passenger{


    public Subscriber(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }



    @Override
    void reserveCar(Car car) throws Exception {
        if (car.maxCapacity == 0) {
            throw new Exception("Car is at full capacity");
        }
        this.reservedCar = car;

        // Apply 50% discount on the trip cost
        this.tripCost = car.route.getTripPrice() * 0.5;
    }


    @Override
    void displayInformation() {
        System.out.println("Subscriber Name: " + this.name + ", Car Code: " + this.reservedCar.code + ", Trip Cost: " + this.tripCost);
    }
}

