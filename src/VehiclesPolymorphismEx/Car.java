package VehiclesPolymorphismEx;

public class Car extends Vehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION, tankCapacity);
//   1 this.fuelConsumption = this.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION; working with protected fields
//   2 super.setFuelConsumption(super.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION);

    }

}
