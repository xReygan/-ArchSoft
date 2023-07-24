public class Automobile extends Car implements iGasStation {
    private String bodyType;
    private int numberWheels;
    
    public Automobile(String brand, String model, String color, String fuelType, String gearboxType, String engineCapacity, String bodyType, int numberWheels) {
        super(brand, model, color, fuelType, gearboxType, engineCapacity);
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
    }

    /**
     * метод заправки топливом
     */
    public void refueling() {
        System.out.println("Залили полный бак: " + getFuelType());
    }
    
    /**
     * метод движение
     */
    @Override
    public void movement() {
        System.out.println("Поехали... ");
    }

    /**
     * метод обслуживание
     */
    @Override
    public void service() {
        System.out.println("Проведение сервесного обслуживания... ");
    }

    /**
     * метод переключение передач
     */
    @Override
    public void gearShift() {
        System.out.println("Переключение передачи... ");
    }

    /**
     * метод включение фар
     */
    @Override
    public void turningOnHeadlights() {
        System.out.println("Переключение фар... ");
    }

    /**
     * метод включение дворников
     */
    @Override
    public void turningOnWipers() {
        System.out.println("Переключение дворников... ");
    }

    /**
     * еще немного геттеров и сеттеров
     */
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

    /**
     * вывод на консоль 
     */
    @Override
    public String toString() {
        return  "brand: " + getBrand() + ", model: " + getModel() + ", color: " + getColor() +", fuelType: " + getFuelType() + ", gearboxType: " + getGearboxType() + ", engineCapacity: " + getEngineCapacity() + ", bodyType: " + getBodyType() + ", numberWheels: " + getNumberWheels();
    }
}
