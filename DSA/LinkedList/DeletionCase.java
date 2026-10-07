package LinkedList;

public class DeletionCase {
    public ListNode deleteAtBeg(ListNode head){
        head=head.next;
        return head;
    }
    public ListNode deleteAtPos(ListNode head, int pos){
        ListNode ptr=head;
        for(int i=0;i<pos-1;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        return head;
    }
    public ListNode deleteAtLast(ListNode head){
        ListNode ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
        return head;
    }

    public void traverse(ListNode head){
        ListNode ptr=head;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }
    }

    public static void main(String args[]){
        ListNode l1=new ListNode(56);
        ListNode l2=new ListNode(30);
        ListNode l3=new ListNode(70);
        ListNode l4=new ListNode(20);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=null;

        System.out.println("--normal traverse--");
        DeletionCase dc=new DeletionCase();
        ListNode head=l1;
        dc.traverse(head);

        System.out.println();
        System.out.println("Deletion at Begining");
        head=dc.deleteAtBeg(head);
        dc.traverse(head);

        System.out.println();
        System.out.println("Deletion at Position");
        head=dc.deleteAtPos(head,2);
        dc.traverse(head);


        System.err.println();
        System.out.println("Deletion at End");
        head=dc.deleteAtLast(head);
        dc.traverse(head);


    }
}
