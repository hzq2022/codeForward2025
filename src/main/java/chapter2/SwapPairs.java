package chapter2;

public class SwapPairs {
     public ListNode swapPairs(ListNode head) {
            // 奇数长度时返回head，偶数长度时返回head为空
            if (head == null || head.next == null) {
                return head;
            }
            ListNode next = head.next;
            head.next = swapPairs(next.next);
            next.next = head;
            return next;
        }
}
