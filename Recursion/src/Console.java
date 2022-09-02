import java.util.Scanner;

public class Console {
    public int inputInt() {
        System.out.println("Введи целое число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Не корректный ввод");
            return inputInt();
        }
    }

    public double inputDouble() {
        System.out.println("Введи целое число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Не корректный ввод");
            return inputDouble();
        }
    }
}