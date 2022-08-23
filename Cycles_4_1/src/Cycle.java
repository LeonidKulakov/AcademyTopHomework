import java.util.Scanner;

public class Cycle {

    Scanner scanner = new Scanner(System.in);

    /*
        В некоторых задачах диапазоны указаны меньше, для более компактного и читаемого вывода на экран
        Задача 2: Слишком много чисел
        Задача 4: при сложности O от N в квадрате слишком долгий перебор значений при верхней планке выше 10000 (По крайней мере на моей машине)
        Задача 11: Диапазон уменьшен до 1-100, для экономии места на экране
     */
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        System.out.println(" Задача №1");
        cycle.countFibonacci();
        System.out.println("\n Задача №2");
        cycle.countSimpleNumber();
        System.out.println("\n Задача №3");
        cycle.countNarcissisticNumber();
        System.out.println("\n Задача №4");
        cycle.countPerfectNumber();
        System.out.println("\n Задача №5");
        cycle.countPalindrom();
        System.out.println("\n Задача №6");
        cycle.taskSix();
        System.out.println("\n Задача №7");
        cycle.countBitNumber();
        System.out.println("\n Задача №8");
        cycle.findClock();
        System.out.println("\n Задача №9");
        cycle.taskNine();
        System.out.println("\n Задача №10");
        cycle.taskTen();
        System.out.println("\n Задача №11");
        cycle.taskEleven();
        System.out.println("\n Задача №12");
        cycle.sport();
    }

    private void countFibonacci() {
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print("Числа Фибоначчи: 0 ");
        while (c < 10000000) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    private void countSimpleNumber() {
        System.out.print("Простые числа: ");
        int a;
        for (int i = 2; i < 1000; i++) {
            a = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((i % j) == 0) {
                    a++;
                    break;
                }
            }
            if (a == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private void countNarcissisticNumber() {
        int length;
        int number;
        int sum;
        System.out.print("Самовлюбленные числа: ");
        for (int i = 10; i < 1000000; i++) {
            number = i;
            sum = 0;
            length = (int) (Math.log10(number) + 1); //Вычисление длины числа
            for (int j = 0; j < length; j++) {
                sum += Math.pow((number % 10), 3);
                number /= 10;
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }

    private void countPerfectNumber() {
        System.out.print("Совершенные числа: ");
        int sum;
        for (int i = 0; i < 10000; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }

    private void countPalindrom() {
        int number;
        int length;
        int sum = 0;
        System.out.println("Введи целое число: ");
        if (this.scanner.hasNextInt()) {
            number = this.scanner.nextInt();
            length = (int) (Math.log10(number) + 1); //Вычисление длины числа
            System.out.print("Является ли введенное число палиндром? Ответ: ");
            if ((length % 2) == 0) {
                for (int i = 0; i < (length / 2); i++) {
                    sum = (sum * 10) + (number % 10);
                    number /= 10;
                }
                if (number == sum) {
                    System.out.print("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                for (int i = 0; i < (length / 2); i++) {
                    sum = (sum * 10) + (number % 10);
                    number /= 10;
                }
                if ((number / 10) == sum) {
                    System.out.print("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.print("Введено не целое число!");
        }
    }

    private void taskSix() {
        int number;
        int a;
        int b;
        int c;
        int test;
        int counter = 0;
        System.out.print("В диапазоне хранятся значения по заданным параметрам: ");
        for (int i = 10000000; i < 100000000; i++) {
            if (i % 12345 == 0) {
                number = i;
                test = 0;
                for (int j = 0; j < 8; j++) {
                    b = i;
                    a = number % 10;
                    number /= 10;
                    for (int k = 0; k < 8; k++) {
                        c = b % 10;
                        b /= 10;
                        if (a == c) {
                            test++;
                        }
                    }
                }
                if (test == 8) {
                    counter++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.print("\n Всего значений: " + counter);
    }

    private void countBitNumber() {
        System.out.println("Введите целое число: ");
        if (this.scanner.hasNextInt()) {
            int number = this.scanner.nextInt();
            System.out.print("Число " + number + " в двоичном виде: ");
            for (int i = 31; i >= 0; i--) {
                System.out.print((number & (1 << i)) >> i);
            }
        } else {
            System.out.println("Введено не целое число!");
        }
    }

    private void findClock() {
        int minuteRevers;
        int counter = 0;
        System.out.print("Зеркальное время: ");
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (j < 10) {
                    minuteRevers = j * 10;
                } else {
                    minuteRevers = (j % 10) * 10 + j / 10;
                }
                if (i == j || i == minuteRevers) {
                    counter++;
                    if (i < 10) {
                        if (j < 10) {
                            System.out.print("0" + i + ":0" + j + " ");
                        } else {
                            System.out.print("0" + i + ":" + j + " ");
                        }
                    } else {
                        if (j < 10) {
                            System.out.print(i + ":0" + j + " ");
                        } else {
                            System.out.print(i + ":" + j + " ");
                        }
                    }
                }
            }
        }
        System.out.println("\nВсего вариантов: " + counter);
    }

    private void taskNine() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел кратных 3 или 5 в диапазоне от 0 до 1000 равна: " + sum);
    }

    private void taskTen() {
        int test = 0;
        int number = 1;
        int a;
        while (test == 0) {
            number++;
            for (int i = 11; i <= 20; i++) {
                a = number % i;
                if (a == 0) {
                    test++;
                } else {
                    test = 0;
                    break;
                }
            }
            if (test == 10) {
                System.out.println("Минимальное число: " + number);
            } else {
                test = 0;
            }
        }
    }

    private void taskEleven() {
        System.out.print("Числовой ряд: ");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0 && (i % 15) != 0) {
                System.out.print("fizz ");
            } else if ((i % 5) == 0 && (i % 15) != 0) {
                System.out.print("bizz ");
            } else if ((i % 15) == 0) {
                System.out.print("hiss ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    private void sport() {
        System.out.println("Укажи кол-во километров первого дня: ");
        double kmOne;
        double kmTwo;
        int day = 0;
        if (this.scanner.hasNextDouble() || this.scanner.hasNextInt()) {
            kmOne = scanner.nextDouble();
            System.out.println("Укажи кол-во километров последнего дня: ");
            if (this.scanner.hasNextDouble() || this.scanner.hasNextInt()) {
                kmTwo = this.scanner.nextDouble();
                while (kmOne <= kmTwo) {
                    day++;
                    kmOne = kmOne * 110 / 100;
                }
                System.out.println("На достижение результата потребовалось: " + day + " дней");
            } else {
                System.out.println("Не корректный ввод!");
            }
        } else {
            System.out.println("Не корректный ввод!");
        }
    }
}
