package DoubleLinkedList;

public class Node {
    int val;
    Node prev;
    Node next;
    public Node(int val){
        this.val=val;
        prev=null;
        next=null;
    }
    public static void main(String args[]){
        Node l1=new Node(23);
        Node l2=new Node(32);
        Node l3=new Node(64);
        Node l4=new Node(85);

        l1.prev=null;
        l1.next=l2;

        l2.prev=l1;
        l2.next=l3;

        l3.prev=l2;
        l3.next=l4;

        l4.prev=l3;
        l4.next=null;

        Node temp=l1;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();

        Node temp1=l1;
        while(temp1!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
    }
}
