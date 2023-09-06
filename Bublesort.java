package sort;
import java.util.Arrays;

public class Bublesort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        bubbl(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbl(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }

        }

    }

}

