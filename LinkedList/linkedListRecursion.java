public class linkedListRecursion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void recursion(Node head) {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        recursion(head.next);
    }
    public static void reverse(Node head) {
        if(head==null){
            return;
        }
        reverse(head.next);
        System.out.print(head.data+" ");
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
        recursion(a);
        System.out.println();
        reverse(a);
    }
}
