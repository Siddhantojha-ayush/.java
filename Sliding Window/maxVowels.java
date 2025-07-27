
import java.util.Scanner;

public class maxVowels {
    public static int countVOwels(String s, int k){
        int vowels = 0;
        int maxVowels = 0;
        char str[] = s.toCharArray();
        for(int i=0; i<k; i++){
            if("aeiouAEIOU".contains(String.valueOf(str[i]))){
                vowels++;
            }
        }
        maxVowels = vowels;
        for(int i =k; i<s.length(); i++){
            if("aeiouAEIOU".contains(String.valueOf(str[i-k]))) vowels--;
            if("aeiouAEIOU".contains(String.valueOf(str[i]))) vowels++;
            maxVowels = Math.max(vowels, maxVowels);
        }
        return maxVowels;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        // System.out.println(s);
        // System.out.println(k);
        System.out.println(countVOwels(s, k));
    }
}
