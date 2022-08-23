import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Application application = new Application();
        System.out.println("Задача №1 ");
        application.task1();
        System.out.println("Задача №2 ");
        application.task2();
        System.out.println("Задача №3 ");
        application.task3();
        System.out.println("Задача №4 ");
        application.task4();
        System.out.println("Задача №5 ");
        application.task5();
        System.out.println("Задача №6 ");
        application.task6();
        System.out.println("Задача №7 ");
        application.task7();
        System.out.println("Задача №8 ");
        application.task8();
        System.out.println("Задача №9 ");
        application.task9();
        System.out.println("Задача №10 ");
        application.task10();
        System.out.println("Задача №11 ");
        application.task11();
        System.out.println("Задача №12 ");
        application.task12();

    }

    private void task1() {
        System.out.println("Введи число");
        int n = scanner.nextInt();
        System.out.print("До обнуления ");
        System.out.println(Integer.toBinaryString(n));
        n = (n &= ~(1 << 31));
        System.out.print("После обнуления ");
        System.out.println(Integer.toBinaryString(n));
    }

    private void task2() {
        System.out.println("Введи степерь числа 2");
        int n = scanner.nextInt();
        System.out.println(2 << (n - 1));
    }

    private void task3() {
        System.out.println("Введи число");
        int n = scanner.nextInt();
        System.out.println("Выбери бит для преобразования ");
        int i = scanner.nextInt();
        System.out.print("Число до: ");
        System.out.println(Integer.toBinaryString(n));
        n = n |= (1 << (31 - i));
        System.out.print("Число после: ");
        System.out.println(Integer.toBinaryString(n));
    }

    private void task4() {
    }

    private void task5() {
        System.out.println("Введи число");
        int n = scanner.nextInt();
        System.out.println("Выбери бит для обнуления ");
        int i = scanner.nextInt();
        System.out.print("До обнуления ");
        System.out.println(Integer.toBinaryString(n));
        n = (n &= ~(1 << (31 - i)));
        System.out.print("После обнуления ");
        System.out.println(Integer.toBinaryString(n));
    }

    private void task6() {
        System.out.println("Введи число");
        int n = scanner.nextInt();
        System.out.println("Выбери бит для преобразования ");
        int i = scanner.nextInt();
        System.out.print("Число до: ");
        System.out.println(Integer.toBinaryString(n));
        n = (n << (31-i)) >>> (31-i);
        System.out.print("Число после: ");
        System.out.println(Integer.toBinaryString(n));
    }

    private void task7() {
        System.out.println("Введи число");
        int n = scanner.nextInt();
        System.out.println("Выбери бит");
        int i = scanner.nextInt();
        System.out.print("Значения бита: ");
        System.out.println((n & (1 << (31-i)) >> (31-i)));
    }

    private void task8() {
    }

    private void task9() {
    }

    private void task10() {
    }

    private void task11() {
    }

    private void task12() {
    }

}
