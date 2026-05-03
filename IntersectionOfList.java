import java.util.TreeSet;

public class IntersectionOfList {
    public static class Node {
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        } 
        public Node() {
            this.data = 0;
            this.next = null;
        }
    }
    public static Node getIntersection(Node h1, Node h2) {
        Node head = null;
        java.util.TreeSet<Integer> set = new TreeSet<>();

        Node p1 = h1, p2 = h2;
        while(true) {
            if (p1.data == p2.data) {
                set.add(p2.data);
                p2 = p2.next;
            }
            p1 = p1.next;
            if (p1 == null) p1 = h1;
            if (p2 == null) break;
        }
        if (set.isEmpty()) return null;
        else {
            Node ptr = head;
            while(!set.isEmpty()) {
                Node nn = new Node(set.getFirst());
                if (head==null) {
                    head = nn;
                    ptr = head;
                }
                else {
                    ptr.next = nn;
                    ptr = ptr.next;
                }
                set.removeFirst();
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(3);
        Node ans = getIntersection(head1, head2);
        Node ptr = ans;
        while(ptr != null)  {
            System.out.println(ptr.data + ", ");
        }
        return;
    }
}