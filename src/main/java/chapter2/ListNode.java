package chapter2;

public class ListNode {
    // 节点的值
    int val;
    // 下一个节点
    ListNode next;
    // 节点的构造函数（无参）
    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
