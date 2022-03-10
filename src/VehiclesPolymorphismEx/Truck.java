package VehiclesPolymorphismEx;

public class Truck extends Vehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double REFUEL_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        liters *= REFUEL_PERCENTAGE;
        super.refuel(liters);
    }
}
