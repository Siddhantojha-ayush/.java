
public class middleElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node returnMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){ 
            //for even case if we want to return left middle then fast.next.next != null and for right middle fast != null          
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
        Node result = returnMiddle(a);
        System.out.println(result.data);
    }
}
