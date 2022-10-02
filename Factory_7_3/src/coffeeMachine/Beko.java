package coffeeMachine;

import coffee.IAmericano;
import coffee.IEspresso;
import myException.NoEnergyException;
import myException.ThereIsNoCoffeeException;
import myException.ThereIsNoWaterException;
import myException.WasteCoffeeDinOverflowingException;

public class Beko extends CoffeeMachine implements IAmericano, IEspresso {

    protected int coffeeTank;
    protected int maxCoffeeTank;

    public Beko(int maxCoffee, int maxWater) {
        super(maxCoffee, maxWater);
        super.model = "Beco";
        maxCoffeeTank = 300;
        coffeeTank = 0;
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
    public void getEspresso() {
        if (check()) {
            System.out.println("Налит эспрессо");
            volumeWater -= 30;
            volumeCoffee -= 22;
            coffeeTank += 22;
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
