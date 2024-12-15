package chapter2;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curHeadB =  headB;
        ListNode curHeadA =  headA;
        while (curHeadA != curHeadB) {
            if (curHeadA == null) {
                curHeadA = headB;
            } else {
                curHeadA = curHeadA.next;

            }
            if (curHeadB == null) {
                curHeadB = headA;
            } else {
                curHeadB = curHeadB.next;
            }
        }
        return curHeadA == null ? null : curHeadA;
    }
}
