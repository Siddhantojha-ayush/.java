public class nextGreaterElement {
      public static void main(String[] args) {
        int[] arr= {1,3,4,6,8,4,8,0};
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            res[i] = -1;
            for(int j=i+1; j<res.length; j++){
                if(arr[i]<arr[j]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(res[i]+" ");
        }
      }
}
