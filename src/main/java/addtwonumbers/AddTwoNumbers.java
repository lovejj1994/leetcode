package addtwonumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode first, listNode;
        listNode = new ListNode(0);
        first = listNode;
        while (null != l1 || null != l2) {
            int l1Val = 0, l2Val = 0;
            if (null != l1) {
                l1Val = l1.val;
            }
            if (null != l2) {
                l2Val = l2.val;
            }

            int sum = carry + l1Val + l2Val;
            carry = sum / 10;
            listNode.next = new ListNode(sum % 10);
            listNode = listNode.next;

            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            listNode.next = new ListNode(carry);
        }
        return first.next;
    }

}
