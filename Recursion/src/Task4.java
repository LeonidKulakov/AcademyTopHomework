public class Task4 {
    public void print(int n) {
        int length = (int) (Math.log10(n) + 1);
        if (length == 1) {
            System.out.print(n);
        } else {
            System.out.print(n % 10 + " ");
            print(n / 10);
        }
    }
}
