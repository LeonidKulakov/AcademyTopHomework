public class Task5 {
    public void print(int n) {
        int length = (int) (Math.log10(n) + 1);
        if (length == 1) {
            System.out.print(n);
        } else {
            System.out.print((int)(n/Math.pow(10,(length-1)))+" ");
            print(n%(int)(Math.pow(10,(length-1))));
        }
    }
}
