public class Task3 {
    String[] subStr;
    String str;

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи строку для разделения на слова");
        this.str = console.inputString();
    }


    private void separatorWord() {
        inputData();
        String delimeter = "!\\s|\\s|\\?\\s|\\.\\s|\\.|\\?|!";
        this.subStr = str.split(delimeter);
    }

    private int countAverageLength() {
        separatorWord();
        int count = 0;
        for (int i = 0; i < this.subStr.length; i++) {
            count += this.subStr[i].length();
        }
        count = count / this.subStr.length;
        return count;
    }

    public void print() {
        System.out.println("Средняя длина слова в строке " + countAverageLength());
    }
}
