package com.avinashkumarprajapati.datastructure.trees;

import com.avinashkumarprajapati.datastructure.trees.models.Node;

/**@author avinash.kumar.prajapati
 * **/
public class Operations implements TreeOperations,Traversals{

    public Node addNode(Node root, Integer key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (root.data > key) {
            root.left = addNode(root.left, key);
        } else if (root.data < key) {
            root.right = addNode(root.right, key);
        }
        return root;
    }

    public  void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }
    }
    public  void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }
    /**
     * @implNote
     *
     * */
    public  void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    /**
     * @implNote Level order traversal of a tree is breadth first traversal for the tree.
     *
     * */
    public  void levelOrderTraversal(Node root) {

    }

}
