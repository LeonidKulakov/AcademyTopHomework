public class Task4 {

    int maxNumberString;

    private void inputData() {
        Console console = new Console();
        System.out.println("Введи кол-во строк");
        this.maxNumberString = console.inputInt();
    }

    private int[][] generateArr() {
        int[][] arr = new int[this.maxNumberString][];
        for (int i = 0; i < this.maxNumberString; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = (int) (Math.random() * 99);
            }
        }
        return arr;
    }

    private int getMaxTrace(int[][] a, int numberCol, int numberStr) {
        int res = a[numberStr][numberCol];
        if (numberStr != a.length - 1) {
            int left = getMaxTrace(a, numberCol, numberStr + 1);
            int right = getMaxTrace(a, numberCol + 1, numberStr + 1);
            res += Math.max(left, right);
        }
        return res;
    }

    public void print() {
        inputData();
        System.out.println("ВНИМАНИЕ!!! Создание массива больше 30 строк может занять некоторое время!");
        int[][] arr = generateArr();
        int sum = getMaxTrace(arr, 0, 0);
        System.out.println();
        for (int i = 0; i < this.maxNumberString; i++) {
            for (int j = 0; j < this.maxNumberString - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Мвксимальная сумма чисел "+sum);
    }
}

