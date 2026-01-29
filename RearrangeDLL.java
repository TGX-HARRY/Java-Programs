public class RearrangeDLL {
    public static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node rearrangedList(Node head) {
        if (head == null || head.next == null) return head;

        Node oddHead = head;
        Node oddPtr = oddHead;
        Node evenHead = head.next; 
        Node evenPtr = evenHead;
        Node ptr = head;
        int pos = 1;
        while(ptr.next != null && ptr != null) {
            
        }

        // combine lists
        evenPtr.next = oddHead;
        oddHead.prev = evenPtr;
        return evenHead;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        
        Node returnedHead = rearrangedList(head);
        Node curr = returnedHead;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
