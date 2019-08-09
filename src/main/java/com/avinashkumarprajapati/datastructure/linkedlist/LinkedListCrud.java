package com.avinashkumarprajapati.datastructure.linkedlist;

public interface LinkedListCrud {
    Node addNode(Node head, Integer data);
    Node deleteNode(Node head,Integer data);
    Node updateNode(Node head,Integer data);
    Node displayLinkedList(Node head);
    Node reverseLinkedList(Node head);
    Node reverseLinkedListUsingRecursion(Node head,Node prev);

}
