/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.println("Enter the number of nodes:");
        int noOfNodes = sc.nextInt();
        while (noOfNodes-- > 0) {
            System.out.println("Enter the data");
            int val = sc.nextInt();
            TreeNode node = new TreeNode();
            node.setData(val);
            bst.insert(node);
        }
        System.out.println("Pre order traversal : ");
        bst.showTreeData(bst.getRoot());
        System.out.println("Post order traversal : ");
        bst.postOrderTraversal(bst.getRoot());
        System.out.println("First statement is valid but Second is not.");



    }
}
