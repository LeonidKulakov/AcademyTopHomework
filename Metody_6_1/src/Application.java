import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        System.out.println("Задача №1");
        Task1 task1 = new Task1();
        task1.print();
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
