/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode righttNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRighttNode() {
        return righttNode;
    }

    public void setRighttNode(TreeNode righttNode) {
        this.righttNode = righttNode;
    }

    @Override
    public String toString() {
        return "data --> " + getData();
    }
}
