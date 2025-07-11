public class linkedListLength {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int length(Node head){
        int l = 0;
        while (head!=null) {
            l++;
            head=head.next;
        }
        return l;
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
        System.out.println(length(a));
    }
}
