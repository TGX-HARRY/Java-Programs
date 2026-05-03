public class DeleteGreater {
    public static class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static node deleteGreater(node head, int x) {
        if (head == null) return null;

        while (head != null && head.next != null)  {
            if (head.data > x) {
                head = head.next;
            }
        }
        
        node ptr = head;
        while ( ptr != null && ptr.next != null) {
            if (ptr.next.data > x) {
                ptr.next = ptr.next.next;
                ptr = ptr.next;
            }
            else {
                ptr = ptr.next;
            }
        }
        return head;
    }
}
