import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    public String inputString() {
        String str = scanner.nextLine();
        return str;

    }

    public char inputChar() {
        char ch = scanner.next().charAt(0);
        return ch;
    }

    public int inputInt() {
        int i;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        }else {
            System.out.println("Введено не число, введи опять");
            i=inputInt();
        }
        return i;
    }
}
