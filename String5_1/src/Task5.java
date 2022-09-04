public class Task5 {
    String[] subStr;
    String str;

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи строку для разделения на слова");
        this.str = console.inputString();
    }


    private void separatorWord() {
        inputData();
        String delimeter = "\\s|:";
        this.subStr = str.split(delimeter);
    }

    private int countEvenWord() {
        separatorWord();
        int count = 0;
        for (int i = 0; i < this.subStr.length; i++) {
            if ((this.subStr[i].length() % 2) == 0) {
                count++;
            }
        }
        return count;
    }

    public void print() {
        System.out.println("Слов с четным кол-вом букв " + countEvenWord());
    }
}
