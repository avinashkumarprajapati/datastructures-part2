package com.avinashkumarprajapati.datastructure.trees;

import com.avinashkumarprajapati.datastructure.trees.models.Node;

public interface Traversals {
    void inOrderTraversal(Node root);
    void postOrderTraversal(Node root) ;
    void preOrderTraversal(Node root) ;
    void levelOrderTraversal(Node root);
}
