package com.avinashkumarprajapati.datastructure.linkedlist;

import lombok.Data;

public class DLLNode {
    Integer data;
    Node next,prev;
    DLLNode(Integer key){
        this.data=key;
        this.next=null;
        this.prev=null;
    }
}
