public class DesignMinStack {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class MinStack {
        ListNode head;
        ListNode sortedllhead;
        public MinStack() {
            sortedllhead = new ListNode(Integer.MAX_VALUE);
        }

        public void push(int val) {
            if (sortedllhead.val < val) {
                ListNode nn = new ListNode(val);
                nn.next = head;
                head = nn;
            }
            ListNode nn = new ListNode(val);
            nn.next = head;
            head = nn;
        }

        public void pop() {
            if (head.val == sortedllhead.val) {
                sortedllhead = sortedllhead.next;
            }
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return sortedllhead.val;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
