package com.avinashkumarprajapati.datastructure.trees;

import com.avinashkumarprajapati.datastructure.trees.models.Node;

public interface TreeOperations {
    Node addNode(Node root, Integer key);
    Node deleteNode(Node root, Integer key);
}
