public class middleElementDelete {
    public static class Node{
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
        Node f = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    }
}
