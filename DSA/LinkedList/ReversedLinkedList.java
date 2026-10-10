package LinkedList;

public class ReversedLinkedList {
    public static void main(String args[]) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(50);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        ListNode head = l1;
        ReversedLinkedList rll = new ReversedLinkedList();
        head = rll.reverse(head);
        rll.traverse(head);
    }

    public void traverse(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode currNode = head;
        ListNode preNode = null;

        while (currNode != null) {
            ListNode newNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = newNode;
        }

        return preNode;
    }

}
