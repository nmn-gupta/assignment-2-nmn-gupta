/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enQueue(Node newNode) {
        if (getFront() == null && getRear() == null) {
            setFront(newNode);
            setRear(newNode);
            getRear().setNext(getFront());
        } else {
            newNode.setNext(getFront());
            getRear().setNext(newNode);
            setRear(getRear().getNext());
        }
    }

}

