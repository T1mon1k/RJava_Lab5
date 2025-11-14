package taxipark;

public class SuperCar extends Car {
    private final double acceleration;

    public SuperCar(String brand, String model, int year, int maxSpeed, double fuelConsumption, double price,
                    boolean leatherInterior, double acceleration) {
        super(brand, model, year, maxSpeed, fuelConsumption, price, leatherInterior);
        if (acceleration <= 0)
            throw new IllegalArgumentException("Розгін має бути більше 0 сек.!");
        this.acceleration = acceleration;
    }

    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", Розгін 0–100 км/год = " + acceleration + " с }");
    }
}
