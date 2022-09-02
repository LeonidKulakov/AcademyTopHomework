public class Task2 {
    public void findPowerTwo (double n){
        if (n == 1){
            System.out.println("YES");
        } else if (n<1) {
            System.out.println("NO");
        }else {
            findPowerTwo(n/2);
        }

    }
}
