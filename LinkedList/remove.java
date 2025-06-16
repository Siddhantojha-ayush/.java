public class remove {
    public static class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    int size = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
        } else{
            newNode.next=head;
            head = newNode;
        }
        
    }

    public int removeFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        return  -1;
    }
    public  void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        remove ll = new remove();
        ll.addFirst(3);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(67);
        ll.printLL();
        ll.removeFirst();
        ll.printLL();
    }

}
