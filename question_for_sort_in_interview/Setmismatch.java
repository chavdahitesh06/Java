package sort.question_for_sort_in_interview;

import java.util.Arrays;

public class Setmismatch {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    

    static int [] cycle(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int x = arr[i] - 1;
            if (arr[i] != arr[x] ) {
                swap(arr , i , x);
                
            }else{
                i++;
            }
            
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
                
            }
            
        }
        return new int[]{-1,-1};
    }

    static void swap (int[]arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
    
}
