package chapter2;

public class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode curNode = head;
        for (int i = 0; i <= index; i++) {
            curNode = curNode.next;
        }
        return curNode.val;
    }
    void addAtHead(int val) {
        addAtIndex(0, val);

    }
    void addAtTail(int val) {
        addAtIndex(size, val);
    }
    void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode toadd = new ListNode(val);
        toadd.next = pre.next;
        pre.next = toadd;
        size++;
    }
    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // 链表变为 1->2->3
        System.out.println(myLinkedList.get(1));              // 返回 2
        myLinkedList.deleteAtIndex(1);    // 现在，链表变为 1->3
        System.out.println(myLinkedList.get(1));// 返回 3



    }
}
