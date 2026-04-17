public class InsertionSortLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode ptr = head.next;
        ListNode prev = head;
        ListNode newHead = head;
        boolean isSorted = true;
        while (ptr != null) {
            while (ptr != null && isSorted == true) {
                if (prev.val < ptr.val) {
                    isSorted = true;
                } else {
                    isSorted = false;
                    break;
                }
                prev = ptr;
                ptr = ptr.next;
            }

            if (isSorted == false) {
                // remove node
                int data = ptr.val;
                prev.next = ptr.next;
                ptr = prev.next;

                // putting num in new list
                ListNode newptr = newHead;
                ListNode newprev = null;
                while (newptr != null) {
                    if (newptr.val < data) {
                        newprev = newptr;
                        newptr = newptr.next;
                    } 
                    else break;
                }
                if (newptr == null || newptr.val == newHead.val) {
                    ListNode nn = new ListNode(data);
                    nn.next = newHead;
                    newHead = nn;
                } 
                else {
                    ListNode nn = new ListNode(data);
                    nn.next = newprev.next;
                    newprev.next = nn;
                }
                isSorted = true;
            }
        }
        return newHead;
    }
    public static void main(String[] args) {
        InsertionSortLL obj = new InsertionSortLL();
        ListNode head = obj.new ListNode(4);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(1);
        head.next.next.next = obj.new ListNode(3);
        ListNode ans = obj.insertionSortList(head);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}