import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private String stringFind;
    private char charFind;
    private int count;

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи строку ");
        this.stringFind = console.inputString();
        System.out.println("Введи символ ");
        this.charFind = console.inputChar();
    }

    private int findCharInString() {
        inputData();
        this.count = 0;
        Pattern pattern = Pattern.compile(String.valueOf(this.charFind));
        Matcher matcher = pattern.matcher(this.stringFind);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public void print() {
        findCharInString();
        if (this.count > 0) {
            System.out.println("Кол-во символов в строке " + this.count);
        } else {
            System.out.println("Символов не найдено");
        }
    }
}
