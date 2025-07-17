
public class llImplementation {

    public static class Node {

        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class llStack {

        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.Next = head;
            head = temp;
            size++;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.Next);
            System.out.print(h.data+" ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.Next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int temp = head.data;
            head = head.Next;
            size--;
            return temp;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        llStack st = new llStack();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}
