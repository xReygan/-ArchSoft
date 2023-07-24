//марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки 
//передач, объём двигателя; методы: движение, обслуживание, переключение 
//передач, включение фар, включение дворников.

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberWheels;
    private String fuelType;
    private String gearboxType;
    private String engineCapacity;

    /**
     * brand - марка;
     * model - модель;
     * color - цвет;
     * bodyType - тип кузова;
     * numberWheels - число колёс;
     * fuelType - тип топлива;
     * gearboxType - тип коробки передач;
     * engineCapacity - объём двигателя;
     */

    public Car(String brand, String model, String color, String fuelType, String gearboxType, String engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
     }

    /**
     * метод движение
     */
    public void movement() {

    }

    /**
     * метод обслуживание
     */
    public void service() {

    }

    /**
     * метод переключение передач
     */
    public void gearShift() {

    }

    /**
     * метод включение фар
     */
    public void turningOnHeadlights() {

    }

    /**
     * метод включение дворников
     */
    public void turningOnWipers() {

    }

    /**
     * метод заправки топливом
     */
    public void refueling(String fuelType) {
        
    }

    /**
     * геттеры и сеттеры на все случаи
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
