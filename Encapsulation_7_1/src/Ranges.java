import java.util.Arrays;

public class Ranges {
    private int numbersOfRanges;
    private int[] arrayOfRanges;

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи кол-во диапазонов");
        this.numbersOfRanges = console.inputInt();
        System.out.println("ЗАПОЛНЕНИЕ ДАННЫХ!");
        this.arrayOfRanges = new int[this.numbersOfRanges * 2];
        for (int i = 0; i < this.arrayOfRanges.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Введи начало диапазона ");
                this.arrayOfRanges[i] = console.inputInt();
            } else {
                System.out.println("Введи конец диапазона ");
                this.arrayOfRanges[i] = console.inputInt();
                if (this.arrayOfRanges[i] < this.arrayOfRanges[i - 1]) {
                    System.out.println("По условию задачи ");
                    throw new Error();
                }
            }
        }
    }

    public void print() {
        inputData();
        printRangesLength();
        System.out.println();
        printRangeCrossing();

    }

    private void printRangesLength() {
        System.out.print("Длины диапазонов ");
        for (int i = 0; i < this.arrayOfRanges.length; i += 2) {
            System.out.print((i / 2 + 1) + ") " + (this.arrayOfRanges[i + 1] - this.arrayOfRanges[i]) + " ");
        }
    }

    private void printRangeCrossing() {
        for (int i = 0; i < this.arrayOfRanges.length; i += 2) {
            for (int j = (i + 2); j < this.arrayOfRanges.length; j += 2) {
                if (this.arrayOfRanges[i] > this.arrayOfRanges[j] && this.arrayOfRanges[i] < this.arrayOfRanges[j + 1]) {
                    if (this.arrayOfRanges[i + 1] < this.arrayOfRanges[j + 1]) {
                        System.out.println("Пересечение массивов " + (i / 2 + 1) + " и " + (j / 2 + 1) + ": " + this.arrayOfRanges[i] + " " + this.arrayOfRanges[i + 1]);
                    } else {
                        System.out.println("Пересечение массивов " + (i / 2 + 1) + " и " + (j / 2 + 1) + ": " + this.arrayOfRanges[i] + " " + this.arrayOfRanges[j + 1]);
                    }
                } else if (this.arrayOfRanges[i] < this.arrayOfRanges[j]) {
                    if (this.arrayOfRanges[i + 1] > this.arrayOfRanges[j] && this.arrayOfRanges[i + 1] < this.arrayOfRanges[j + 1]) {
                        System.out.println("Пересечение массивов " + (i / 2 + 1) + " и " + (j / 2 + 1) + ": " + this.arrayOfRanges[j] + " " + this.arrayOfRanges[i + 1]);
                    } else if (this.arrayOfRanges[i + 1] > this.arrayOfRanges[j + 1]) {
                        System.out.println("Пересечение массивов " + (i / 2 + 1) + " и " + (j / 2 + 1) + ": " + this.arrayOfRanges[j] + " " + this.arrayOfRanges[j + 1]);
                    }
                }
            }
        }
    }
}