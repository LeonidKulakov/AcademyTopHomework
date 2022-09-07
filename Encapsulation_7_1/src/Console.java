import java.util.Scanner;

public class Console {

    public int inputInt() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Не корректный ввод, повтори попытку ввода");
            return inputInt();
        }
    }
}
