import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    private String makeStringNumber() {
        String str = "";
        System.out.println("ВНИМАНИЕ!!! создание строки может занять некоторое время");
        for (int i = 0; i <= 99999; i++) {
            str += String.valueOf(i);
            str += " ";
        }
        return str;
    }

    private int countUnluckyNumbers() {
        int count = 0;
        Pattern pattern = Pattern.compile("4|13");
        Matcher matcher = pattern.matcher(makeStringNumber());
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public void print() {
        System.out.println("Не счастливых чисел " + countUnluckyNumbers());
    }
}
