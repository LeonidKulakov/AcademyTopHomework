public class Task1 {

    private int[][] array;

    public Task1() {
    }

    public Task1(int[][] array) {
        this.array = array;
    }

    public int[][] makeOneMatrix(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public int[][] makeZeroMatrix(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = 0;
            }
        }
        return arr;
    }


    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] addMatrix(Task1 arr) {
        int[][] arrSum = new int[this.array.length][this.array[0].length];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[0].length; j++) {
                arrSum[i][j] = array[i][j] + arr.array[i][j];
            }
        }
        return arrSum;
    }

    public int[][] multiplication(int a) {
        int[][] arrSum = new int[this.array.length][this.array[0].length];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[0].length; j++) {
                arrSum[i][j] = array[i][j] * a;
            }
        }
        return arrSum;
    }
}
