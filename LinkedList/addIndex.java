public class addIndex {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public  void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int data, int index){
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while (i<index-1) { 
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        addIndex ll = new addIndex();
        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.printLL();
        ll.add(5, 1);
        ll.printLL();
    }
}
