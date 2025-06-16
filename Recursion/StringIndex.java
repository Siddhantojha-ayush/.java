public class StringIndex {
    public static void main(String[] args) {
        String s = "wsawsa";
        int index = 0;
        char target = 'a';
        System.out.println(returnIndex(s, index, target));
    }
    static int returnIndex(String s, int index, char target){
        if(s.length()==0){
            return -1;
        }
        if(s.charAt(index)==target){
            return index;
        }
        if(index==index-1){
            if(s.charAt(index)==target){
                return index;
            } else{
                return -1;
            }
        }
        return returnIndex(s, index+1,target);
    }
}
