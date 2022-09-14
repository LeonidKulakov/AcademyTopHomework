import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        System.out.println("Задача №1");
        int[][] a = {{5, 7, 3}, {7, 0, 1}, {8, 1, 2}};
        int[][] b = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        Task1 task1 = new Task1(a);
        Task1 task11 = new Task1(b);
        task1.print(task1.makeOneMatrix(4));
        task1.print(task1.makeZeroMatrix(4));
        task1.print(task1.addMatrix(task11));
        task1.print(task1.multiplication(2));
        System.out.println("\nЗадача №2");
        Task2 task2 = new Task2();
        task2.start();
        System.out.println("\nЗадача №3");
        Task3 task3 = new Task3();
        task3.print();
        System.out.println("\nЗадача №4");
        Task4 task4 = new Task4();
        task4.print();
        System.out.println("\nЗадача №5");
        Task5 task5 = new Task5();
        task5.print();
    }

}
