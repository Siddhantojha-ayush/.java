// connected Node
public class commonNode {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node commonData(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int size1 = 0;
        int size2 = 0;

        while(temp1!=null){
            size1++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            size2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if(size1>size2){
            int m = size1-size2;
            for(int i=0; i<m; i++){
                temp1 = temp1.next;
            }
        }else{
             int m = size2-size1;
            for(int i=0; i<m; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(1);
        Node f = new Node(3);
        Node g = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node x = new Node(10);
        Node y = new Node(30);
        Node z = new Node(20);
        x.next = y;
        y.next = z;
        z.next = f;
        display(a);
        display(x);
        Node common = commonData(a, x);
        System.out.println(common.data);
    }
}
