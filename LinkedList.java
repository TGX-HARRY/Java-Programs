public class LinkedList {
    // 16 bytes for 64-bit JVM
    // 12 bytes for 32-bit JVM
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class LL {
        public Node head = null;
        public int size = 1;

        public LL(int data) {
            head = new Node(data);
        }

        public void addAtHead(int data) {
            Node nn = new Node(data);
            nn.next = head;
            head = nn;
            size++;
        }

        public void addAtTail(int data) {
            Node nn = new Node(data);
            Node ptr = head;
            while(ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = nn;
            size++;
        }

        public void insertAt(int index, int data) {
            if (index == 0) addAtHead(data);
            if (index == size) addAtTail(data);
            else {  
                Node ptr = head;
                for(int i=1;i<index;i++) {
                    ptr = ptr.next;
                }
                Node nn = new Node(data);
                nn.next = ptr.next;
                ptr.next = nn;
                size++;
            }
        }

        public void showList() {
            Node ptr = head;
            while(ptr != null) {
                System.out.print(ptr.data + ", ");
                ptr = ptr.next;
            }
        }
    }
    public static void main(String[] args) {
    
        LL ll = new LL(0);
        
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtHead(110);
        ll.addAtHead(220);
        ll.addAtHead(330);
        ll.addAtHead(440);
        ll.insertAt(1, 380);
        System.out.println("Size of list: " + ll.size);
        ll.showList();
        return;
    }
}
