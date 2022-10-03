package coffeeMachine;

import coffee.IAmericano;
import coffee.ILate;
import myException.*;

public class PhilipsNew extends CoffeeMachine implements IAmericano,ILate {
    protected int coffeeTank;
    protected int maxCoffeeTank;
    protected int maxMilk;
    protected int milk;
    public PhilipsNew(int maxCoffee, int maxWater, int maxMilk) {
        super(maxCoffee, maxWater);
        this.maxMilk = maxMilk;
        milk = 0;
        maxCoffeeTank = 500;
        coffeeTank = 0;
    }

    @Override
    public void getAmericano() {
        if (check()) {
            System.out.println("Налит американо");
            volumeWater -= 30;
            volumeCoffee -= 22;
            coffeeTank += 22;
        }
    }

    @Override
    public void getLate() {
        if (checkMilk()) {
            System.out.println("Налит лате");
            milk -= 40;
            volumeWater -= 30;
            volumeCoffee -= 22;
            coffeeTank += 22;
        }
    }

    @Override
    public void turnOn() {
        energy = true;
    }

    @Override
    public void turnOff() {
        energy = false;
    }

    @Override
    public void addCoffee() {
        volumeCoffee = maxCoffee;
    }

    @Override
    public void addWater() {
        volumeWater = maxWater;
    }

    @Override
    public void cleanTank() {

    }
    private boolean checkMilk() {
        if (energy) {
            if (volumeCoffee >= 22) {
                if (volumeWater >= 30) {
                    if (milk >= 40) {
                        if ((coffeeTank + 22) <= maxCoffeeTank) {
                            return true;
                        } else {
                            throw new WasteCoffeeDinOverflowingException();
                        }
                    } else {
                        throw new ThereIsNoMilkException();
                    }
                } else {
                    throw new ThereIsNoWaterException();
                }
            } else {
                throw new ThereIsNoCoffeeException();
            }
        } else {
            throw new NoEnergyException();
        }
    }
    private boolean check() {
        if (energy) {
            if (volumeCoffee >= 22) {
                if (volumeWater >= 30) {
                    if ((coffeeTank + 22) <= maxCoffeeTank) {
                        return true;
                    } else {
                        throw new WasteCoffeeDinOverflowingException();
                    }
                } else {
                    throw new ThereIsNoWaterException();
                }
            } else {
                throw new ThereIsNoCoffeeException();
            }
        } else {
            throw new NoEnergyException();
        }
    }
}
