
public class classLinkedList {

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

        void insertAtEnd(int value) {
            Node temp = new Node(value);
            if (head == null) {
                // head = temp;
                // tail = temp;
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtStart(int value) {
            Node temp = new Node(value);
            if (head == null) {
                // head=tail=temp;
                insertAtEnd(value);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtIndex(int index, int value) {
            Node temp = new Node(value);
            Node t = head;
            if (index == size()) {
                insertAtEnd(value);
                return;
            } else if (index == 0) {
                insertAtStart(value);
                return;
            }
            for (int i = 0; i < index - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }

        void remove(int index) {
            Node temp = head;
            if (index == 0) {
                head.next = head;
                return;
            }
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
             if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }

        int getAt(int index) {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void printll() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertAtEnd(0);
        ll.insertAtEnd(2);
        ll.printll();
        System.out.println(ll.getAt(4));
    }
}
