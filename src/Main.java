//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try {
            // Create 2 routes
            Route route1 = new Route("Start 1", "Destination 1", 100);
            Route route2 = new Route("Start 2", "Destination 2", 150);

            // Create 2 cars, one of them has maximum capacity equal to zero
            Car car1 = new Car("C1", route1, 1);
            Car car2 = new Car("C2", route2, 0); // Car with max capacity 0

            //Create an array of Passengers
            Passenger[] passengers = new Passenger[2];
            passengers[0] = new Subscriber("Haya", "33444", car1, 0);
            passengers[1] = new NonSubscriber("Jana", "22344", car2, 0, true);

            // Assign a different car object to each passenger and then display their information
            for (Passenger passenger : passengers) {
                passenger.reserveCar(passenger.getReservedCar());//حجز سياره ع كل راكب
                passenger.displayInformation();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }








