import java.util.Arrays;

public class Task2 {
    private String numberString;
    private int numberFind;
    private int length;

    private void makeStringNumber(int a) {
        for (int i = 0; i < a; i++) {
            this.numberString += String.valueOf(i);

        }
    }

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи длину строки от 1 до 1000");
        this.length = console.inputInt();
        System.out.println("Введи номер позиции от 1 до 1000");
        this.numberFind = console.inputInt();
        this.numberString = "";
        makeStringNumber(this.length);
    }

    public void print() {
        inputData();
        if (this.length > 1000) {
            System.out.println("Не корректный ввод");
        } else {
            System.out.println(this.numberString);
            System.out.println(this.numberString.charAt((this.numberFind-1)));
        }
    }
}
