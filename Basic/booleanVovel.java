import java.util.Scanner;

public class booleanVovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Word: ");
        String Word = sc.nextLine();

        boolean result = vovel(Word);

        if(result) {
            System.out.println("All digits are vovel.");
        } else {
            System.out.println("Not all digits are vovel.");
        }
    }

    public static boolean vovel(String Word) {
        Word = Word.toLowerCase();
        for(int i=0; i<Word.length(); i++){
            char chr = Word.charAt(i);
            if (chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u' ) {
                return false;
            }
        }
        return true;
    }
}
