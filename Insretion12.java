package sort;

import java.util.Arrays;

/**
 * Insretion12
 */
public class Insretion12 {

    public static void main(String[] args) {
        int [] arr = {4,2,5,3,1};
        Insertionvale(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void Insertionvale(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j =i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                   int temp = arr[j];
                   arr[j] = arr[j - 1];
                   arr[j-1] = temp;

                } else{
                    break;
                }
            }

        
        }
    }  







}