package coffeeMachine;

public abstract class CoffeeMachine {

    protected String model;
    protected int maxCoffee;
    protected int volumeCoffee;
    protected int maxWater;
    protected int volumeWater;
    protected boolean energy;

    public CoffeeMachine(int maxCoffee, int maxWater) {
        this.maxCoffee = maxCoffee;
        this.maxWater = maxWater;
        this.volumeCoffee = 0;
        this.volumeWater = 0;
        energy = false;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void addCoffee();
    public abstract void addWater();

    public abstract void cleanTank();

}
