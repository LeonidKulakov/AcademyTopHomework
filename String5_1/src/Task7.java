public class Task7 {

    private String inputString() {
        Console console = new Console();
        System.out.println("Введи строку для замены символов ");
        String str = console.inputString();
        return str;
    }

    private String changeChar() {
        String str = inputString();
        char[] arrChar = str.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            if (Character.isUpperCase(arrChar[i])) {
                arrChar[i] = Character.toLowerCase(arrChar[i]);
            } else if (Character.isLowerCase(arrChar[i])) {
                arrChar[i] = Character.toUpperCase(arrChar[i]);
            } else if (arrChar[i] >= 48 && arrChar[i] <= 57) {
                arrChar[i] = 95;
            }
        }
        str = String.valueOf(arrChar);
        return str;
    }

    public void print() {
        System.out.print("Новая строка: " + changeChar());

    }
}
