package LinkedList;

public class InsertionCase {
    public ListNode insertAtBeg(ListNode head, int valToInsert){

        ListNode newNode=new ListNode(valToInsert);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public ListNode insertAtPos(ListNode head, int valToInsert,int pos){
        ListNode newNode =new ListNode(valToInsert);
        ListNode ptr=head;
        for(int i=0;i<pos-1;i++){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
        return head;
    }
    public ListNode insertAtEnd(ListNode head, int valToInsert){
        ListNode newNode=new ListNode(valToInsert);
        ListNode ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
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
        InsertionCase ic=new InsertionCase();
        ListNode head=l1;
        ic.traverse(head);

        System.out.println();
        System.out.println("--inserting node at begining--");
        head=ic.insertAtBeg(head,11);
        ic.traverse(head);

        System.out.println();
        System.out.println("--inserting node at position--");
        head=ic.insertAtBeg(head,44);
        ic.traverse(head);

        System.out.println();
        System.out.println("--inserting node at End--");
        head=ic.insertAtEnd(head,67);
        ic.traverse(head);
    }
}
