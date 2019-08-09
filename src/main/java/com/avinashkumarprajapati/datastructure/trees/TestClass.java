package com.avinashkumarprajapati.datastructure.trees;

import com.avinashkumarprajapati.datastructure.trees.models.Node;

public class TestClass {
    public static void main(String[] args) {
        Operations operations = new Operations();
        /// 10, 11, 9, 7,  15,, 8
        int [] array = {10,11, 9, 7,  15, 8};
        Node root =null;
        for (int x : array){
            root = operations.addNode(root, x);
        }
        operations.inOrderTraversal(root);
    }
}
