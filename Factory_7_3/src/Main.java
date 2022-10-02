import coffeeMachine.Beko;
import coffeeMachine.Philips;
import coffeeMachine.PhilipsMilk;
import myException.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        Beko beko = new Beko(300, 100);
        Philips philips = new Philips(1400, 1600);
        beko.turnOn();
        beko.addCoffee();
        beko.addWater();
        try {
            for (int i = 0; i < 30; i++) {
                beko.getEspresso();
            }
        }catch (NoEnergyException e){
            System.out.println("Нет электричества");
        }catch (ThereIsNoCoffeeException e){
            System.out.println("Нет кофе");
        }catch (ThereIsNoWaterException e){
            System.out.println("Нет воды");
        }catch (WasteCoffeeDinOverflowingException e){
            System.out.println("Бак переполнен");
        }
        philips.cleanTank();
        PhilipsMilk philipsMilk = new PhilipsMilk(400,1000,100);
        philipsMilk.turnOn();
        philipsMilk.addCoffee();
        philipsMilk.addWater();
        philipsMilk.addMilk();
        System.out.println("_________________________");
        try {
            for (int i = 0; i < 5; i++) {
                philipsMilk.getLate();
            }
        }catch (NoEnergyException e){
            System.out.println("Нет электричества");
        }catch (ThereIsNoCoffeeException e){
            System.out.println("Нет кофе");
        }catch (ThereIsNoWaterException e){
            System.out.println("Нет воды");
        }catch (WasteCoffeeDinOverflowingException e){
            System.out.println("Бак переполнен");
        }catch (ThereIsNoMilkException e){
            System.out.println("Нет молока");
        }
    }
}
