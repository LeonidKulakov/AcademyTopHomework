import java.lang.reflect.Array;

public class Task3 {

    final int lowLimit = 97;
    final int highLimit = 122;
    private int maxStringLength;
    private int maxWordLength;
    private int arrayLength;

    public void print() {
        inputData();
        String[] strArr = generateStringArray();
        System.out.println("Вывод массива в строчку ");
        for (String s : strArr) {
            System.out.print(s);
        }
        System.out.println("\n\nВывод отсортированного масиисва по числу слов\n");
        for (String s : sortLength(strArr)) {
            System.out.println(s);
        }
        System.out.println("\n\nВывод отсортированного масиисва по убыванию алфавита\n");
        for (String s : sortZ_A(strArr)) {
            System.out.println(s);
        }
    }

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи максимальное число слов строки");
        this.maxStringLength = console.inputInt();
        System.out.println("Введи максимальную длину слова");
        this.maxWordLength = console.inputInt();
        System.out.println("Введи число строк");
        this.arrayLength = console.inputInt();

    }

    private String generateString() {
        int stringLength = (int) (Math.random() * (this.maxStringLength - 1) + 1);
        int wordLength;
        char[] charGen;
        String str = "";
        String word;
        for (int i = 0; i < stringLength; i++) {
            wordLength = (int) (Math.random() * (this.maxWordLength - 1) + 1);
            charGen = new char[wordLength];
            for (int j = 0; j < wordLength; j++) {
                charGen[j] = (char) (Math.random() * (this.highLimit - this.lowLimit) + this.lowLimit);
            }
            word = String.valueOf(charGen);
            str += word + " ";
        }
        return str;
    }

    private String[] generateStringArray() {
        String[] strArr = new String[this.arrayLength];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = generateString();
        }
        return strArr;
    }

    /**
     * Сортировка пузырьком по кол-ву слов,
     * определение кол-ва слов хорошо бы вынести в отдельный метод,
     * но боюсь придестя использовать магию вуду,
     * что бы после внесения изменений метод продолжил работать.
     */
    private String[] sortLength(String[] str) {
        boolean isSorted = false;
        String buf;
        int firstI;
        int secondI;
        int count;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.arrayLength - 1; i++) {
                count = 0;
                for (int j = 0; j < str[i].length(); j++) {
                    if (str[i].charAt(j) == ' ') {
                        count++;
                    }
                }
                firstI = count;
                count = 0;
                for (int j = 0; j < str[i + 1].length(); j++) {
                    if (str[i + 1].charAt(j) == ' ') {
                        count++;
                    }
                }
                secondI = count;
                if (firstI > secondI) {
                    isSorted = false;
                    buf = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = buf;
                }
            }
        }
        return str;
    }

    private String[] sortZ_A(String[] str) {
        boolean isSorted = false;
        String buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.arrayLength - 1; i++) {
                if (str[i].charAt(0) < str[i+1].charAt(0)) {
                    isSorted = false;
                    buf = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = buf;
                }
            }
        }
        return str;
    }
}
