package coffeeMachine;

import coffee.IAmericano;
import coffee.ICappuccino;
import coffee.IEspresso;
import coffee.ILate;
import myException.*;

public class PhilipsMilk extends Philips implements IAmericano, IEspresso, ILate, ICappuccino {

    protected int maxMilk;
    protected int milk;


    public PhilipsMilk(int maxCoffee, int maxWater, int maxMilk) {
        super(maxCoffee, maxWater);
        this.maxMilk = maxMilk;
        milk = 0;
    }

    public void addMilk() {
        milk = maxMilk;
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
    public void getCappuccino() {
        if (checkMilk()) {
            System.out.println("Налит капучино");
            milk -= 50;
            volumeWater -= 30;
            volumeCoffee -= 22;
            coffeeTank += 22;
        }
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
}

