

public class MAXvalue {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 6, 4};
        int index = 0;
        maxValue(arr, index);
        System.out.println(maxValue(arr, index));
    }
    static int  maxValue(int [] arr, int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int max = maxValue(arr, index+1);
        return Math.max(arr[index], max);
    }
}
