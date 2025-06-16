import java.util.*;
import java.util.Scanner;

public class  countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("word: ");
        String word = sc.nextLine();

        System.out.println("NO. of vowels in word are: " + count(word));
    }

public static int count(String word) {
    int c = 0;
    for(int i= 0; i<word.length();i++){
        char ch = Character.toLowerCase(word.charAt(i)); 
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            c++;
        }
    }
    
    return c;
}
}
