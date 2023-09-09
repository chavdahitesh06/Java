package function;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        // create a new array
        int [] arr = {1,34,23,56,43,56};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
      nums[0] = 45;
    }
    
    
}
