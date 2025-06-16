import java.util.*;

public class copyArray {
    public static void main(String[] args) {
        
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] myArray = new int[originalArray.length];

        for(int i=0; i<originalArray.length; i++){
            myArray[i] = originalArray[i]; 
        }

        System.out.println(Arrays.toString(myArray));
    }
}
