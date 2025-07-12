public class reverseLL {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
        // System.out.print(head.data + " "); //to reverse
        System.out.println();
    }

    public static Node reverse(Node head){
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node agla = curr.next;
            curr.next = prev;

            prev = curr;
            curr = agla;
        }
        head.next = null;
        return prev;
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        Node ans  = reverse(a);
        display(ans);
    }
}
