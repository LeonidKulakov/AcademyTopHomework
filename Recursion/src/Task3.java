public class Task3 {

    private int sumDigitOfNumber(int n) {
        if (n < 1) {
            return 0;
        } else {
            return (sumDigitOfNumber(n / 10) + n % 10);
        }
    }

    public void print() {
        Console console = new Console();
        System.out.println("Сумма цифр числа " + sumDigitOfNumber(console.inputInt()));
    }
}
