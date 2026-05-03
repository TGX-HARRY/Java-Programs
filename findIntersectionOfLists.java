import java.util.HashSet;
import java.util.TreeSet;

public class findIntersectionOfLists {
    // question: find the intersection of 2 linked lists and return them as a 3rd linked list
    // in ascending order with no repetition of elements
    // example: list 1 = {7,1,2,3,4,5}, list2 = {2,4,6,8}
    // output: list 3 = {2, 4}
    // thinking: put list 1 in one set, then compare the element of list 2 with set 
    // if found in set of list 1 elements, put it in TreeSet to maintain ascending order and no repetition
    // finally create a new linked list from TreeSet elements
    // TreeSet is used to maintain ascending order and no repetition
    // HashSet is used for fast lookup
    public static class Node {
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node intersectionOfLists(Node head1, Node head2) {
        HashSet<Integer> l1 = new HashSet<>();
        Node ptr = head1;
        while(ptr != null) {
            l1.add(ptr.data);
            ptr = ptr.next;
        }
        TreeSet<Integer> intersection = new TreeSet<>();
        ptr = head2;
        while(ptr != null) {
            if (l1.contains(ptr.data)) {
                intersection.add(ptr.data);
            }
            ptr = ptr.next;
        }
        if (intersection.isEmpty()) return null;
        Node head = null;
        for(int i: intersection) {
            Node nn = new Node(i);
            if (head == null) {
                head = nn;
                ptr = head;
            }
            ptr.next = nn;
            ptr = ptr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        // create list 1
        Node head1 = new Node(7);
        head1.next = new Node(1);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(5);
        // create list 2
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        // find intersection
        Node intersectionHead = intersectionOfLists(head1, head2);
        // print intersection list
        Node ptr = intersectionHead;
        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}
