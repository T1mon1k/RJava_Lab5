package taxipark;

public abstract class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final int maxSpeed;
    private final double fuelConsumption;
    private final double price;
    private final boolean leatherInterior;

    public Car(String brand, String model, int year, int maxSpeed, double fuelConsumption, double price,
               boolean leatherInterior) {
        if (brand == null || brand.isBlank())
            throw new IllegalArgumentException("Марка не може бути порожньою!");
        if (model == null || model.isBlank())
            throw new IllegalArgumentException("Модель не може бути порожньою!");
        if (year < 1950 || year > 2025)
            throw new IllegalArgumentException("Некоректний рік випуску!");
        if (maxSpeed <= 0)
            throw new IllegalArgumentException("Макс. швидкість має бути більше 0!");
        if (fuelConsumption <= 0)
            throw new IllegalArgumentException("Витрата пального має бути більше 0!");
        if (price <= 0)
            throw new IllegalArgumentException("Ціна має бути більше 0!");

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.leatherInterior = leatherInterior;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public double getPrice() {
        return price;
    }
    public boolean hasLeatherInterior() {
        return leatherInterior;
    }
}
