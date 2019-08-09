package com.avinashkumarprajapati.datastructure.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Node {
 Integer data;
 Node next;

   Node(Integer key){
   this.data=key;
   this.next=null;
   }
}