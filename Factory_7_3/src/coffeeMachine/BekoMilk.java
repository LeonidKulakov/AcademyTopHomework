package coffeeMachine;

import coffee.IAmericano;
import coffee.ICappuccino;
import coffee.IEspresso;
import coffee.ILate;
import myException.*;

public class BekoMilk extends Beko implements IAmericano, IEspresso, ICappuccino, ILate {

    protected int maxMilk;
    protected int milk;


    public BekoMilk(int maxCoffee, int maxWater, int maxMilk) {
        super(maxCoffee, maxWater);
        this.maxMilk = maxMilk;
        milk = 0;
    }
    public void addMilk(){
        milk = maxMilk;
    }
    @Override
    public void getLate() {
        if (energy) {
            if (volumeCoffee >= 22) {
                if (volumeWater >= 30) {
                    if (milk >= 40) {
                        if ((coffeeTank + 22) <= maxCoffeeTank) {
                            System.out.println("Налит лате");
                            milk -= 40;
                            volumeWater -= 30;
                            volumeCoffee -= 22;
                            coffeeTank += 22;
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

    @Override
    public void getCappuccino() {
        if (energy) {
            if (volumeCoffee >= 22) {
                if (volumeWater >= 30) {
                    if (milk >= 40) {
                        if ((coffeeTank + 22) <= maxCoffeeTank) {
                            System.out.println("Налит капучино");
                            milk -= 50;
                            volumeWater -= 30;
                            volumeCoffee -= 22;
                            coffeeTank += 22;
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

