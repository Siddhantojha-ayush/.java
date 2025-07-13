
import java.util.ArrayList;

public class craete {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // we can use anything Boolean, Float etc.

        l1.add(4);
        l1.add(2);
        l1.add(3);
        l1.add(5);

        System.out.println(l1.get(1));

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+ " ");
        }
        System.out.println();

        l1.add(1, 8);
       System.out.println("Elements in ArrayList: " + l1);

       l1.set(1, 0);
       System.out.println("Elements in ArrayList: " + l1);

       l1.remove(1);
       System.out.println("Elements in ArrayList: " + l1);

       l1.remove(Integer.valueOf(5));
       System.out.println("Elements in ArrayList: " + l1);

    }
}
