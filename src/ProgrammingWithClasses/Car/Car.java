package ProgrammingWithClasses.Car;

public class Car {

    private String model;
    private Engine engine;
    private Wheels wheels;
    private boolean wheelIsBroken;
    private int fuelLevel;

    public Car(String model, int horsePower, int fuelLevel, boolean wheelIsBroken) {
        this.model = model;
        this.engine = new Engine(horsePower);
        this.wheels = new Wheels();
        this.wheelIsBroken = wheelIsBroken;
        this.fuelLevel = fuelLevel;
    }

    public void showModel() {
        System.out.println("Марка данного автомобиля - " + model);
    }

    public void repairWheel() {
        System.out.println("Колесо было повреждено, теперь поменяно!");
    }

    public void refuel() {
        System.out.println("Бак заправлен. Можно ехать.");
    }

    public void ride() {
        if (wheelIsBroken) {
            repairWheel();
        }
        if (fuelLevel < 10) {
            refuel();
        }
        System.out.println("Машина поехала.");
    }
}
