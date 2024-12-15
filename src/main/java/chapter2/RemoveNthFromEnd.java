package chapter2;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode m = head;
        while (m.next != null) {
            m = m.next;
            count += 1;
        }
        System.out.println(count);
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        for (int i = 0; i < count - n +  1; i++) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return dummy.next;
    }
}
