public class AddTwoNumbers {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int val1 = (p != null) ? p.data : 0;
            int val2 = (q != null) ? q.data : 0;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new Node(carry);
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        Node l2 = new Node(5);
        l2.next = new Node(6);  
        l2.next.next = new Node(4);
        Node result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}