import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    public int inputInt(){
        int i;
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
        }else {
            System.out.println("Не корректный ввод");
            i = inputInt();
        }
        return i;
    }
}
