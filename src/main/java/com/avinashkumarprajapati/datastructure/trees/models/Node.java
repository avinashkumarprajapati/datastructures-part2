package com.avinashkumarprajapati.datastructure.trees.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Node {
   public Integer data;
   public Node left;
   public Node right;
   public Node(Integer key){
        this.data=key;
        this.left=null;
        this.right=null;
    }

}