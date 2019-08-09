package com.avinashkumarprajapati.datastructure.linkedlist;

import java.util.StringJoiner;

public class LinkedListCrudImpl implements LinkedListCrud {
    @Override
    public Node addNode(Node head, Integer data) {
        if(head==null){
            Node temp = new Node(data);
            head=temp;
        }else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = new Node(data);
        }
        return head;
    }

    @Override
    public Node deleteNode(Node head, Integer data) {
        Node current = head;
        if(current==null){
            return null;
        }
       else if(current.data==data){
            System.out.println("successfully deleted from beginning"+data);
            current= current.next;
            head=current;

        }
       else{
            while(current.next!=null){
                    if(current.next.data==data){

                        if(current.next.next==null){
                            System.out.println("successfully deleted from last"+data);
                            current.next=null;
                            break;
                        }else{
                            System.out.println("successfully deleted from middle"+data);
                            current.next= current.next.next;
                            break;
                        }
                    }
                current=current.next;
                }
        }
        return head ;


    }

       @Override
    public Node updateNode(Node head, Integer data) {
        return null;
    }

    @Override
    public Node displayLinkedList(Node head) {
        Node temp =head;
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("[");
        while(temp!=null){
            //System.out.print(head.data+" ");
            stringJoiner.add(""+temp.data);
            temp=temp.next;
        }
        stringJoiner.add("]");
        System.out.println(stringJoiner);
        return head;
    }

    @Override
    public Node reverseLinkedList(Node head) {
       Node prev =null;
       Node current = head;
       Node next;
       while (current!=null){
          next = current.next;
          current.next=prev;
          prev =current;
          current=next;
        //  next.next=current;

       }
       head=prev;
       return prev;

    }

    @Override
    public Node reverseLinkedListUsingRecursion(Node current,Node prev) {
        Node head=current;
        /** Base Case * */
        if(current.next==null){
            head=current;
            current.next=prev;
            return head;
        }
        /*  curr.next node for the recursion */
        Node next1 = current.next;
        /* update next address*/
        current.next = prev;
        head= reverseLinkedListUsingRecursion(next1, current);
        return head;
    }



}
