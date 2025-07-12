public class mergeLessTC {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.print("null ");
        System.out.println();
    }

    public static Node mrg(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        Node temp = new Node(-1);
        Node head = temp;

        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        } else{
            temp.next = temp1;
        }
        return head.next;
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
        Node g = new Node(2);
        Node h = new Node(5);
        Node i = new Node(6);
        Node j = new Node(8);
        g.next = h;
        h.next = i;
        i.next = j;
        display(g);
        Node ans = mrg(a, g);
        display(ans);
     }
}
