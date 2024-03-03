public class NonSubscriber extends Passenger{


    boolean discountCoupon;

    public NonSubscriber(String name, String ID, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, ID, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }



    @Override
    public void reserveCar(Car car) throws Exception {// لحجز سياره واذا فشل الحجز يتم رمي الاستثناء
        if (car.maxCapacity <= 0) {// اذا تحقق اذا السياره قد امتلئت بالكامل
            throw new RuntimeException("Car is fully booked.");
        }
        this.reservedCar = car;// اذا نجح الحجز يتم تعيين السياره المحجوزه للراكب
        // Apply discount based on the presence of a discount coupon
        //حساب تكلفه الرحله بناء على وجود خصم اذا فيه خصم بيخصم 10 من سعر الرحله والا يستخدم سعر الرحله بدون خصم
        this.tripCost = discountCoupon ? car.route.getTripPrice() - (car.route.getTripPrice() * 0.1) : car.route.getTripPrice(); //  applying 10% discount
    }

    @Override
    void displayInformation() {

    }
}

