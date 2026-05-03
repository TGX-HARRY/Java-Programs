public class DoublyLinkedList {

    // 20 bytes for 64-bit JVM
    // 16 bytes for 32-bit JVM
    static class NODE {
        public int data;
        public NODE prev;
        public NODE next;

        public NODE(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static class DLL {
        public NODE head;
        public int size = 1;

        public DLL(int data) {
            head = new NODE(data);
        }

        public void addAtHead(int data) {
            NODE nn = new NODE(data);
            head.prev = nn;
            nn.next = head;
            head = nn;
            size++;
        }
        public void insertAt(int index, int data) {
            if (index == 0) addAtHead(data);
            if (index == size) addAtTail(data);
            else {
                NODE nn = new NODE(data);
                NODE ptr = head;
                for(int i=1;i<index;i++) {
                    ptr = ptr.next;
                }
                nn.prev = ptr;
                nn.next = ptr.next;
                ptr.next = nn;
                size++;
            }
        }
        public void addAtTail(int data) {
            NODE ptr = head;
            while(ptr.next != null) {
                ptr = ptr.next;
            }
            NODE nn = new NODE(data);
            nn.prev = ptr;
            ptr.next = nn;
            size++;
        }

        public void showList() {
            NODE ptr = head;
            while(ptr != null) {
                System.out.print(ptr.data + ", ");
                ptr = ptr.next;
            }
        }
    }
    
    public static void main(String[] args) {

        DLL ll = new DLL(0);

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
