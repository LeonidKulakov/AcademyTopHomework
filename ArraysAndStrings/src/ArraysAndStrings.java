import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArraysAndStrings {

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        System.out.println("Задача №1");
        arraysAndStrings.task1();
        System.out.println("Задача №2");
        arraysAndStrings.task2();
        System.out.println("Задача №3");
        arraysAndStrings.task3();
        System.out.println("Задача №4");
        arraysAndStrings.task4();
        System.out.println("Задача №5");
        arraysAndStrings.task5();
        System.out.println("Задача №6");
        arraysAndStrings.task6();
        System.out.println("Задача №7");
        arraysAndStrings.task7();
        System.out.println("Задача №8");
        arraysAndStrings.task8();
        System.out.println("Задача №9");
        arraysAndStrings.task9();
        System.out.println("Задача №10");
        arraysAndStrings.task10();
    }

    private void task1() {
        System.out.println("Введи строку");
        String s = scanner.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }

    private void task2() {
        int index;
        int count = 0;
        System.out.println("Введи строку");
        String s = scanner.nextLine();
        System.out.println("Введи слово");
        String word = scanner.nextLine();
        while (s.length() >= word.length()) {
            index = s.indexOf(word);
            if (index >= 0) {
                count++;
            } else {
                break;
            }
            s = s.substring((index + word.length()));
        }
        System.out.println("Количество повторений слова в строке " + count);

    }

    private void task3() {
        System.out.println("Введи строку");
        String s = scanner.nextLine();
        System.out.println("Введи заменяемое слово");
        String wordOne = scanner.nextLine();
        System.out.println("Введи слово на которое заменится ");
        String wordTwo = scanner.nextLine();
        System.out.println(s.replace(wordOne, wordTwo));
    }

    private void task4() {
        System.out.println("Введи строку ");
        String s = scanner.nextLine();
        StringBuffer sTwo = new StringBuffer(s);
        sTwo.delete((s.length() / 2), s.length());
        sTwo.reverse();
        String s1 = new String(sTwo);
        if (s.endsWith(s1)) {
            System.out.println("Является палиндромом");
        } else {
            System.out.println("Не является палиндромом");
        }
    }

    private void task5() {
        String str = "мир несправедлив, а в зоне к тому же и жесток! И чтобы выжить, сталкеру " +
                "Грифу приходится быть изворотливым, подлым, циничным и безжалостным. " +
                "Цель, она оправдывает все. Так думал Гриф, когда ходил за хабаром, отнимал " +
                "его у других сталкеров. Гриф думал, что в нем не осталось ничего человеческого," +
                " что его место здесь, в зоне – заповеднике монстров и убийц, но он ошибался. Что " +
                "же заставит матерого ветерана разубедиться в этом, сломать мировоззрение хищника " +
                "и спасти молодого сталкера Алексея?";
        String[] line = str.split("[.!?]\\s*");
        for (String s : line) {
            System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
        }
        System.out.println();
        String stringPattern = "[0-9]+";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Кол-во цисел в тексте: " + count);
        stringPattern = "(.\\s)*.\\.|\\?|!";
        pattern = Pattern.compile(stringPattern);
        matcher = pattern.matcher(str);
        count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Кол-во предложений в тексте " + count);
        stringPattern = "\\p{P}";
        pattern = Pattern.compile(stringPattern);
        matcher = pattern.matcher(str);
        count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Кол-во знаков припинания " + count);
    }

    private void task6() {
        System.out.println("Введти длинну массива ");
        int lengthArray = scanner.nextInt();
        int[] arr = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Введи элемент массива № " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Сумма элементов равка " + sum + " Среднее арифметическое равно " + (sum / lengthArray));
    }

    private void task7() {
        System.out.println("Введти длинну массива ");
        int lengthArray = scanner.nextInt();
        int[] arr = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Введи элемент массива № " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введи число для поиска");
        int numberSearch = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < lengthArray; i++) {
            if (numberSearch == arr[i]) {
                count++;
            }
        }
        System.out.println("Число " + numberSearch + " содержится в массиве " + count + " раз");
    }

    private void task8() {
        int lengthArray = (int) (Math.random() * 10);
        double[] arr = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            arr[i] = Math.random() * 200 - 100;
        }
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (double a : arr) {
            if (a > 0) {
                countPositive++;
            } else if (a < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Положительных чисел " + countPositive + " Отрицательных чисел " + countNegative + " Нолей " + countZero);
    }

    private void task9() {
        int lengthArray = (int) (Math.random() * 10);
        int[] arr = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            arr[i] = (int) (Math.random() * 200 - 100);
        }
        int sumNegative = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int multiplication3 = 1;
        int multiplication = 1;
        for (int i = 0; i < lengthArray; i++) {
            if (arr[i] < 0) {
                sumNegative += arr[i];
            }
            if ((arr[i] % 2) == 0) {
                sum2 += arr[i];
            } else {
                sum1 += arr[i];
            }
            if ((i % 3) == 0 && i != 0) {
                multiplication3 *= arr[i];
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < lengthArray; i++) {
            if (arr[i] > 0) {
                count1 = i;
                break;
            }
        }
        for (int i = (lengthArray - 1); i > 0; i--) {
            if (arr[i] > 0) {
                count2 = i;
                break;
            }
        }
        for (int i = count1; i <= count2; i++) {
            sum3 += arr[i];
        }
        int min = arr[0];
        int max = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        multiplication = min * max;
        System.out.println("Сумму отрицательных чисел " + sumNegative + " Сумму четных чисел " + sum2 + " Сумму нечетных чисел " + sum1 + " Произведение элементов с индексами кратными 3 " + multiplication3 + "\nПроизведение элементов между минимальным и максимальным элементом " + multiplication + " Сумму элементов, находящихся между первым и последним положительными элементами " + sum3);
    }

    private void task10() {
    }
}
