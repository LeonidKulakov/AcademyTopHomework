import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {

    int[] arrInt = {1, 2, 3, 4, 5, 6};
    String[] srrString = {"123", "234", "345", "456"};
    int[][] arrIntTwo = {{1, 2, 3}, {4, 5, 6}};
    float[][] arrFloat = {{0.1F, 0.2F, 0.3F}, {0.4F, 0.5F, 0.6F}};


    public void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void printArray(int[][] arr) {
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void printArray(float[][] arr) {
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void start() {
        printArray(this.arrFloat);
        printArray(this.arrInt);
        printArray(this.arrIntTwo);
        printArray(this.srrString);
    }

}
