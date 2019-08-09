package com.avinashkumarprajapati.datastructure.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedListCrud ll = new LinkedListCrudImpl();
        Node head=null;
        for (int i=0;i<4;i++){
            head= ll.addNode(head,i*i);
        }
        head=  ll.displayLinkedList(head);
       /* head= ll.deleteNode(head,4);
        head= ll.displayLinkedList(head);
        head= ll.deleteNode(head,0);
        head= ll.displayLinkedList(head);
        head= ll.deleteNode(head,81);
        head= ll.displayLinkedList(head);
        head= ll.deleteNode(head,49);*/
        head = ll.reverseLinkedListUsingRecursion(head,null);
        head= ll.displayLinkedList(head);
    }


}
