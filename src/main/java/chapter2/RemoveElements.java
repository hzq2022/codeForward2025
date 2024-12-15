package chapter2;

public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 6, 3, 4, 5, 6};
        ListNode list = new ListNode(-1);
        ListNode cur = list;

        for (int i = 0; i < ints.length; i++) {
            cur.next = new ListNode(ints[i]);
            cur = cur.next;
        }
        ListNode result = removeElements(list.next, 6);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
    }
}


