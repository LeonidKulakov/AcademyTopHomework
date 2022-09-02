public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {         // Как написать метод меньше 10 строчек не знаю
        Console console = new Console();
        Task1 task1 = new Task1();
        System.out.println("Задача №1 (Вывод чисел в диапазоне)");
        task1.printNumbers(console.inputInt(),console.inputInt());
        Task2 task2 = new Task2();
        System.out.println("\nЗадача №2 (Точная степень двойки)");
        task2.findPowerTwo(console.inputDouble());
        Task3 task3 = new Task3();
        System.out.println("\nЗадача №3 (Сумма цифр числа)");
        task3.print();
        System.out.println("\nЗадача №4 (Цифры числа справа налево)");
        Task4 task4 = new Task4();
        task4.print(console.inputInt());
        System.out.println("\nЗадача №5 (Цифры числа слева направо)");
        Task5 task5 = new Task5();
        task5.print(console.inputInt());
    }
}
