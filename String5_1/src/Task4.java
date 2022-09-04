import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    String str;

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи строку для разделения на слова");
        this.str = console.inputString();
    }

//    public void findWord(){
//        inputData();
//        Pattern pattern = Pattern.compile("[a-yA-Y]{1}.[b-zB-Z]\\s");
//        Matcher matcher = pattern.matcher(this.str);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
//    }

}
