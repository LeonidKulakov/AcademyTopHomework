public class Task1 {
    public int printNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a);
            return a;
        } else if (a < b) {
            System.out.print(a + " ");
            return printNumbers(a + 1, b);
        } else {
            System.out.print(a + " ");
            return printNumbers(a - 1, b);
        }

    }
}
