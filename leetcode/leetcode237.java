// Linked List

public class leetcode237 {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

        public static void deleteNode(Node current){
            current.data = current.next.data;
            current.next = current.next.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
