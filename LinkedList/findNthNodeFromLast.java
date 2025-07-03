
public class findNthNodeFromLast {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {

        Node head = null;
        Node tail = null;
        int size = 0;

        void insertHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
                size++;
                return;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        Node removeFromLastIndex(int idx) {
            Node temp = head;
            if (idx <= 0 || idx > size) {
                System.out.println("wrong input");
                return null;
            }
            if (idx == size) {
                head = head.next;
                size--;
                return head;
            }

            for (int i = 0; i < (size - idx); i++) {
                temp = temp.next;
            }
            Node removed = temp;
            return removed;
        }

        Node oneTraversal(int idx){
            Node fast = head;
            Node slow = head;
            for(int i=0; i<idx; i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } 

        void printll() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertHead(4);
        ll.insertHead(6);
        ll.insertHead(7);
        ll.insertHead(8);
        ll.insertHead(9);
        ll.insertHead(10);
        ll.printll();
        // Node deleted = ll.removeFromLastIndex(3);
        // System.out.println(deleted.data);
        Node twoPointer = ll.oneTraversal(5);
        System.out.println(twoPointer.data);
    }

}
