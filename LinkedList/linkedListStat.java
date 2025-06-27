public class linkedListStat {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // System.out.println(a.data);
        // System.out.println(a.next.next.next.data);

        Node temp = a;

        // for(int i=0; i<5; i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        while(temp.next!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
